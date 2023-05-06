package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class mer_doctor extends AppCompatActivity {
    RecyclerView re_view;
    ArrayList<mer_recycleitemdata> data_hold;
    //ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mer_doctor);
        ActionBar actionBar = getSupportActionBar();
        //actionBarDrawerToggle.syncState();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        getSupportActionBar().setTitle("Doctors");
        re_view = findViewById(R.id.mrrcv);
        re_view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        data_hold = new ArrayList<>();
        mer_recycleitemdata ob1=new mer_recycleitemdata(R.drawable.doc1,"Deepashri Tatar","3.5","Panchavati,Nashik","400 consultation fee");
    data_hold.add(ob1);
    mer_recycleitemdata ob2=new mer_recycleitemdata(R.drawable.dc2,"Dr shrenik","4","Indira nagar,nashik","350 consultation fee");
    data_hold.add(ob2);
        re_view.setAdapter(new mer_readapter(data_hold));



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}