package com.example.a361_menu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GoodEndPage extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_end);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        String message = getIntent().getStringExtra("message");

        TextView messageTextView = findViewById(R.id.detailEnding);
        if (message != null) {
            messageTextView.setText(message);
        }

        Button btmenu = findViewById(R.id.BackTomenu);
        btmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GoodEndPage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}