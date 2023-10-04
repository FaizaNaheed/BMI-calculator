package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaleBMI extends AppCompatActivity {
    EditText wEd,hed;
    Double BMI,wkg,h,wp;
    TextView bmiTv;
    Button calBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_bmi);
        getSupportActionBar().hide();
        wEd = findViewById(R.id.w);
        hed = findViewById(R.id.h);
        calBtn = findViewById(R.id.calulate);
        bmiTv = findViewById(R.id.bmi);
    }
    public void CalculateBMI(View view)
    {
        wkg=Double.valueOf(wEd.getText().toString() );
        h=Double.valueOf(hed.getText().toString());
        wp= wkg/0.45359237;
        BMI=(wp*(h*h))*703;
        bmiTv.setText(""+BMI);
    }
}