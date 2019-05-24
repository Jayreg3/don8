package com.example.don8;

//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
//import android.widget.ImageView;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//
//import java.io.InputStream;

public class ConfirmationActivity extends AppCompatActivity {
//    private DatabaseReference mDatabase;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
//        mDatabase = FirebaseDatabase.getInstance().getReference();
//
//        Bitmap image = getIntent().getExtras().getParcelable("image");
//        Intent confirmationIntent = new Intent(ConfirmationActivity.this, CharityActivity.class);
//        startActivity(confirmationIntent);

        send = findViewById(R.id.send_donation_button);
        send.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(ConfirmationActivity.this, CharityActivity.class);
                startActivity(profileIntent);
            }
        }));
    }
}
