package com.example.pilldashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonMedicineTime;
    Button buttonScanMedicine;
    Button buttonPrescriptions;
    Account mainAccount;
    TextView textViewFullName;
    TextView textViewWelcomeMessage;
    public final static String ACCOUNT_KEY = "ACCOUNT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();

        buttonMedicineTime=findViewById(R.id.buttonMedicineTime);
        buttonScanMedicine=findViewById(R.id.buttonScanMedicine);
        buttonPrescriptions=findViewById(R.id.buttonprescriptions);

        textViewFullName=findViewById(R.id.textViewFullName);
        textViewWelcomeMessage=findViewById(R.id.textViewWelcomeMessage);

        mainAccount = new Account("Justin","Looi");

        String firstName = mainAccount.getFirstName();
        String lastName = mainAccount.getLastName();

        String fullName = firstName + " " + lastName;

        String welcomeMessage = String.format(res.getString(R.string.welcome_message), firstName);

        textViewFullName.setText(fullName);
        textViewWelcomeMessage.setText(welcomeMessage);







        buttonMedicineTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Log.d("button","buttonMedicineTime is clicked!");
                Intent intent = new Intent( MainActivity.this,
                        ReminderActivity.class);

                startActivity(intent);
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