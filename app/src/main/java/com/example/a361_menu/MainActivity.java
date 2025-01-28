package com.example.a361_menu;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE); // set LANDSCAPE
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Find the button by its ID
        Button btstart = findViewById(R.id.bt_start);

        btstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to navigate to the DialogActivity
                Intent intent = new Intent(MainActivity.this, Dialogpage.class);
                startActivity(intent);  // Start the activity
            }
        });

        Button btexit = findViewById(R.id.bt_exit);

        btexit.setOnClickListener(new View.OnClickListener() {
            private boolean doubleBackToExitPressedOnce = false;

            @Override
            public void onClick(View v) {
                if (doubleBackToExitPressedOnce) {
                    finishAffinity();
                    return;
                }

                this.doubleBackToExitPressedOnce = true;
                Toast.makeText(getApplicationContext(), R.string.exit_app, Toast.LENGTH_SHORT).show();
                v.postDelayed(() -> doubleBackToExitPressedOnce = false, 2000);
            }
        });
    }
}
