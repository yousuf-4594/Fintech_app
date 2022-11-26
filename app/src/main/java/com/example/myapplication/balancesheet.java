package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class balancesheet extends AppCompatActivity {

    RecyclerView ass;
    RecyclerView lia;

    List<Trail_bal_Class> asst= new ArrayList<>();
    List<Trail_bal_Class> liab= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balancesheet);

        ass = findViewById(R.id.recyclerView2);
        lia = findViewById(R.id.recyclerView);

        asst.clear();
        liab.clear();


        if(amount.money.getCash().equals("0")==false)
            asst.add(new Trail_bal_Class("Cash",amount.money.getCash(),"   "));
        if(amount.money.getAc_recievables().equals("0")==false)
            asst.add(new Trail_bal_Class("A/c Receivables",amount.money.getAc_recievables(),"   "));
        if(amount.money.getOffsupp().equals("0")==false)
            asst.add(new Trail_bal_Class("Office Supplies",amount.money.getOffsupp(),"   "));
        if(amount.money.getLand().equals("0")==false)
            asst.add(new Trail_bal_Class("Land",amount.money.getLand(),"   "));
        if(amount.money.getBuilding().equals("0")==false)
            asst.add(new Trail_bal_Class("Building",amount.money.getBuilding(),"   "));
        if(amount.money.getFurniture().equals("0")==false)
            asst.add(new Trail_bal_Class("Furniture",amount.money.getFurniture(),"   "));
        if(amount.money.getEquipment().equals("0")==false)
            asst.add(new Trail_bal_Class("Equipment",amount.money.getEquipment(),"   "));
        if(amount.money.getSneakers().equals("0")==false)
            asst.add(new Trail_bal_Class("Item-Sneakers",amount.money.getSneakers(),"   "));
        if(amount.money.getTrainers().equals("0")==false)
            asst.add(new Trail_bal_Class("Item-Trainers",amount.money.getTrainers(),"   "));
        if(amount.money.getGrippers().equals("0")==false)
            asst.add(new Trail_bal_Class("Item-Grippers",amount.money.getGrippers(),"   "));
        if(amount.money.getCrocs().equals("0")==false)
            asst.add(new Trail_bal_Class("Item-Crocs",amount.money.getCrocs(),"   "));
        if(amount.money.getPrepaidrent().equals("0")==false)
            asst.add(new Trail_bal_Class("Prepaid Rent",amount.money.getPrepaidrent(),"   "));
        if(amount.money.getPrepaidinsurance().equals("0")==false)
            asst.add(new Trail_bal_Class("Prepaid Insurance",amount.money.getPrepaidinsurance(),"   "));
        asst.add(new Trail_bal_Class("Total Assets",amount.money.calcAssets(),"    "));

        ass.setLayoutManager(new LinearLayoutManager(this));
        ass.setAdapter(new Trail_bal_Adapter(getApplicationContext(),asst));


        if(amount.money.getAccpayable().equals("0")==false)
            liab.add(new Trail_bal_Class("Account Payable",amount.money.getAccpayable(),"   "));
        if(amount.money.getSuppliespayables().equals("0")==false)
            liab.add(new Trail_bal_Class("Supplies Payable",amount.money.getSuppliespayables(),"   "));
        if(amount.money.getUnearnedrevenue().equals("0")==false)
            liab.add(new Trail_bal_Class("Unearned Revenue",amount.money.getUnearnedrevenue(),"   "));
        if(amount.money.getAdvertisementpayables().equals("0")==false)
            liab.add(new Trail_bal_Class("Advertisement Payable",amount.money.getAdvertisementpayables(),"   "));
        if(amount.money.getEquipmentpayables().equals("0")==false)
            liab.add(new Trail_bal_Class("Equipment Payable",amount.money.getEquipmentpayables(),"   "));
        if(amount.money.getInterestpayables().equals("0")==false)
            liab.add(new Trail_bal_Class("Interest Payable",amount.money.getInterestpayables(),"   "));
        if(amount.money.getLoanpayables().equals("0")==false)
            liab.add(new Trail_bal_Class("Loan Payable",amount.money.getLoanpayables(),"   "));
        liab.add(new Trail_bal_Class("Total Liabilities",amount.money.calcLiabilities(),"   "));


        lia.setLayoutManager(new LinearLayoutManager(this));
        lia.setAdapter(new Trail_bal_Adapter(getApplicationContext(),liab));

    }
}