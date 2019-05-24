package com.example.don8;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private ProgressBar load;
    private FirebaseAuth firebaseAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // says which screen to display on launch
        firebaseAuth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        load = findViewById(R.id.loading);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputtedEmail = email.getText().toString().trim();
                String inputtedPassword = password.getText().toString();

                load.setVisibility(View.VISIBLE);
                setAllEnabled(false);

                firebaseAuth.signInWithEmailAndPassword(inputtedEmail, inputtedPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = firebaseAuth.getCurrentUser();
                            Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();

                            Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                            startActivity(profileIntent);
                        } else {
                            Toast.makeText(LoginActivity.this, "Login error", Toast.LENGTH_SHORT);
                        }
                    }
                });
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        if (firebaseAuth.getCurrentUser() != null) {
            FirebaseUser user = firebaseAuth.getCurrentUser();
            Toast.makeText(LoginActivity.this, "Logging in...", Toast.LENGTH_SHORT);

            Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);
            startActivity(profileIntent);
        }
    }


    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String inputtedUsername = email.getText().toString().trim();
            String inputtedPassword = password.getText().toString();

            boolean enableButton = !inputtedUsername.isEmpty() && !inputtedPassword.isEmpty();
            login.setEnabled(enableButton);
        }

        @Override
        public void afterTextChanged(Editable editable) { }
    };



    private void setAllEnabled(boolean enable) {
        email.setEnabled(enable);
        password.setEnabled(enable);
        login.setEnabled(enable);
    }
}
