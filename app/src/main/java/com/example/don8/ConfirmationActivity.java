package com.example.don8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.InputStream;

public class ConfirmationActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        Bitmap image = getIntent().getExtras().getParcelable("image");

        ImageView tv1;
        tv1= (ImageView) findViewById(R.id.image);
        InputStream si1 = asset.open("image/" + cat_arr1[i] + ".png");
        Bitmap bitmap1 = BitmapFactory.decodeStream(si1);
        tv1.setImageBitmap(bitmap1);
    }
}
