package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class list_view extends AppCompatActivity {
    ListView list;
    SearchView search;
    String countries[]={"India","russia","Japan","America","Europe","Africa","bhutan","England"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        list=(ListView) findViewById(R.id.lv);
        search=(SearchView) findViewById(R.id.sv);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countries);
        list.setAdapter(arr);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String sf) {
                arr.getFilter().filter(sf);
                return false;
            }
        });
    }
}