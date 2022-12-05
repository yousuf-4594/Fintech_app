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
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;
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
    Switch type;

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
        type = findViewById(R.id.switch1);
//        dropdown = findViewById(R.id.dynamic_spinner);

        profit = findViewById(R.id.textView30);
        //---------------------------------


        type.setChecked(true);
        type.setText("Record increase");
        type.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    type.setText("Record increase");
                } else {
                    type.setText("Record decrease");
                }
            }
        });


        chosenval=null;

        String[] options=new String[]{"N/A"};

        if(transaction.equals("revenue")==true){
            options = new String[]{"Service Revenue","Interest Revenue","Item-Sneakers","Item-Trainers","Item-Grippers"};
        }
        else if(transaction.equals("expenses")==true){
            options = new String[]{"Rent Expenses", "Salaries Expenses", "Bill Expenses","Interest Expenses", "Advertising Expenses", "Insurance Expenses", "Utilities Expense"};
        }
        else if(transaction.equals("assets")==true) {
            options = new String[]{"Office Supplies", "Item-Sneakers",  "Item-Trainers", "Item-Grippers", "Equipment",  "Furniture", "Building", "Land", "Prepaid Rent", "Prepaid Insurance","Inventory Receivables", "Interest Receivables", "Notes Receivables",  "A/c Receivables"};
        }
        else if(transaction.equals("liabilities")==true) {
            options = new String[]{"Account Payable", "Supplies Payable", "Unearned Revenue", "Advertisement Payable", "Equipment Payable", "Interest Payable", "Loan Payable", "Notes Payable"};
        }
        else if(transaction.equals("init")==true) {
            options = new String[]{"cash", "Item-Sneakers", "Item-Trainers", "Item-Grippers", "Land", "Building", "Prepaid Rent", "Furniture", "Account Payable","Service Revenue"};
        }
        else if(transaction.equals("equity")==true) {
            options = new String[]{"Common stock", "Dividends"};
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
                //Toast.makeText(getApplicationContext(), "" + money.calcRevenue(), Toast.LENGTH_SHORT).show();
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
                    //STORING INTO MONEY CLASS
                    if(transaction.equals("init")==true)
                        money.initinsert(chosenval,Integer.parseInt(amount.getText().toString()));
                    else if(transaction.equals("revenue")==true)
                        money.incinsertservicerev(chosenval,Integer.parseInt(amount.getText().toString()));
                    else if(type.isChecked())
                        money.addinsert(chosenval,Integer.parseInt(amount.getText().toString()));
                    else if(type.isChecked()==false)
                        money.decinsert(chosenval,Integer.parseInt(amount.getText().toString()));
                    else
                        Toast.makeText(getApplicationContext(), "Assets" , Toast.LENGTH_SHORT).show();


                    //STORING INTO GENERAL JOURNAL CLASS
                    if(transaction.equals("revenue")==true){
                        General_journal.records.add(new record(time,"cash",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                    }
                    else if(transaction.equals("expenses")==true){
                        General_journal.records.add(new record(time,chosenval,"cash",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));

                    }
                    else if(transaction.equals("assets")==true){
//                        if(chosenval.equals("Office Supplies on account")==true
//                                || chosenval.equals("Item-Sneakers on account")==true
//                                || chosenval.equals("Item-Trainers on account")==true
//                                || chosenval.equals("Item-Grippers on account")==true
//                                || chosenval.equals("Item-Crocs on account")==true
//                                || chosenval.equals("Equipment on account")==true
//                                || chosenval.equals("Furniture on account")==true)
//                            General_journal.records.add(new record(time,chosenval,"Account Payable",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//                        else if(chosenval.equals("A/c Receivables")==true)
//                            General_journal.records.add(new record(time,chosenval,"Service Revenue",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//                        else
                        if(type.isChecked())
                            General_journal.records.add(new record(time,chosenval, "cash", amount.getText().toString(), amount.getText().toString(), R.drawable.main_disp3, R.drawable.main_disp3, R.drawable.main_disp3));
                        else
                            General_journal.records.add(new record(time,"cash",chosenval,  amount.getText().toString(), amount.getText().toString(), R.drawable.main_disp3, R.drawable.main_disp3, R.drawable.main_disp3));
                    }
                    else if(transaction.equals("liabilities")==true){
                        if(type.isChecked()){
                            if(chosenval.equals("Supplies Payable")==true)
                                General_journal.records.add(new record(time,"Office Supplies",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else if(chosenval.equals("Advertisement Payable")==true)
                                General_journal.records.add(new record(time,"Advertising Expenses",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else if(chosenval.equals("Equipment Payable")==true)
                                General_journal.records.add(new record(time,"Equipment",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else if(chosenval.equals("Interest Payable")==true)
                                General_journal.records.add(new record(time,"Interest Expenses",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
//                        else if(chosenval.equals("Utilities Payable")==true)
//                            General_journal.records.add(new record(time,"Utilities",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else if(chosenval.equals("Notes Payable")==true)
                                General_journal.records.add(new record(time,"cash",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else
                                General_journal.records.add(new record(time,"cash",chosenval,amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        }
                        else{
                            if(chosenval.equals("Supplies Payable")==true)
                                General_journal.records.add(new record(time,chosenval,"Office Supplies",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                            else if(chosenval.equals("Unearned Revenue")==true)///////////////////
                                General_journal.records.add(new record(time,chosenval,"Service Revenue",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                           else
                                General_journal.records.add(new record(time,chosenval,"cash",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        }
                    }
                    else if(transaction.equals("equity")==true){
                        if(chosenval.equals("Common stock")==true)
                            General_journal.records.add(new record(time,"cash","Common stock",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
                        else if(chosenval.equals("Dividends")==true)
                            General_journal.records.add(new record(time,"Dividends","cash",amount.getText().toString(),amount.getText().toString(),R.drawable.main_disp3,R.drawable.main_disp3,R.drawable.main_disp3));
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