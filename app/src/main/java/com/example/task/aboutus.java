package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        // Initialize all the TextViews
        TextView aboutYuvaSarathi = findViewById(R.id.About_Yuva_Sarathi);
        TextView governingBody = findViewById(R.id.governing_body_title);
        TextView corporatorsInfo = findViewById(R.id.corporators_info_title);
        TextView zoneInfo = findViewById(R.id.zone_info_title);
        TextView cityInfo = findViewById(R.id.city_info_title);
        TextView tourismInfo = findViewById(R.id.tourism_info_title);
        TextView mobileApp = findViewById(R.id.mobile_app_title);

        // Set onClickListeners for all the TextViews
        aboutYuvaSarathi.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(),aboutyuvasarthi.class);
            intent.putExtra("title", "About Yuva Sarathi");
            startActivity(intent);
        });
    }
}