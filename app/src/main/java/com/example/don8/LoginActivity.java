package com.example.don8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private ProgressBar load;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login); // says which screen to display on launch

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        load = findViewById(R.id.loading);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputtedUsername = email.getText().toString().trim();
                String inputtedPassword = password.getText().toString();

                load.setVisibility(View.VISIBLE);
                setAllEnabled(false);
            }
        });
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
