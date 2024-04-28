package com.example.finalblogapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class addarticle extends AppCompatActivity {

    private ImageButton imageButton;
    private TextView textViewTitle;
    private EditText editTextBlogTitle;
    private TextView textViewDescription;
    private EditText editTextBlogDescription;
    private Button addButton;
    private TextView textViewMessage;
    private TextView textViewArticle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addarticle);

        // Initialize views
        imageButton = findViewById(R.id.imageButton2);
        textViewTitle = findViewById(R.id.textView14);
        editTextBlogTitle = findViewById(R.id.editTextText2);
        textViewDescription = findViewById(R.id.textView16);
        editTextBlogDescription = findViewById(R.id.editTextText3);
        addButton = findViewById(R.id.button);
        textViewMessage = findViewById(R.id.textView17);
        textViewArticle = findViewById(R.id.textView18);

        // Set onClickListener for the add button
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your logic to handle adding a blog here
                String blogTitle = editTextBlogTitle.getText().toString();
                String blogDescription = editTextBlogDescription.getText().toString();
                // Display a message or perform any other action
                textViewMessage.setText("Blog added successfully!");
            }
        });
    }
}

