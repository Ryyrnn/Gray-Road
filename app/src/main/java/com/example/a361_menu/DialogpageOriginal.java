//package com.example.a361_menu;
//
//import android.content.Intent;
//import android.content.pm.ActivityInfo;
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.WindowManager;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class Dialogpage extends AppCompatActivity {
//
//    // Array
//    private int Index = 0;
//    private String[] word;
//    private boolean isOptionSelected = false;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_page1);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        // อ้างอิง TextView และ Button
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView textView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        ImageButton opt1 =findViewById(R.id.option1);
//        ImageButton opt2 =findViewById(R.id.option2);
//        TextView opt1Text = findViewById(R.id.option1Text);
//        TextView opt2Text = findViewById(R.id.option2Text);
//
//        String s1   = getString(R.string.s1);       String s1_d  = getString(R.string.s1_d);
//        String w   = getString(R.string.w);
//        String w1   = getString(R.string.w1);       String w2    = getString(R.string.w2);
//        String w3   = getString(R.string.w3);       String w4    = getString(R.string.w4);
//        String w5   = getString(R.string.w5);       String w6    = getString(R.string.w6);
//        String w7   = getString(R.string.w7);       String w8    = getString(R.string.w8);
//        String w9   = getString(R.string.w9);       String w10   = getString(R.string.w10);
//        String w11  = getString(R.string.w11);      String w12   = getString(R.string.w12);
//        String s3   = getString(R.string.s3);       String s3_d  = getString(R.string.s3_d);
//
//
//        String c1_s4   = getString(R.string.c1_s4);       String c1_w1  = getString(R.string.c1_w1);
//        String c1_w2   = getString(R.string.c1_w2);       String c1_w3  = getString(R.string.c1_w3);
//        String c1_w4   = getString(R.string.c1_w4);       String c1_w5  = getString(R.string.c1_w5);
//        String c1_s5   = getString(R.string.c1_s5);       String c1_s6  = getString(R.string.c1_s6);
//        String c1_w6   = getString(R.string.c1_w6);       String c1_w7  = getString(R.string.c1_w7);
//        String c1_w8   = getString(R.string.c1_w8);       String c1_w9  = getString(R.string.c1_w9);
//        String c1_w10  = getString(R.string.c1_w10);      String c1_w11 = getString(R.string.c1_w11);
//        String c1_w12  = getString(R.string.c1_w12);      String c1_w13 = getString(R.string.c1_w13);
//        String c1_s7   = getString(R.string.c1_s7);       String c1_w14 = getString(R.string.c1_w14);
//        String c1_w15  = getString(R.string.c1_w15);      String c1_w14_1 = getString(R.string.c1_w14_1);
//        String c1_w14_2 = getString(R.string.c1_w14_2);   String c1_w14_3 = getString(R.string.c1_w14_3);
//        String c1_w14_4 = getString(R.string.c1_w14_4);   String c1_s9  = getString(R.string.c1_s9);
//        String c1_s9_d = getString(R.string.c1_s9_d);
//
//        String c2_s11 = getString(R.string.c2_s11);       String c2_w1  = getString(R.string.c2_w1);
//        String c2_w2  = getString(R.string.c2_w2);       String c2_w3  = getString(R.string.c2_w3);
//        String c2_s12 = getString(R.string.c2_s12);       String c2_w4  = getString(R.string.c2_w4);
//        String c2_w5  = getString(R.string.c2_w5);       String c2_w6  = getString(R.string.c2_w6);
//        String c2_s13 = getString(R.string.c2_s13);       String c2_s13_d = getString(R.string.c2_s13_d);
//        String c2_w7  = getString(R.string.c2_w7);       String c2_w8  = getString(R.string.c2_w8);
//        String c2_s14 = getString(R.string.c2_s14);       String c2_s14_d = getString(R.string.c2_s14_d);
//        String c2_w9  = getString(R.string.c2_w9);       String c2_w10 = getString(R.string.c2_w10);
//        String c2_w11 = getString(R.string.c2_w11);       String c2_w9_a = getString(R.string.c2_w9_a);
//        String c2_w10_1  = getString(R.string.c2_w10_1);       String c2_w10_2  = getString(R.string.c2_w10_2);
//        String c2_w10_3  = getString(R.string.c2_w10_3);       String c2_w10_4  = getString(R.string.c2_w10_4);
//        String c2_w10_5  = getString(R.string.c2_w10_5);       String c2_w10_6  = getString(R.string.c2_w10_6);
//        String c2_w10_7  = getString(R.string.c2_w10_7);       String c2_w10_8  = getString(R.string.c2_w10_8);
//        String c2_w10_9  = getString(R.string.c2_w10_9);       String c2_w10_10 = getString(R.string.c2_w10_10);
//        String hide = getString(R.string.hide);             String hide2 = getString(R.string.hide2);
//
//        String c3_s16   = getString(R.string.c3_s16);       String c3_s16_d  = getString(R.string.c3_s16_d);
//        String c3_w1    = getString(R.string.c3_w1);       String c3_w2     = getString(R.string.c3_w2);
//        String c3_w3    = getString(R.string.c3_w3);       String c3_s17    = getString(R.string.c3_s17);
//        String c3_w4    = getString(R.string.c3_w4);       String c3_w5     = getString(R.string.c3_w5);
//        String c3_w6    = getString(R.string.c3_w6);       String c3_s18    = getString(R.string.c3_s18);
//        String c3_w7    = getString(R.string.c3_w7);       String c3_w8     = getString(R.string.c3_w8);
//        String c3_w9    = getString(R.string.c3_w9);       String c3_s19    = getString(R.string.c3_s19);
//        String c3_w10   = getString(R.string.c3_w10);      String c3_w11    = getString(R.string.c3_w11);
//        String c3_w12   = getString(R.string.c3_w12);      String c3_w13    = getString(R.string.c3_w13);
//        String c3_w14   = getString(R.string.c3_w14);      String c3_w15    = getString(R.string.c3_w15);
//        String c3_w16   = getString(R.string.c3_w16);      String c3_w17    = getString(R.string.c3_w17);
//        String c3_w16_1 = getString(R.string.c3_w16_1);    String c3_w16_2  = getString(R.string.c3_w16_2);
//        String c3_w16_3 = getString(R.string.c3_w16_3);    String c3_w16_4  = getString(R.string.c3_w16_4);
//        String end_A1   = getString(R.string.end_A1);      String end_A1_1   = getString(R.string.end_A1_1);
//        String c1_w9_1   = getString(R.string.c1_w9_a);
//        String c2_w10_7_a  = getString(R.string.c2_w10_7_a);
//
//        //array
//        word = new String[]{w,w1, w2, w3, w4, w5,s3_d/*6*/, w6, w7, w8, w9, w10, w11, w12,
//                //chapter1
//                c1_w1/*14*/, c1_w2, c1_w3, c1_w4, c1_w5/*18*/, c1_w6/*19*/,
//                c1_w7/*20*/, c1_w10/*21*/, c1_w11, c1_w12, c1_w13, c1_w14/*25*/,c1_w14_1, c1_w14_2, c1_w14_3, c1_w14_4,c1_s9_d/*30*/,
//
//                //chapter2
//                c2_w1/*31*/,c2_w2,c2_w3,c2_w4/*34*/,c2_w5,c2_w6,c2_w7/*37*/,c2_w8,c2_s14_d/*39*/,hide/*40*/,hide2/*41*/,c2_w10_1,c2_w10_2,c2_w10_3,
//                c2_w10_4, c2_w10_5,c2_w10_6/*47*/,c2_w10_9,c2_w10_10,
//
//                //chapter3
//                c3_s16_d/*50*/,  c3_w1, c3_w2, c3_w3, c3_w4/*54*/, c3_w5, c3_w6, c3_w7/*57*/, c3_w8, c3_w9,
//                c3_w10/*60*/, c3_w11, c3_w12, c3_w13, c3_w14, c3_w15/*65*/,c3_w16_1,c3_w16_2,c3_w16_3,c3_w16_4,end_A1,end_A1_1
//        };
//
//        // เซ็ตข้อความเริ่มต้น
//        textView.setText(s1);
//        detailTextView.setText(s1_d);
//        optionButton.setVisibility(View.GONE);
//
//        changeTextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setVisibility(View.GONE);
//                isOptionSelected = true;
//                // ตั้งค่าข้อความใหม่จาก messages array โดยใช้ currentIndex
//                detailTextView.setText(word[Index]);
//                Index++;
//                if (detailTextView.getText().toString().equals(word[6])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(s3);
//                } else if (detailTextView.getText().toString().equals(word[14])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c1_s4);
//                } else if (detailTextView.getText().toString().equals(word[19])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c1_s5);
//                } else if (detailTextView.getText().toString().equals(word[20])) { //ไปห้องน้ำหรือประตูหลัง
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c1_s6);
//                    detailTextView.setText(c1_w7);
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c1_w8);
//                    opt2Text .setText(c1_w9);
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            detailTextView.setText(c1_w9_1);
//                        }
//                    });
//                } else if (detailTextView.getText().toString().equals(word[25])) { //สำรวจหรือไม่สำรวจห้องน้ำ
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c1_s7);
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c1_w14);
//                    opt2Text .setText(c1_w15);
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            Intent intent = new Intent(Dialogpage.this, Dialogpage_NosearchToilet.class);
//                            startActivity(intent);
//                        }
//                    });
//                } else if (detailTextView.getText().toString().equals(word[30])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c1_s9);
//                } else if (detailTextView.getText().toString().equals(word[31])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c2_s11);
//                } else if (detailTextView.getText().toString().equals(word[34])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c2_s12);
//                } else if (detailTextView.getText().toString().equals(word[37])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c2_s13);
//                } else if (detailTextView.getText().toString().equals(word[39])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c2_s14);
//                } else if (detailTextView.getText().toString().equals(word[40])) { //ตู้เต่าบินหรือหลับหลังเพื่อน
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c2_w9_a);
//                    opt2Text .setText(c2_w9);
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            detailTextView.setText("Game Over");
//                        }
//                    });
//                } else if (detailTextView.getText().toString().equals(word[41])) { //เต้หรือปื๊ด
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c2_w11); //เต้
//                    opt2Text .setText(c2_w10);//ปื้ด
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            Intent intent = new Intent(Dialogpage.this, Dialogpage_RootB.class);
//                            startActivity(intent);  // Start the activity
//                        }
//                    });
//                } else if (detailTextView.getText().toString().equals(word[47])) { //ใช้ไอเทอมหรือไม่ใช้
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c2_w10_7);
//                    opt2Text .setText(c2_w10_8);
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            detailTextView.setText(c2_w10_7_a);
//                        }
//                    });
//                } else if (detailTextView.getText().toString().equals(word[50])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c3_s16);
//                } else if (detailTextView.getText().toString().equals(word[54])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c3_s17);
//                } else if (detailTextView.getText().toString().equals(word[57])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c3_s18);
//                } else if (detailTextView.getText().toString().equals(word[60])) {
//                    textView.setVisibility(View.VISIBLE);
//                    textView.setText(c3_s19);
//                } else if (detailTextView.getText().toString().equals(word[65])) {
//                    optionButton.setVisibility(View.VISIBLE);
//                    opt1Text .setText(c3_w17);//เสียตัว
//                    opt2Text .setText(c3_w16);//ไม่เสียตัว
//
//                    opt1.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            optionButton.setVisibility(View.GONE);
//                            textView.setVisibility(View.GONE);
//                            detailTextView.setText(word[Index]);
//                        }
//                    });
//
//                    opt2.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            isOptionSelected = true;
//                            textView.setVisibility(View.GONE);
//                            optionButton.setVisibility(View.GONE);
//                            Intent intent = new Intent(Dialogpage.this, Dialogpage_RootA1_bad.class);
//                            startActivity(intent);  // Start the activity
//                        }
//                    });
//                }
//            }
//        });
//    }
//}