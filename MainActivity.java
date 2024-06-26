package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton, signUpButton; // Declare signUpButton
    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        welcomeText = findViewById(R.id.welcomeText);
        signUpButton = findViewById(R.id.signUpButton); // Initialize signUpButton

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if username and password match your criteria
                if (isValidCredentials()) {
                    // Update the welcome text or navigate to a new page
                    welcomeText.setText("Welcome, " + usernameEditText.getText().toString() + "!");

                    // Intent to start SignUpActivity
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                } else {
                    // Show an error message or handle invalid credentials
                    welcomeText.setText("Invalid credentials. Please try again.");
                }
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start SignUpActivity when the "New ? Sign up ?" button is clicked
                Intent intent = new Intent(MainActivity.this, Signup_Activity.class);
                startActivity(intent);
            }
        });
    }

    private boolean isValidCredentials() {
        // Replace these strings with your actual criteria
        String validUsername = "user123";
        String validPassword = "pass123";

        String enteredUsername = usernameEditText.getText().toString().trim();
        String enteredPassword = passwordEditText.getText().toString().trim();

        return enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword);
    }
}
