package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class retained_earning extends AppCompatActivity {


    TextView netincome;
    TextView subtotal;
    TextView dividends;
    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retained_earning);

        netincome = findViewById(R.id.textView46);
        subtotal = findViewById(R.id.textView48);
        dividends = findViewById(R.id.textView490);
        total = findViewById(R.id.textView50);

        int temp =Integer.parseInt(amount.money.calcProfit());

        int tot = Integer.parseInt(amount.money.getDividends());

        dividends.setText(amount.money.getDividends());

        tot = temp-tot;

        if(Integer.parseInt(amount.money.calcProfit())<0){
            temp*=-1;

            netincome.setText("("+Integer.toString(temp)+")");
            subtotal.setText("("+Integer.toString(temp)+")");
        }
        else if(Integer.parseInt(amount.money.calcProfit())>=0){
            netincome.setText(amount.money.calcProfit());
            subtotal.setText(amount.money.calcProfit());
        }

        if(tot<0){
            tot*=-1;
            total.setText("("+Integer.toString(tot)+")");
        }
        else{
            total.setText(Integer.toString(tot));
        }


    }
}