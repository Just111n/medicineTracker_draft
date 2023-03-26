package com.example.pilldashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonMedicineTime;
    Button buttonScanMedicine;
    Button buttonPrescriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMedicineTime=findViewById(R.id.buttonMedicineTime);
        buttonScanMedicine=findViewById(R.id.buttonScanMedicine);
        buttonPrescriptions=findViewById(R.id.buttonprescriptions);



        buttonMedicineTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Log.d("button","buttonMedicineTime is clicked!");
            }
        });

        buttonScanMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button","buttonScanMedicine is clicked!");
            }
        });

        buttonPrescriptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("button","buttonPrescriptions is clicked!");
            }
        });
    }
}