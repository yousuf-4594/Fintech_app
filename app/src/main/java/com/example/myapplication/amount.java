package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;



public class amount extends AppCompatActivity {

    public static Money money = new Money();
    ImageButton forward;
    EditText amount;
    TextView error;
    Animation anim;
    ImageButton butt;
    String chosenval;
    TextView profit;

    //--------------------------------
    AutoCompleteTextView autoCompleteTextView;
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);

        SimpleDateFormat sdf = new SimpleDateFormat("E/MM/yyyy");
        Date d = new Date();
        String time = sdf.format(d);

        Bundle bundle = getIntent().getExtras();            //receives the transaction type from intent int message variable
        String transaction = bundle.getString("message");

        forward = findViewById(R.id.imageButton3);
        amount = findViewById(R.id.editTextNumber);
        error = findViewById(R.id.textView22);
        butt = findViewById(R.id.cancel2);
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.error_anim);
        autoCompleteTextView = findViewById(R.id.AutoCompleteTextview);
//        dropdown = findViewById(R.id.dynamic_spinner);

        profit = findViewById(R.id.textView30);
        //---------------------------------

        chosenval=null;

        String[] options=new String[]{"N/A"};

        if(transaction.equals("revenue")==true){
            options = new String[]{"Service Revenue"};
        }
        else if(transaction.equals("expenses")==true){
            options = new String[]{"Rent Expenses", "Salaries Expenses", "Bill Expenses","Interest Expenses", "Advertising Expenses", "Insurance Expenses"};
        }

        else if(transaction.equals("assets")==true) {
            options = new String[]{"Office Supplies", "Office Supplies on account", "Item-Sneakers", "Item-Sneakers on account", "Item-Trainers", "Item-Trainers on account", "Item-Grippers", "Item-Grippers on account", "Rent Expenses", "Item-Crocs", "Item-Crocs on account", "Equipment", "Equipment on account", "Furniture", "Furniture on account", "A/c Receivables", "Building", "Land", "Prepaid Rent", "Prepaid Insurance"};
        }
        else if(transaction.equals("liabilities")==true) {
            options = new String[]{"Account Payable", "Supplies Payable", "Unearned Revenue", "Advertisement Payable", "Equipment Payable", "Interest Payable", "Loan Payable"};
        }

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.dropdown_item,options);
//        dropdown.setAdapter(adapter);
//
//        dropdown.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                chosenval = (String) adapterView.getItemAtPosition(i);
//            }
//        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.dropdown_item, options);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                chosenval = autoCompleteTextView.getText().toString();
                Toast.makeText(getApplicationContext(), "" + money.calcRevenue(), Toast.LENGTH_SHORT).show();
            }
        });
        //---------------------------------

        error.setText("");
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chosenval==null|| amount.getText().toString().isEmpty()==true){
                    error.setText("Missing values!");
                    error.startAnimation(anim);
                }
                else{
                    money.insert(chosenval,Integer.parseInt(amount.getText().toString()));
                    if(transaction.equals("revenue")==true){
                        General_journal.records.add(new record(time,"cash",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                    }
                    else if(transaction.equals("expenses")==true){
                        General_journal.records.add(new record(time,chosenval,"cash",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));

                    }
                    else if(transaction.equals("assets")==true){
                        if(chosenval.equals("Office Supplies on account")==true
                                || chosenval.equals("Item-Sneakers on account")==true
                                || chosenval.equals("Item-Trainers on account")==true
                                || chosenval.equals("Item-Grippers on account")==true
                                || chosenval.equals("Item-Crocs on account")==true
                                || chosenval.equals("Equipment on account")==true
                                || chosenval.equals("Furniture on account")==true)
                            General_journal.records.add(new record(time,chosenval,"Account Payable",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else if(chosenval.equals("A/c Receivables")==true)
                            General_journal.records.add(new record(time,chosenval,"Service Revenue",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else
                            General_journal.records.add(new record(time,chosenval, "cash", amount.getText().toString(), amount.getText().toString(), R.drawable.main_disp3, R.drawable.main_disp3, R.drawable.main_disp3));
                    }
                    else if(transaction.equals("liabilities")==true){

                        if(chosenval.equals("Supplies Payable")==true)
                            General_journal.records.add(new record(time,"Office Supplies",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else if(chosenval.equals("Advertisement Payable")==true)
                            General_journal.records.add(new record(time,"Advertising Expenses",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else if(chosenval.equals("Equipment Payable")==true)
                            General_journal.records.add(new record(time,"Equipment",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else if(chosenval.equals("Interest Payable")==true)
                            General_journal.records.add(new record(time,"Interest Expenses",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else
                            General_journal.records.add(new record(time,"cash",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                    }
//                    MainActivity.refreshvaals();
                    Toast.makeText(getApplicationContext(), "Transaction Saved", Toast.LENGTH_SHORT).show();
//                    error.setText("");
//                    General_journal.recyclerView.getAdapter().notifyDataSetChanged();
                    finish();
                }
            }
        });
    }
}