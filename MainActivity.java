package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button FirstButton = findViewById(R.id.button1);
        FirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),FirstActivity.class);
                startActivity(intent);
            }
        });

        Button SecondButton = findViewById(R.id.button2);
        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),SecondActivity.class);
                startActivity(intent);
            }
        });

        Button ThirdButton = findViewById(R.id.button3);
        ThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),db.class);
                startActivity(intent);
            }
        });
    }
}