package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pdf extends MainActivity {

    Button trailbal;
    Button taccounts;
    Button balancesheet;
    Button incomestatement;
    Button retainedearning;
    Button ownersequity;

    ImageButton cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        cancel = findViewById(R.id.cancel);

        trailbal = findViewById(R.id.button);
        taccounts = findViewById(R.id.button3);
        balancesheet = findViewById(R.id.button8);
        incomestatement = findViewById(R.id.button7);
        retainedearning = findViewById(R.id.button4);
        ownersequity = findViewById(R.id.button6);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.no_animation, R.anim.slide_down);
            }
        });
        trailbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(pdf.this,trail_balance.class);
                startActivity(intentt);
            }
        });
        taccounts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        balancesheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(pdf.this,balancesheet.class);
                startActivity(intentt);
            }
        });
        incomestatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentt = new Intent(pdf.this,income_statement.class);
                startActivity(intentt);
            }
        });
        retainedearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ownersequity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}