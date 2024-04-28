package com.example.finalblogapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000; // Splash screen timeout duration in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Using a Handler to delay the execution of the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity after the timeout
                Intent intent = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(intent);
                finish(); // Close the current activity
            }
        }, SPLASH_TIMEOUT);
    }
}
