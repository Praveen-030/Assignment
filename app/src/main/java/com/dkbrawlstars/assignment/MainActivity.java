package com.dkbrawlstars.assignment;

import static com.dkbrawlstars.assignment.R.drawable.custom_btn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btn1 ,btn2,btn3,btn4,btn5,btn6,btn7,btn8,saveExplore;
    EditText etstatus;
    Spinner spinner;
    SeekBar distance;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        saveExplore = findViewById(R.id.saveExploreButton);
        etstatus = findViewById(R.id.statusEditText);
        spinner = findViewById(R.id.availabilitySpinner);
        distance = findViewById(R.id.distanceSeekBar);
        back = findViewById(R.id.arrow_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,My_main_file.class);
                startActivity(intent);
            }
        });

        String hint = "Hi community I am open to new connection ";
        etstatus.setText(hint);
        etstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etstatus.getText();

            }
        });



    }
}