package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class owners_equity extends AppCompatActivity {

    TextView netincome;
    TextView subtotal;
    TextView equity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owners_equity);

        netincome = findViewById(R.id.textView460);
        subtotal = findViewById(R.id.textView480);
        equity = findViewById(R.id.textView500);

        if(Integer.parseInt(amount.money.calcProfit())<0){
            int temp =Integer.parseInt(amount.money.calcProfit());
            temp*=-1;

            netincome.setText("("+Integer.toString(temp)+")");
            subtotal.setText("("+Integer.toString(temp)+")");
            equity.setText("("+Integer.toString(temp)+")");
        }
        else if(Integer.parseInt(amount.money.calcProfit())>=0){
            netincome.setText(amount.money.calcProfit());
            subtotal.setText(amount.money.calcProfit());
            equity.setText(amount.money.calcProfit());
        }
    }
}