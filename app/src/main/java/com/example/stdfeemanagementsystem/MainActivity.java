package com.example.stdfeemanagementsystem;

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

    public void studentlogin(View view) {
        Intent intent=new Intent(MainActivity.this,StudentLogin.class);
        startActivity(intent);
    }

    public void adminlogin(View view) {
        Intent intent=new Intent(MainActivity.this,AdminLogin.class);
        startActivity(intent);
    }

    public void studentregister(View view) {
        Intent intent=new Intent(MainActivity.this,StudentRegister.class);
        startActivity(intent);
    }

    public void adminregister(View view) {
        Intent intent=new Intent(MainActivity.this,AdminRegister.class);
        startActivity(intent);
    }
}