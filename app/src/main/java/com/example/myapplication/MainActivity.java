package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button increaseBtn, decreaseBtn;
    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increaseBtn = findViewById(R.id.increaseBtn);
        decreaseBtn = findViewById(R.id.decreaseBtn);
        countText = findViewById(R.id.textCount);


        increaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(String.valueOf(countText.getText()));
                currentNumber++;
                changeColor(currentNumber);
                String num = currentNumber+"";
                countText.setText(num);
            }
        });

        decreaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentNumber = Integer.parseInt(String.valueOf(countText.getText()));
                currentNumber--;
                changeColor(currentNumber);
                String num = currentNumber+"";
                countText.setText(num);
            }
        });
    }
    private void changeColor(int currentNumber){
        if(currentNumber < 0){
            countText.setTextColor(ContextCompat.getColor(this,R.color.red));
        }else if(currentNumber > 10){
            countText.setTextColor(ContextCompat.getColor(this,R.color.purple_200));
        }else{
            countText.setTextColor(ContextCompat.getColor(this,R.color.black));
        }
    }

}