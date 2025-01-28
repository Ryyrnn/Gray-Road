//package com.example.a361_menu;
//
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//import android.view.ViewGroup;
//import android.util.TypedValue;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//public class Dialogpage_RootA1_bad extends AppCompatActivity {
//
//    private int Index = 0;
//    private String[] word;
//    private boolean isOptionSelected = false;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_page3);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView TextView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        Button opt1 =findViewById(R.id.option1);
//        Button opt2 =findViewById(R.id.option2);
//
//        String c3_w17_1 = getString(R.string.c3_w17_1);
//        String c3_w17_2 = getString(R.string.c3_w17_2);
//        String c3_w17_3 = getString(R.string.c3_w17_3);
//        String c3_w17_4 = getString(R.string.end_A1_bad);
//
//        word=new String[]{ c3_w17_1,c3_w17_2,c3_w17_3,c3_w17_4};
//
//
//        ViewGroup.LayoutParams params = detailTextView.getLayoutParams(); // แก้เป็น ViewGroup.LayoutParams
//        if (params instanceof ViewGroup.MarginLayoutParams) {  // ตรวจสอบว่า params เป็น MarginLayoutParams หรือไม่
//            ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) params;
//            marginParams.topMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
//            detailTextView.setLayoutParams(marginParams);  // ตั้งค่ากลับ
//        }
//
//        TextView.setVisibility(View.GONE);
//        detailTextView.setText(c3_w17_1);
//        optionButton.setVisibility(View.GONE);
//
//        changeTextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                isOptionSelected = true;
//                detailTextView.setText(word[Index]);
//                Index++;
//            }
//        });
//    }
//}