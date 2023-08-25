package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[]  content={"India","Sri Lanka","Pakistan","Nepal","Canada","America","Australia","England","Switzerland","Sweden","Denmark","Indonesia","Singapore","Mexico","Brazil"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.List);
        ArrayAdapter<String> aa=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,content);
        lv.setAdapter(aa);

    }
}