package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton revenue;
    ImageButton expenses;
    ImageButton assets;
    ImageButton liabilities;
    ImageButton cashbook;
    ImageButton report;

    public static TextView BALANCE;
    public static TextView PROFIT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        revenue = findViewById(R.id.imageView5);
        expenses = findViewById(R.id.imageView7);
        assets = findViewById(R.id.imageView6);
        liabilities = findViewById(R.id.imageView4);
        cashbook = findViewById(R.id.imageButton);
        report = findViewById(R.id.imageButton2);

        BALANCE = findViewById(R.id.textView21);
        PROFIT = findViewById(R.id.textView30);

//        PROFIT.setText(amount.money.calcProfit());
//        ASSET.setText(amount.money.calcAssets());
//        LIAB.setText(amount.money.calcLiabilities());;
//        EXP.setText(amount.money.calcExpenses());
//        REV.setText(amount.money.calcRevenue());

        revenue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,amount.class);
                String message = "revenue";
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });
        expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,amount.class);
                String message = "expenses";
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });
        assets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,amount.class);
                String message = "assets";
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });
        liabilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,amount.class);
                String message = "liabilities";
                intent.putExtra("message",message);
                startActivity(intent);
            }
        });
        cashbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,General_journal.class);
                startActivity(intent);
            }
        });
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,pdf.class));
                overridePendingTransition(R.anim.slide_up,  R.anim.no_animation);
            }
        });



    }
    @Override
    public void onResume(){
        super.onResume();
//        boolean flag = false;
//
//        if(flag==false) {
            BALANCE.setText(amount.money.calcBalance());
            PROFIT.setText(amount.money.calcProfit());
//            flag=true;
//        }
    }
}