package com.example.a361_menu;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a361_menu.R;

import java.util.Objects;

public class MinigameTap extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView scoreText;
    private TextView countdownText;
    private ImageView startMessage;// ตัวแปรสำหรับข้อความเริ่มต้น
    private int progress = 0;
    private final Handler handler = new Handler();
    private int timeRemaining = 10; // เวลานับถอยหลังเริ่มต้น
    private boolean gameOver = false; // ตัวแปรเช็คว่าเกมจบหรือยัง
    private boolean gameStarted = false; // ตัวแปรเช็คว่าเกมเริ่มแล้ว

    private boolean doubleBackToExitPressedOnce = false;

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            // Proceed with your desired action
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, R.string.exit_app, Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(() -> doubleBackToExitPressedOnce = false, 2000);
    }

    @SuppressLint({"ClickableViewAccessibility", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minigame_tap);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);

        // เชื่อมต่อ UI
        progressBar = findViewById(R.id.progressBar);
        scoreText = findViewById(R.id.scoreText);
        countdownText = findViewById(R.id.countdownText);
        startMessage = findViewById(R.id.startMessage);
        FrameLayout mainLayout = findViewById(R.id.mainLayout);

        ImageView fightingImage = findViewById(R.id.fightingImage);

        ObjectAnimator shakeAnimator = ObjectAnimator.ofFloat(fightingImage, "translationX", -20f, 20f);
        shakeAnimator.setDuration(100); // Time for one shake (in ms)
        shakeAnimator.setRepeatMode(ValueAnimator.REVERSE);
        shakeAnimator.setRepeatCount(ValueAnimator.INFINITE);
        shakeAnimator.setInterpolator(new LinearInterpolator());

        // ตั้งค่าข้อความเริ่มต้นและหน่วงเวลา 3 วินาทีก่อนเริ่มเกม
        startMessage.setVisibility(TextView.VISIBLE); // แสดงข้อความ
        handler.postDelayed(() -> {
            startMessage.setVisibility(TextView.GONE); // ซ่อนข้อความเมื่อครบ 3 วินาที
            gameStarted = true; // เริ่มเกม
            startCountdown(); // เริ่มนับถอยหลัง
            shakeAnimator.start();
        }, 3000);

        // ตั้งค่า OnTouchListener
        mainLayout.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN && !gameOver && gameStarted) {
                if (progress < 100) {
                    progress += 5; // เพิ่ม progress 5 ต่อการกด
                    progressBar.setProgress(progress);
                    scoreText.setText("Progress: " + progress + "%");
                }

                // ตรวจสอบว่าชนะหรือไม่
                if (progress >= 100) {
                    gameOver = true;
                    scoreText.setText("You Win!");
                    scoreText.setVisibility(View.INVISIBLE);
                    startMessage.setImageResource(R.drawable.youwin);
                    startMessage.setVisibility(ImageView.VISIBLE);
                    Intent intent;
                    if(Objects.equals(getIntent().getStringExtra("nextPage"), "page5")){
                        intent = new Intent(MinigameTap.this, dialog_page5.class);
                    }else if(Objects.equals(getIntent().getStringExtra("nextPage"), "page6")){
                        intent = new Intent(MinigameTap.this, dialog_page6.class);
                    }else{
                        intent = null;
                    }
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity(intent);
                }
            }
            return true; // ให้ OnTouchListener รับ Event นี้
        });

        // ลด progress เมื่อเวลาผ่านไป
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progress > 0 && !gameOver && gameStarted) {
                    progress -= 2; // ลด progress
                    progressBar.setProgress(progress);
                    scoreText.setText("Progress: " + progress + "%");
                }
                if (!gameOver) {
                    handler.postDelayed(this, 100); // ลดทุกๆ 100ms
                }
            }
        }, 100);
    }

    // ฟังก์ชันเริ่มต้นการนับถอยหลัง
    private void startCountdown() {
        handler.postDelayed(new Runnable() {
            @SuppressLint("SetTextI18n")
            @Override
            public void run() {
                if (timeRemaining > 0 && !gameOver) {
                    timeRemaining--; // ลดเวลา
                    countdownText.setText("Time: " + timeRemaining + "s"); // แสดงเวลาที่เหลือ
                    handler.postDelayed(this, 1000); // อัปเดตทุก 1 วินาที
                } else {
                    if (!gameOver) {
                        countdownText.setText("Time's Up!"); // เมื่อหมดเวลา
                        scoreText.setText("Game Over!");
                        gameOver = true; // สิ้นสุดเกม
                        scoreText.setVisibility(View.INVISIBLE);
                        startMessage.setImageResource(R.drawable.youlose); // เปลี่ยนภาพใน startMessage เป็น youwin.png
                        startMessage.setVisibility(ImageView.VISIBLE); // แสดงภาพ
                        Intent gameOverIntent = new Intent(MinigameTap.this, GameOverPage.class);
                        gameOverIntent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                        String message = getString(R.string.c2_w10_7_a);
                        gameOverIntent.putExtra("message", message);
                        startActivity(gameOverIntent);
                    }
                }
            }
        }, 1000); // เริ่มต้นที่ 1 วินาที
    }
}
