package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class General_journal extends AppCompatActivity {


    ImageButton but;
    public static RecyclerView recyclerView;
    public static List<record> records= new ArrayList<record>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_journal);


        recyclerView=findViewById(R.id.recycler_id);

        but = findViewById(R.id.cancel3);

//        recyclerView.getAdapter().notifyDataSetChanged();
//        records.add(new record("01:30","expenses","cash","234","234",R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//        records.add(new record("01:30","expenses","cash","234","234",R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//        records.add(new record("01:30","expenses","cash","234","234",R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//        records.add(new record("10AM","expenses","cash","234","234",R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//        recyclerView.getAdapter().notifyDataSetChanged();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),records));

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}