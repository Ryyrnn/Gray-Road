package com.example.a361_menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WireConnectionView extends View {
    private Paint paint;
    private Paint pointPaint;
    private Path path;
    private float startX, startY, endX, endY;
    private boolean isDragging = false;
    private List<ColoredPoint> startPoints;
    private List<ColoredPoint> endPoints;
    private List<ConnectedLine> connectedLines;
    private int selectedStartIndex = -1;
    private final int[] COLORS_LEFT = {Color.MAGENTA,Color.GREEN, Color.WHITE, Color.CYAN, Color.BLUE, Color.GRAY, Color.RED, Color.YELLOW};
    private final int[] COLORS_RIGHT = {Color.GREEN, Color.YELLOW, Color.BLUE, Color.CYAN, Color.RED, Color.MAGENTA, Color.GRAY, Color.WHITE};
    private Bitmap backgroundImage;

    public WireConnectionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStrokeWidth(20f);
        paint.setStyle(Paint.Style.STROKE);

        pointPaint = new Paint();
        pointPaint.setStyle(Paint.Style.FILL);
        pointPaint.setStrokeWidth(20f);

        path = new Path();
        startPoints = new ArrayList<>();
        endPoints = new ArrayList<>();
        connectedLines = new ArrayList<>(); // ลิสต์ที่เก็บสายที่เชื่อมต่อถูกต้องแล้ว
        backgroundImage = BitmapFactory.decodeResource(getResources(), R.drawable.wiring_task); // เปลี่ยนให้ตรงกับชื่อไฟล์
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int viewWidth = getWidth();
        int viewHeight = getHeight();

        float aspectRatioImage = (float) backgroundImage.getWidth() / backgroundImage.getHeight();
        float aspectRatioView = (float) viewWidth / viewHeight;

        int scaledWidth, scaledHeight;
        if (aspectRatioImage > aspectRatioView) {
            scaledWidth = viewWidth;
            scaledHeight = (int) (viewWidth / aspectRatioImage);
        } else {
            scaledHeight = viewHeight;
            scaledWidth = (int) (viewHeight * aspectRatioImage);
        }

        int xOffset = (viewWidth - scaledWidth) / 2;
        int yOffset = (viewHeight - scaledHeight) / 2;

        Bitmap scaledBackground = Bitmap.createScaledBitmap(backgroundImage, scaledWidth, scaledHeight, true);
        canvas.drawBitmap(scaledBackground, xOffset, yOffset, null);
        generatePoints(xOffset, yOffset, scaledWidth, scaledHeight);

        for (ColoredPoint point : startPoints) {
            pointPaint.setColor(point.color);
            canvas.drawCircle(point.x, point.y, 20, pointPaint);
        }
        for (ColoredPoint point : endPoints) {
            pointPaint.setColor(point.color);
            canvas.drawCircle(point.x, point.y, 20, pointPaint);
        }

        for (ConnectedLine line : connectedLines) {
            paint.setColor(line.color);
            canvas.drawLine(line.startX, line.startY, line.endX, line.endY, paint);
        }

        if (isDragging) {
            paint.setColor(getColorForLine(selectedStartIndex));
            canvas.drawLine(startX, startY, endX, endY, paint);
        }
    }

    private void generatePoints(int xOffset, int yOffset, int scaledWidth, int scaledHeight) {
        startPoints.clear();
        endPoints.clear();

        // ใช้สัดส่วนตำแหน่งจุดสัมพันธ์กับภาพพื้นหลัง
        float leftBaseX = xOffset + (0.09f * scaledWidth);
        float rightBaseX = xOffset + (0.85f * scaledWidth);
        float baseY = yOffset + (0.09f * scaledHeight);
        float gapY = 0.119f * scaledHeight;

        for (int i = 0; i < COLORS_LEFT.length; i++) {
            startPoints.add(new ColoredPoint(leftBaseX, baseY + i * gapY, COLORS_LEFT[i]));
            endPoints.add(new ColoredPoint(rightBaseX, baseY + i * gapY, COLORS_RIGHT[i]));
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // ตรวจสอบว่าผู้เล่นเริ่มจากจุดต้นสาย
                for (int i = 0; i < startPoints.size(); i++) {
                    ColoredPoint point = startPoints.get(i);
                    if (isTouchNearPoint(event.getX(), event.getY(), point)) {
                        selectedStartIndex = i;
                        startX = point.x;
                        startY = point.y;
                        isDragging = true;
                        invalidate();
                        return true;
                    }
                }
                break;

            case MotionEvent.ACTION_MOVE:
                if (isDragging) {
                    endX = event.getX();
                    endY = event.getY();
                    invalidate();
                    return true;
                }
                break;

            case MotionEvent.ACTION_UP:
                if (isDragging) {
                    for (ColoredPoint point : endPoints) {
                        if (isTouchNearPoint(event.getX(), event.getY(), point)) {
                            if (isColorMatching(selectedStartIndex, point.color)) {
                                connectedLines.add(new ConnectedLine(startX, startY, point.x, point.y, point.color));
                                checkWinCondition();
                            }
                            break;
                        }
                    }
                    isDragging = false;
                    invalidate();
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    private boolean isTouchNearPoint(float touchX, float touchY, ColoredPoint point) {
        return Math.abs(touchX - point.x) < 50 && Math.abs(touchY - point.y) < 50;
    }

    private boolean isColorMatching(int startIndex, int endColor) {
        return startIndex >= 0 && startIndex < startPoints.size() && startPoints.get(startIndex).color == endColor;
    }

    private int getColorForLine(int index) {
        return index >= 0 && index < startPoints.size() ? startPoints.get(index).color : Color.BLACK;
    }

    private void checkWinCondition() {
        if (connectedLines.size() == COLORS_LEFT.length) {
            Toast.makeText(getContext(), "You Win!", Toast.LENGTH_SHORT).show();
        }
    }

    private static class ColoredPoint {
        float x, y;
        int color;

        ColoredPoint(float x, float y, int color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    private static class ConnectedLine {
        float startX, startY, endX, endY;
        int color;

        ConnectedLine(float startX, float startY, float endX, float endY, int color) {
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
            this.color = color;
        }
    }
}