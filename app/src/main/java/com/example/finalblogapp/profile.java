package com.example.finalblogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    private TextView addArticleTextView;
    private TextView yourArticlesTextView;
    private TextView logoutTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize TextViews
        addArticleTextView = findViewById(R.id.textView4);
        yourArticlesTextView = findViewById(R.id.textView5);
        logoutTextView = findViewById(R.id.textView6);

        // Set click listeners
        addArticleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add new article logic here
            }
        });

        yourArticlesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your articles logic here
            }
        });

        logoutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logout logic here
            }
        });
    }
}
