package com.example.finalblogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignInAndRegistrationActivity extends AppCompatActivity {

    private Button enterEmailButton, enterPasswordButton, emailButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinandregistration);

        // Initialize buttons
        enterEmailButton = findViewById(R.id.button3);
        enterPasswordButton = findViewById(R.id.button4);
        emailButton = findViewById(R.id.button5);
        registerButton = findViewById(R.id.button6);

        // Set onClickListener for the enter email button
        enterEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle enter email button click
                // You can implement functionality to enter email here
            }
        });

        // Set onClickListener for the enter password button
        enterPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle enter password button click
                // You can implement functionality to enter password here
            }
        });

        // Set onClickListener for the email button
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle email button click
                // You can implement functionality related to email login here
            }
        });

        // Set onClickListener for the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle register button click
                // You can start the registration activity here
                startActivity(new Intent(SignInAndRegistrationActivity.this, RegisterActivity.class));
            }
        });
    }
}
