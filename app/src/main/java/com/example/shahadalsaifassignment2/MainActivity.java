package com.example.shahadalsaifassignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText t1;
Button b1;
TextView ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 =(EditText)findViewById(R.id.t1);
        b1 =(Button)findViewById(R.id.b1);
        ds = (TextView)findViewById(R.id.ds);


        b1.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                String name = t1.getText().toString();
                ds.setText("hello "+ name);
            }
        });





}}