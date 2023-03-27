package com.example.pilldashboard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;

public class ReminderActivity extends AppCompatActivity {

    LocalDate myObj = LocalDate.now();  // Create a date object
    TextView textViewDateToday;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicine_time);

        textViewDateToday = findViewById(R.id.dateToday);


        textViewDateToday.setText(myObj.toString());





    }
}

