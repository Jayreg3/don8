package com.example.don8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    private TextView profile_name;
    private TextView num_donations;
    private TextView donation_value;
    private ProgressBar progressBar;

    private Button liability_laws;
    private Button contact_us;
    private TextView liability_link_one;
    private TextView liability_link_two;
    private TextView liability_link_three;
    private TextView contact_number;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        profile_name = findViewById(R.id.profile_name);
        contact_us = findViewById(R.id.contact_us);
        donation_value = findViewById(R.id.donation_value);
        progressBar = findViewById(R.id.progressBar);
        liability_laws = findViewById(R.id.liability_laws);
        contact_us = findViewById(R.id.contact_us);

        liability_link_one = findViewById(R.id.liability_link_one);
        liability_link_one = findViewById(R.id.liability_link_two);
        liability_link_three = findViewById(R.id.liability_link_three);
        contact_number = findViewById(R.id.contact_number);


    }

    
}
