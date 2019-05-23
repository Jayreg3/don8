package com.example.don8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    private TextView profile_name;
    private TextView company_id;
    private TextView num_donations;
    private TextView donation_value;
    private ProgressBar progressBar;

    private Button liability_laws;
    private Button contact_us;
    private TextView liability_link_one;
    private TextView liability_link_two;
    private TextView liability_link_three;
    private TextView liability_header_one;
    private TextView liability_header_two;
    private TextView liability_header_three;
    private TextView contact_number;
    private Boolean isInvisible = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        profile_name = findViewById(R.id.profile_name);
        company_id = findViewById(R.id.company_id);
        contact_us = findViewById(R.id.contact_us);
        donation_value = findViewById(R.id.donation_value);
        progressBar = findViewById(R.id.progressBar);
        liability_laws = findViewById(R.id.liability_laws);
        contact_us = findViewById(R.id.contact_us);

        liability_link_one = findViewById(R.id.liability_link_one);
        liability_link_two = findViewById(R.id.liability_link_two);
        liability_link_three = findViewById(R.id.liability_link_three);
        liability_header_one = findViewById(R.id.liability_header_one);
        liability_header_two = findViewById(R.id.liability_header_two);
        liability_header_three = findViewById(R.id.liability_header_three);
        contact_number = findViewById(R.id.contact_number);

        liability_laws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(liability_link_one.getVisibility() == View.INVISIBLE){
                    liability_link_one.setVisibility(View.VISIBLE);
                    liability_link_two.setVisibility(View.VISIBLE);
                    liability_link_three.setVisibility(View.VISIBLE);
                    liability_header_one.setVisibility(View.VISIBLE);
                    liability_header_two.setVisibility(View.VISIBLE);
                    liability_header_three.setVisibility(View.VISIBLE);
                    isInvisible=false;
                }
                else{
                    liability_link_one.setVisibility(View.INVISIBLE);
                    liability_link_two.setVisibility(View.INVISIBLE);
                    liability_link_three.setVisibility(View.INVISIBLE);
                    liability_header_one.setVisibility(View.INVISIBLE);
                    liability_header_two.setVisibility(View.INVISIBLE);
                    liability_header_three.setVisibility(View.INVISIBLE);
                    isInvisible=true;
                }
            }
        });

    }

}
