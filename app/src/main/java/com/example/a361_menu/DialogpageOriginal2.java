//package com.example.a361_menu;
//
//import android.content.Intent;
//import android.content.pm.ActivityInfo;
//import android.graphics.drawable.Drawable;
//import android.os.Bundle;
//import android.util.TypedValue;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.WindowManager;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class Dialogpage extends AppCompatActivity {
//
//    private int Index = 0;
//    List<Map<String, Object>> dialogues = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_page1);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView textView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        ImageButton opt1 =findViewById(R.id.option1);
//        ImageButton opt2 =findViewById(R.id.option2);
//        TextView opt1Text = findViewById(R.id.option1Text);
//        TextView opt2Text = findViewById(R.id.option2Text);
//        View blackScreen = findViewById(R.id.blackScreen);
//        ImageView charImageView1 = findViewById(R.id.characterImage1);
//        ImageView charImageView2 = findViewById(R.id.characterImage2);
//        ImageView backgroundView = findViewById(R.id.background);
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
////        //array
////        word = new String[]{w,w1, w2, w3, w4, w5,s3_d/*6*/, w6, w7, w8, w9, w10, w11, w12,
////                //chapter1
////                c1_w1/*14*/, c1_w2, c1_w3, c1_w4, c1_w5/*18*/, c1_w6/*19*/,
////                c1_w7/*20*/, c1_w10/*21*/, c1_w11, c1_w12, c1_w13, c1_w14/*25*/,c1_w14_1, c1_w14_2, c1_w14_3, c1_w14_4,c1_s9_d/*30*/,
////
////                //chapter2
////                c2_w1/*31*/,c2_w2,c2_w3,c2_w4/*34*/,c2_w5,c2_w6,c2_w7/*37*/,c2_w8,c2_s14_d/*39*/,hide/*40*/,hide2/*41*/,c2_w10_1,c2_w10_2,c2_w10_3,
////                c2_w10_4, c2_w10_5,c2_w10_6/*47*/,c2_w10_9,c2_w10_10,
////
////                //chapter3
////                c3_s16_d/*50*/,  c3_w1, c3_w2, c3_w3, c3_w4/*54*/, c3_w5, c3_w6, c3_w7/*57*/, c3_w8, c3_w9,
////                c3_w10/*60*/, c3_w11, c3_w12, c3_w13, c3_w14, c3_w15/*65*/,c3_w16_1,c3_w16_2,c3_w16_3,c3_w16_4,end_A1,end_A1_1
////        };
//
//        // เซ็ตข้อความเริ่มต้น
//        textView.setText(s1);
//        detailTextView.setText(s1_d);
//        charImageView1.setImageResource(R.drawable.empty);
//        charImageView2.setImageResource(R.drawable.empty);
//        optionButton.setVisibility(View.GONE);
//
//        // Set button click listener to handle the changes and options
//        changeTextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setVisibility(View.GONE);
//
//                // Use the optimized updateDialogue function to handle text updates and options
//                if (Index == 1) {
//                    updateDialogue(w, null, null, "nextWord", null, 0,  R.drawable.pued_normal);
//                } else if (Index == 2) {
//                    updateDialogue(w1, null, null, "nextWord", null, R.drawable.mc_normal, 0);
//                } else if (Index == 3) {
//                    updateDialogue(w2, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 4) {
//                    updateDialogue(w3, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 5) {
//                    updateDialogue(w4, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 6) {
//                    updateDialogue(w5, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 7) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 8) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 9) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 10) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 11) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 12) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 13) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 14) {
//                    updateDialogue(s3, s3_d, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 15) {
//                    updateDialogue(c1_s4, c1_w1, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 20) {
//                    updateDialogue(c1_s5, c1_w5, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 21) { // ไปห้องน้ำหรือประตูหลัง
//                    updateDialogue(c1_s6, c1_w8, c1_w9, "nextWord", "gameOver", 0, 0);
//                } else if (Index == 26) { // สำรวจหรือไม่สำรวจห้องน้ำ
//                    updateDialogue(c1_s7, c1_w14, c1_w15, "nextWord", "startNewActivity", 0, 0);
//                } else if (Index == 31) {
//                    updateDialogue(c1_s9, c1_w14_1, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 32) {
//                    updateDialogue(c2_s11, c2_w1, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 35) {
//                    updateDialogue(c2_s12, c2_w4, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 38) {
//                    updateDialogue(c2_s13, c2_w7, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 40) {
//                    updateDialogue(c2_s14, c2_w9_a, c2_w9, "nextWord", "gameOver", 0, 0);
//                } else if (Index == 42) { // เต้หรือปื๊ด
//                    updateDialogue(c2_w11, c2_w10, null, null, "nextWord", "startNewActivity", 0, 0);
//                } else if (Index == 48) { // ใช้ไอเทอมหรือไม่ใช้
//                    updateDialogue(c2_w10_7, c2_w10_8, null, null, "nextWord", "gameOver", 0, 0);
//                } else if (Index == 51) {
//                    updateDialogue(c3_s16, c3_w1, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 55) {
//                    updateDialogue(c3_s17, c3_w5, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 58) {
//                    updateDialogue(c3_s18, c3_w7, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 61) {
//                    updateDialogue(c3_s19, c3_w10, null, null, "nextWord", null, 0, 0);
//                } else if (Index == 66) {
//                    updateDialogue(c3_w17, c3_w16, null, null, "nextWord", "startNewActivity", 0, 0);
//                }
//            }
//        });
//
//    }
//
//    private void updateDialogue(String details, String option1Text, String option2Text, String option1Action, String option2Action, int charImage1Path, int charImage2Path) {
//        TextView detailTextView = findViewById(R.id.detail);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        ImageButton opt1 = findViewById(R.id.option1);
//        ImageButton opt2 = findViewById(R.id.option2);
//        TextView opt1Text = findViewById(R.id.option1Text);
//        TextView opt2Text = findViewById(R.id.option2Text);
//        View blackScreen = findViewById(R.id.blackScreen);
//        ImageView charImageView1 = findViewById(R.id.characterImage1);
//        ImageView charImageView2 = findViewById(R.id.characterImage2);
//
//        // Update character images
//        if (charImage1Path != 0) {
//            charImageView1.setImageResource(charImage1Path);
//        }
//
//        if (charImage2Path != 0) {
//            charImageView2.setImageResource(charImage2Path);
//        }
//
//        detailTextView.setVisibility(View.VISIBLE);
//        detailTextView.setText(details);
//
//        if (option1Text == null  && option2Text == null) {
//            optionButton.setVisibility(View.GONE);
//            changeTextButton.setVisibility(View.VISIBLE);
//        } else {
//            optionButton.setVisibility(View.VISIBLE);
//            changeTextButton.setVisibility(View.GONE);
//            blackScreen.setVisibility(View.VISIBLE);
//
//            if (option1Text != null) {
//                opt1Text.setText(option1Text);
//                opt1.setVisibility(View.VISIBLE);
//            } else {
//                opt1.setVisibility(View.GONE);
//            }
//
//            if (option2Text != null) {
//                opt2Text.setText(option2Text);
//                opt2.setVisibility(View.VISIBLE);
//            } else {
//                opt2.setVisibility(View.GONE);
//            }
//
//            opt1.setOnClickListener(v -> {
//                optionButton.setVisibility(View.GONE);
//                detailTextView.setVisibility(View.GONE);
//                changeTextButton.setVisibility(View.VISIBLE);
//                blackScreen.setVisibility(View.GONE);
//                handleOptionAction(option1Action);
//            });
//
//            opt2.setOnClickListener(v -> {
//                optionButton.setVisibility(View.GONE);
//                detailTextView.setVisibility(View.GONE);
//                changeTextButton.setVisibility(View.VISIBLE);
//                blackScreen.setVisibility(View.GONE);
//                handleOptionAction(option2Action);
//            });
//        }
//    }
//
//    private void updateDialogue(String text,String details , String option1Text, String option2Text, String option1Action, String option2Action, int charImage1Path, int charImage2Path) {
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView textView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        ImageButton opt1 = findViewById(R.id.option1);
//        ImageButton opt2 = findViewById(R.id.option2);
//        TextView opt1Text = findViewById(R.id.option1Text);
//        TextView opt2Text = findViewById(R.id.option2Text);
//        View blackScreen = findViewById(R.id.blackScreen);
//        ImageView charImageView1 = findViewById(R.id.characterImage1);
//        ImageView charImageView2 = findViewById(R.id.characterImage2);
//
//        // Update character images
//        if (charImage1Path != 0) {
//            charImageView1.setImageResource(charImage1Path);
//        }
//
//        if (charImage2Path != 0) {
//            charImageView2.setImageResource(charImage2Path);
//        }
//
//        textView.setVisibility(View.VISIBLE);
//        detailTextView.setText(details);
//        textView.setText(text);
//
//        if (option1Text == null  && option2Text == null) {
//            optionButton.setVisibility(View.GONE);
//            changeTextButton.setVisibility(View.VISIBLE);
//        } else {
//            optionButton.setVisibility(View.VISIBLE);
//            changeTextButton.setVisibility(View.GONE);
//            blackScreen.setVisibility(View.VISIBLE);
//
//            if (option1Text != null) {
//                opt1Text.setText(option1Text);
//                opt1.setVisibility(View.VISIBLE);
//            } else {
//                opt1.setVisibility(View.GONE);
//            }
//
//            if (option2Text != null) {
//                opt2Text.setText(option2Text);
//                opt2.setVisibility(View.VISIBLE);
//            } else {
//                opt2.setVisibility(View.GONE);
//            }
//
//            opt1.setOnClickListener(v -> {
//                optionButton.setVisibility(View.GONE);
//                textView.setVisibility(View.GONE);
//                detailTextView.setVisibility(View.GONE);
//                changeTextButton.setVisibility(View.VISIBLE);
//                blackScreen.setVisibility(View.GONE);
//                handleOptionAction(option1Action);
//            });
//
//            opt2.setOnClickListener(v -> {
//                optionButton.setVisibility(View.GONE);
//                textView.setVisibility(View.GONE);
//                detailTextView.setVisibility(View.GONE);
//                changeTextButton.setVisibility(View.VISIBLE);
//                blackScreen.setVisibility(View.GONE);
//                handleOptionAction(option2Action);
//            });
//        }
//    }
//
//    private void handleOptionAction(String action) {
//        switch (action) {
//            case "nextWord":
//                Index++;
//                break;
//            case "gameOver":
//                Intent gameOverIntent = new Intent(Dialogpage.this, GameOverPage.class);
//                startActivity(gameOverIntent);
//                break;
//            case "startNewActivity":
//                Intent intent = new Intent(Dialogpage.this, Dialogpage_RootB.class);
//                startActivity(intent);
//                break;
//            case "showToiletSearch":
//                Intent toiletIntent = new Intent(Dialogpage.this, Dialogpage_NosearchToilet.class);
//                startActivity(toiletIntent);
//                break;
//            default:
//                break;
//        }
//    }
//}