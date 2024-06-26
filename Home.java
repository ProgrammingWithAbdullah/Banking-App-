// src/main/java/com/example/myapplication/Home.java
package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView balanceTextView;
    private Button accountOverviewButton, accountSummaryButton, upcomingAlertsButton, customerSupportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        balanceTextView = findViewById(R.id.balanceTextView);
        accountOverviewButton = findViewById(R.id.accountOverviewButton);
        accountSummaryButton = findViewById(R.id.accountSummaryButton);
        upcomingAlertsButton = findViewById(R.id.upcomingAlertsButton);
        customerSupportButton = findViewById(R.id.customerSupportButton);

        accountOverviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Account Overview button
            }
        });

        accountSummaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Account Summary button
            }
        });

        upcomingAlertsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Upcoming Alerts button
            }
        });

        customerSupportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click for Customer Support button
            }
        });

        // Add initialization for other components as needed
    }
}
