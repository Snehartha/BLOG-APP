package com.example.finalblogapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class editarticle extends AppCompatActivity {

    private EditText blogTitleEditText;
    private EditText blogDescriptionEditText;
    private Button saveBlogButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editarticle);

        // Initialize views
        blogTitleEditText = findViewById(R.id.editTextText3);
        blogDescriptionEditText = findViewById(R.id.editTextText3);
        saveBlogButton = findViewById(R.id.button);

        // Set click listener for the save button
        saveBlogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle save blog button click
                saveBlog();
            }
        });
    }

    private void saveBlog() {
        // Get the text from the EditText fields
        String blogTitle = blogTitleEditText.getText().toString().trim();
        String blogDescription = blogDescriptionEditText.getText().toString().trim();

        // Validate if blog title and description are not empty
        if (!blogTitle.isEmpty() && !blogDescription.isEmpty()) {
            // Perform save operation here, such as updating the blog in the database or sending it to a server
            // You can implement your logic to save the blog here

            // After saving, you might want to show a message or navigate back to the previous screen
            // For example:
            // Toast.makeText(this, "Blog saved successfully", Toast.LENGTH_SHORT).show();
            // finish(); // Finish the activity to return to the previous screen
        } else {
            // If either blog title or description is empty, show an error message
            if (blogTitle.isEmpty()) {
                blogTitleEditText.setError("Blog title cannot be empty");
            }
            if (blogDescription.isEmpty()) {
                blogDescriptionEditText.setError("Blog description cannot be empty");
            }
        }
    }
}
