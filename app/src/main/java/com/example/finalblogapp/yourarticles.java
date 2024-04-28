package com.example.finalblogapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class yourarticles extends AppCompatActivity {

    private TextView textViewTitle1, textViewTitle2, textViewContent1, textViewContent2;
    private EditText editTextDate1, editTextDate2;
    private Button buttonReadMore1, buttonReadMore2, buttonEdit1, buttonEdit2, buttonDelete1, buttonDelete2;
    private ImageButton imageButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourarticles);

        // Initialize views
        textViewTitle1 = findViewById(R.id.textView);
        textViewTitle2 = findViewById(R.id.textView8);
        textViewContent1 = findViewById(R.id.editTextTextMultiLine);
        textViewContent2 = findViewById(R.id.editTextTextMultiLine2);
        editTextDate1 = findViewById(R.id.editTextText2);
        editTextDate2 = findViewById(R.id.editTextText3);
        buttonReadMore1 = findViewById(R.id.button2);
        buttonReadMore2 = findViewById(R.id.button9);
        buttonEdit1 = findViewById(R.id.button7);
        buttonEdit2 = findViewById(R.id.button10);
        buttonDelete1 = findViewById(R.id.button8);
        buttonDelete2 = findViewById(R.id.button11);
        imageButtonBack = findViewById(R.id.imageButton);

        // Set onClickListener for the back button
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle back button click here
                finish(); // Close the activity
            }
        });

        // Set onClickListener for the read more buttons
        buttonReadMore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle read more button 1 click here
                // You can navigate to another activity or perform any other action
            }
        });

        buttonReadMore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle read more button 2 click here
                // You can navigate to another activity or perform any other action
            }
        });

        // Set onClickListener for the edit buttons
        buttonEdit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle edit button 1 click here
                // You can navigate to an edit activity or perform any other action
            }
        });

        buttonEdit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle edit button 2 click here
                // You can navigate to an edit activity or perform any other action
            }
        });

        // Set onClickListener for the delete buttons
        buttonDelete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle delete button 1 click here
                // You can prompt a confirmation dialog and delete the item if confirmed
            }
        });

        buttonDelete2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle delete button 2 click here
                // You can prompt a confirmation dialog and delete the item if confirmed
            }
        });
    }
}
