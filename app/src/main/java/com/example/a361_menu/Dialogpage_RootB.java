//package com.example.a361_menu;
//
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class Dialogpage_RootB extends AppCompatActivity {
//
//
//    private int Index = 0;
//    private String[] word;
//    private boolean isOptionSelected = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_page2_root_b);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView TextView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        Button opt1 =findViewById(R.id.option1);
//        Button opt2 =findViewById(R.id.option2);
//
//        String B_w1 = getString(R.string.B_w1);     String B_w2 = getString(R.string.B_w2);
//        String B_w3 = getString(R.string.B_w3);     String B_w4 = getString(R.string.B_w4);
//        String B_w5 = getString(R.string.B_w5);     String B_w6 = getString(R.string.B_w6);
//        String B_w7 = getString(R.string.B_w7);     String B_w8 = getString(R.string.B_w8);
//        String B_s16 = getString(R.string.B_s16);   String B_s16_d = getString(R.string.B_s16_d);
//        String B_w9 = getString(R.string.B_w9);     String B_w10 = getString(R.string.B_w10);
//        String B_w11 = getString(R.string.B_w11);   String B_s17 = getString(R.string.B_s17);
//        String B_w12 = getString(R.string.B_w12);   String B_w13 = getString(R.string.B_w13);
//        String B_w14 = getString(R.string.B_w14);   String B_w15 = getString(R.string.B_w15);
//        String B_w16 = getString(R.string.B_w16);   String B_w17 = getString(R.string.B_w17);
//        String B_w18 = getString(R.string.B_w18);   String B_w19 = getString(R.string.B_w19);
//        String B_w20 = getString(R.string.B_w20);   String B_w21 = getString(R.string.B_w21);
//        String B_w22 = getString(R.string.B_w22);   String B_w23 = getString(R.string.B_w23);
//        String B_w24 = getString(R.string.B_w24);   String B_w25 = getString(R.string.B_w25);
//        String B_w26 = getString(R.string.B_w26);   String ena_B = getString(R.string.ena_B);
//        String c2_w10_7 = getString(R.string.c2_w10_7);   String c2_w10_8 = getString(R.string.c2_w10_8);
//        String c2_w10_7_a  = getString(R.string.c2_w10_7_a);
//        String B_w19_1  = getString(R.string.B_w19_1);  String B_w19_2  = getString(R.string.B_w19_2);
//
//
//        word=new String[]{B_w1,B_w2,B_w3,B_w4,B_w5,B_w6/*5*/,B_w7,B_w8,B_s16_d/*8*/,B_w9,B_w10,B_w11,B_w12/*12*/,
//                B_w13,B_w14, B_w15,B_w16, B_w17/*17*/,B_w20,B_w21,B_w22,B_w23,B_w24,B_w25,B_w26,ena_B};
//
//        TextView.setVisibility(View.GONE);
//        optionButton.setVisibility(View.GONE);
//        ViewGroup.LayoutParams params = detailTextView.getLayoutParams(); // แก้เป็น ViewGroup.LayoutParams
//
//        if (params instanceof ViewGroup.MarginLayoutParams) {  // ตรวจสอบว่า params เป็น MarginLayoutParams หรือไม่
//            ViewGroup.MarginLayoutParams marginParams = (ViewGroup.MarginLayoutParams) params;
//            marginParams.topMargin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
//            detailTextView.setLayoutParams(marginParams);  // ตั้งค่ากลับ
//        }
//
//        changeTextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView.setVisibility(View.GONE);
//                isOptionSelected = true;
//                // ตั้งค่าข้อความใหม่จาก messages array โดยใช้ currentIndex
//                detailTextView.setText(word[Index]);
//                Index++;
//                if (detailTextView.getText().toString().equals(word[5])) {
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1.setText(c2_w10_7);//ใช้ไอเทม
//                    opt2.setText(c2_w10_8);//ไม่ใช้ไอเทม
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            TextView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            TextView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            detailTextView.setText(c2_w10_7_a);
//                        }
//                    });
//                }else if (detailTextView.getText().toString().equals(word[8])) {
//                    TextView.setVisibility(View.VISIBLE);
//                    TextView.setText(B_s16);
//                } else if (detailTextView.getText().toString().equals(word[12])) {
//                    TextView.setVisibility(View.VISIBLE);
//                    TextView.setText(B_s17);
//                }else if (detailTextView.getText().toString().equals(word[17])) {
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1.setText(B_w19);//ใช้กุญแจปลอม
//                    opt2.setText(B_w18);//ไม่ใช้กุญแจปลอม
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            TextView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            // ซ่อน optionButton
//                            optionButton.setVisibility(View.GONE);
//                            // แสดงข้อความ B_w19_1
//                            detailTextView.setText(B_w19_1);
//
//                            // เมื่อคลิก changeTextButton ครั้งแรก
//                            changeTextButton.setOnClickListener(new View.OnClickListener() {
//                                @Override
//                                public void onClick(View view) {
//                                    // เปลี่ยนข้อความเป็น B_w19_2
//                                    detailTextView.setText(B_w19_2);
//
//                                    // เมื่อคลิก changeTextButton ครั้งที่สอง
//                                    changeTextButton.setOnClickListener(new View.OnClickListener() {
//                                        @Override
//                                        public void onClick(View view) {
//                                            // อัพเดตข้อความเป็น word[20] หรือคำในอาเรย์ถัดไป
//                                            detailTextView.setText(word[Index]);
//                                            Index++;
//                                        }
//                                    });
//                                }
//                            });
//                        }
//                    });
//
//                }
//            }
//        });
//
//    }
//}