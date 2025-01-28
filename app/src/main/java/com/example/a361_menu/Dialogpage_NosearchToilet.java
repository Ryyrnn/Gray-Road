//package com.example.a361_menu;
//
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
//public class Dialogpage_NosearchToilet extends AppCompatActivity {
//
//    private int Index = 0;
//    private String[] word;
//    private boolean isOptionSelected = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dialog_nosearch_toilet);
//
//        TextView detailTextView = findViewById(R.id.detail);
//        TextView TextView = findViewById(R.id.text);
//        Button changeTextButton = findViewById(R.id.changeTextButton);
//        LinearLayout optionButton = findViewById(R.id.dialogOptions);
//        Button opt1 =findViewById(R.id.option1);
//        Button opt2 =findViewById(R.id.option2);
//
//        String c1_w15_1 = getString(R.string.c1_w15_1);
//        String c1_w15_2 = getString(R.string.c1_w15_2);
//        String c1_w15_3 = getString(R.string.c1_w15_3);
//
//        word=new String[]{ c1_w15_1,c1_w15_2,c1_w15_3};
//
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
//        detailTextView.setText(c1_w15_1);
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
//
//    }
