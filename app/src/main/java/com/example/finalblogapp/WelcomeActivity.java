package com.example.finalblogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    private Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Initialize buttons
        loginButton = findViewById(R.id.button);
        registerButton = findViewById(R.id.button2);

        // Set onClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                // You can start the login activity here
                startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
            }
        });

        // Set onClickListener for the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle register button click
                // You can start the register activity here
                startActivity(new Intent(WelcomeActivity.this, RegisterActivity.class));
            }
        });
    }
}
