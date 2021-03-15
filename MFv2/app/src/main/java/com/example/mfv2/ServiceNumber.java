package com.example.mfv2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

public class ServiceNumber extends AppCompatActivity {
    FirebaseFirestore db;

    EditText serviceNum;
    Button serviceBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        ServiceButton();
    }
    public void ServiceButton(){
        serviceBtn = (Button) findViewById(R.id.serviceButton);
        serviceNum = (EditText) findViewById(R.id.serviceNumber);


        serviceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snum= serviceNum.getText().toString();
                Intent intent=new Intent(ServiceNumber.this,Dashboard.class);
                intent.putExtra("ServiceNumber",snum);
                startActivity(intent);
            }
        });
    }
}