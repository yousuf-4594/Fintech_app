package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class trail_balance extends AppCompatActivity {


    public static RecyclerView recyclerrr;
    public static List<Trail_bal_Class> bal= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail_balance);

        recyclerrr=findViewById(R.id.recy_view);
        bal.clear();
        if(amount.money.getCash().equals("0")==false)
            bal.add(new Trail_bal_Class("Cash",amount.money.getCash(),"   "));
        if(amount.money.getAc_recievables().equals("0")==false)
            bal.add(new Trail_bal_Class("A/c Receivables",amount.money.getAc_recievables(),"   "));
        if(amount.money.getOffsupp().equals("0")==false)
            bal.add(new Trail_bal_Class("Office Supplies",amount.money.getOffsupp(),"   "));
        if(amount.money.getLand().equals("0")==false)
            bal.add(new Trail_bal_Class("Land",amount.money.getLand(),"   "));
        if(amount.money.getBuilding().equals("0")==false)
            bal.add(new Trail_bal_Class("Building",amount.money.getBuilding(),"   "));
        if(amount.money.getFurniture().equals("0")==false)
            bal.add(new Trail_bal_Class("Furniture",amount.money.getFurniture(),"   "));
        if(amount.money.getEquipment().equals("0")==false)
            bal.add(new Trail_bal_Class("Equipment",amount.money.getEquipment(),"   "));
        if(amount.money.getSneakers().equals("0")==false)
            bal.add(new Trail_bal_Class("Item-Sneakers",amount.money.getSneakers(),"   "));
        if(amount.money.getTrainers().equals("0")==false)
            bal.add(new Trail_bal_Class("Item-Trainers",amount.money.getTrainers(),"   "));
        if(amount.money.getGrippers().equals("0")==false)
            bal.add(new Trail_bal_Class("Item-Grippers",amount.money.getGrippers(),"   "));
        if(amount.money.getCrocs().equals("0")==false)
            bal.add(new Trail_bal_Class("Item-Crocs",amount.money.getCrocs(),"   "));
        if(amount.money.getPrepaidrent().equals("0")==false)
            bal.add(new Trail_bal_Class("Prepaid Rent",amount.money.getPrepaidrent(),"   "));
        if(amount.money.getPrepaidinsurance().equals("0")==false)
            bal.add(new Trail_bal_Class("Prepaid Insurance",amount.money.getPrepaidinsurance(),"   "));

        if(amount.money.getAccpayable().equals("0")==false)
            bal.add(new Trail_bal_Class("Account Payable","   ",amount.money.getAccpayable()));
        if(amount.money.getSuppliespayables().equals("0")==false)
            bal.add(new Trail_bal_Class("Supplies Payable","   ",amount.money.getSuppliespayables()));
        if(amount.money.getUnearnedrevenue().equals("0")==false)
            bal.add(new Trail_bal_Class("Unearned Revenue","   ",amount.money.getUnearnedrevenue()));
        if(amount.money.getAdvertisementpayables().equals("0")==false)
            bal.add(new Trail_bal_Class("Advertisement Payable","   ",amount.money.getAdvertisementpayables()));
        if(amount.money.getEquipmentpayables().equals("0")==false)
            bal.add(new Trail_bal_Class("Equipment Payable","   ",amount.money.getEquipmentpayables()));
        if(amount.money.getInterestpayables().equals("0")==false)
            bal.add(new Trail_bal_Class("Interest Payable","   ",amount.money.getInterestpayables()));
        if(amount.money.getLoanpayables().equals("0")==false)
            bal.add(new Trail_bal_Class("Loan Payable","   ",amount.money.getLoanpayables()));
        if(amount.money.getServicerev().equals("0")==false)
            bal.add(new Trail_bal_Class("Service Revenue","   ",amount.money.getServicerev()));
        if(amount.money.getRentexp().equals("0")==false)
            bal.add(new Trail_bal_Class("Rent Expenses",amount.money.getRentexp(),"   "));
        if(amount.money.getSalexp().equals("0")==false)
            bal.add(new Trail_bal_Class("salaries expenses",amount.money.getSalexp(),"   "));
        if(amount.money.getBillexp().equals("0")==false)
            bal.add(new Trail_bal_Class("Bill Expenses",amount.money.getBillexp(),"   "));
        if(amount.money.getInterestexp().equals("0")==false)
            bal.add(new Trail_bal_Class("Interest Expenses",amount.money.getInterestexp(),"   "));
        if(amount.money.getAdvertexp().equals("0")==false)
            bal.add(new Trail_bal_Class("Advertising Expenses",amount.money.getAdvertexp(),"   "));
        if(amount.money.getInsuranceexp().equals("0")==false)
            bal.add(new Trail_bal_Class("Insurance Expenses",amount.money.getInsuranceexp(),"   "));

        bal.add(new Trail_bal_Class("Total",amount.money.calcDebit(),amount.money.calcCredit()));

        recyclerrr.setLayoutManager(new LinearLayoutManager(this));
        recyclerrr.setAdapter(new Trail_bal_Adapter(getApplicationContext(),bal));
    }
}