// src/main/java/com/example/myapplication/Signup_Activity.java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup_Activity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button signupButton;
    private TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signupButton = findViewById(R.id.loginButton);  // Assuming you have a button with this ID in activity_signup.xml

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if username and password match your criteria
                if (isValidCredentials()) {
                    // Intent to start another activity if needed
                    // For now, let's assume you want to go back to MainActivity
                    Intent intent = new Intent(Signup_Activity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Show an error message or handle invalid credentials
                }
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
