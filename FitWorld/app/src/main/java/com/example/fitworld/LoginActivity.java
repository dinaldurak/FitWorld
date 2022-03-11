package com.example.fitworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    Button login,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);
        exit = findViewById(R.id.btnExit);

        login.setOnClickListener(v -> {
            loginButtonClicked();
        });


        exit.setOnClickListener(v -> {
            exitButtonClicked();
        });
    }

    public void loginButtonClicked(){
        if (email.getText().toString().length()<5){
            email.setError("E-postanız en az 5 karakter olmalıdır.");
        }
        if (password.getText().toString().length()<5){
            password.setError("Şifreniz en az 5 karakter olmalıdır.");
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText()).matches()){
            email.setError("Geçerli bir E-Posta adresi giriniz.");
        }


    }

    public void exitButtonClicked(){
        finish();

    }




}