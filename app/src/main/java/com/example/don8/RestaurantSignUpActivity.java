package com.example.don8;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthActionCodeException;
import com.google.firebase.auth.FirebaseAuthEmailException;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestaurantSignUpActivity extends AppCompatActivity {

    private static final String TAG = RestaurantSignUpActivity.class.getSimpleName();
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText phoneNumber;
    private EditText address;
    private EditText city;
    private EditText state;
    private EditText zipCode;
    private CheckBox veggies;
    private CheckBox fruit;
    private CheckBox grains;
    private CheckBox cans;
    private CheckBox meals;
    private RadioGroup dropOff;
    private RadioButton yes;
    private RadioButton no;
    private Button create;

    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();


        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        phoneNumber = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        zipCode = findViewById(R.id.zip_code);
        veggies = findViewById(R.id.veggies);
        fruit = findViewById(R.id.fruit);
        grains = findViewById(R.id.grains);
        cans = findViewById(R.id.canned_goods);
        meals = findViewById(R.id.meals);
        dropOff = findViewById(R.id.drop_off_radio);
        yes = findViewById(R.id.yes_button);
        no = findViewById(R.id.no_button);
        create = findViewById(R.id.create_profile);

        create.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("CLICKED");
                String inputtedEmail = email.getText().toString().trim();
                String inputtedPassword = password.getText().toString();

//                firebaseAuth.createUserWithEmailAndPassword(inputtedEmail, inputtedPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            FirebaseUser user = firebaseAuth.getCurrentUser();
//                            Toast.makeText(RestaurantSignUpActivity.this, "User created successfully", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(RestaurantSignUpActivity.this, "Couldn't create user", Toast.LENGTH_SHORT);
//                        }
//                    }
//                });

                //make okhttpclient object
                OkHttpClient client = new OkHttpClient();

                // Initialize a new Request
                Request request = new Request.Builder()
                        .url("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=feeding%20america&inputtype=textquery&fields=id,name,icon,formatted_address,geometry,types&key=AIzaSyCGVC5nczigiEZMugTnssESOHXT6P6GQMQ")
                        .build();

                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        // Do something when request failed
                        e.printStackTrace();
                        Log.d(TAG, "Request Failed.");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        if (!response.isSuccessful()) {
                            throw new IOException("Error : " + response);
                        } else {
                            Log.d(TAG, "Request Successful.");
                        }

                        // Read data in the worker thread
                        final String data = response.body().string();
                        try {

                            JSONObject coords_json = new JSONObject(data);
                            System.out.println(coords_json);
                            //get the values of the json
//                            JSONObject candidates  = coords_json.getJSONObject("candidates");
//                            geometry = candidates.getString("geometry");
//                            System.out.println(geometry);


                        } catch (Throwable t) {
                            Log.e("My App", "Could not parse malformed JSON: \"" + data + "\"");
                        }


//                        // Display the requested data on UI in main thread
//                        mActivity.runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                // Display requested url data as string into text view
//                                mTextView.setText(data);
//                            }
//                        });
                    }
                });
            }
        });
    }
}

