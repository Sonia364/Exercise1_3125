package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText height = findViewById(R.id.height);
        EditText weight = findViewById(R.id.weight);
        Button  calculateBtn = findViewById(R.id.calculate);

        calculateBtn.setOnClickListener(
                view -> {
                    double heightVal = Double.parseDouble(height.getText().toString());
                    double weightVal = Double.parseDouble(weight.getText().toString());
                    double BMIValue  =  weightVal / (heightVal * heightVal);
                    Toast.makeText(this, "The Body Mass Index (BMI) is " + String.format("%.2f", BMIValue), Toast.LENGTH_LONG).show();
                }
        );

    }

}