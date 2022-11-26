package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class income_statement extends AppCompatActivity {




    RecyclerView rv1;
    RecyclerView rv2;

    List<Trail_bal_Class> rev= new ArrayList<>();
    List<Trail_bal_Class> exp= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_statement);


        rv1 = findViewById(R.id.rv3);
        rv2 = findViewById(R.id.rv4);

        if(amount.money.getServicerev().equals("0")==false)
            rev.add(new Trail_bal_Class("Service Revenue",amount.money.getServicerev(),"   "));

        rev.add(new Trail_bal_Class("Total Revenue",amount.money.getServicerev(),"   "));

        if(amount.money.getRentexp().equals("0")==false)
            exp.add(new Trail_bal_Class("Rent Expenses",amount.money.getRentexp(),"   "));
        if(amount.money.getSalexp().equals("0")==false)
            exp.add(new Trail_bal_Class("salaries expenses",amount.money.getSalexp(),"   "));
        if(amount.money.getBillexp().equals("0")==false)
            exp.add(new Trail_bal_Class("Bill Expenses",amount.money.getBillexp(),"   "));
        if(amount.money.getInterestexp().equals("0")==false)
            exp.add(new Trail_bal_Class("Interest Expenses",amount.money.getInterestexp(),"   "));
        if(amount.money.getAdvertexp().equals("0")==false)
            exp.add(new Trail_bal_Class("Advertising Expenses",amount.money.getAdvertexp(),"   "));
        if(amount.money.getInsuranceexp().equals("0")==false)
            exp.add(new Trail_bal_Class("Insurance Expenses",amount.money.getInsuranceexp(),"   "));
        exp.add(new Trail_bal_Class("Total Expenses",amount.money.calcExpenses(),"   "));

        exp.add(new Trail_bal_Class("","",""));

        if(Integer.parseInt(amount.money.calcProfit())<0){
            int temp =Integer.parseInt(amount.money.calcProfit());
            temp*=-1;
            exp.add(new Trail_bal_Class("Net Loss",Integer.toString(temp),"   "));
        }
        else if(Integer.parseInt(amount.money.calcProfit())>=0)
            exp.add(new Trail_bal_Class("Net Profit",amount.money.calcProfit(),"   "));

        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv1.setAdapter(new Trail_bal_Adapter(getApplicationContext(),rev));

        rv2.setLayoutManager(new LinearLayoutManager(this));
        rv2.setAdapter(new Trail_bal_Adapter(getApplicationContext(),exp));

    }
}