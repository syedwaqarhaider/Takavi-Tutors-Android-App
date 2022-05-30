package com.example.takavi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLoginPage(View view) {
        Intent it= new Intent(this, Login.class);
        startActivity(it);
    }

    public void showSignUpPage(View view) {
        Intent it= new Intent(this, Signup.class);
        startActivity(it);
    }
}