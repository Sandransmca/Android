package com.example.facebooklayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText postInput;
    private TextView postContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure the XML is named activity_main.xml

        // Link UI elements
        postInput = findViewById(R.id.postInput);
        postContent = findViewById(R.id.postContent);

        // Optional: Show a message
        Toast.makeText(this, "Welcome to Facebook Clone", Toast.LENGTH_SHORT).show();
    }

    // This can be connected to a post button (if added)
    public void submitPost(View view) {
        String content = postInput.getText().toString().trim();

        if (!content.isEmpty()) {
            postContent.setText(content); // Show the user's post in the static post section
            postInput.setText("");        // Clear the input field
            Toast.makeText(this, "Post submitted!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please write something", Toast.LENGTH_SHORT).show();
        }
    }
}
