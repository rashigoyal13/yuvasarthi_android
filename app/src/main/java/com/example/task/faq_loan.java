package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class faq_loan extends AppCompatActivity {
    CardView cd1,cd2, cd3, cd4;
    ConstraintLayout expandable1,expandable2,expandable3,expandable4;
    Button arrow1, arrow2,arrow3, arrow4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_loan);
        ActionBar actionBar = getSupportActionBar();
        //actionBarDrawerToggle.syncState();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        expandable1=findViewById(R.id.expandView1);
        arrow1=findViewById(R.id.arrowbt1);
        cd1=findViewById(R.id.cardv1);

        expandable2=findViewById(R.id.expandableView2);
        arrow2=findViewById(R.id.arrowbtn2);
        cd2=findViewById(R.id.cardv2);

        expandable3=findViewById(R.id.expandableView3);
        arrow3=findViewById(R.id.arrowbtn3);
        cd3=findViewById(R.id.cardv3);

        expandable4=findViewById(R.id.expandableView4);
        arrow4=findViewById(R.id.arrowbtn4);
        cd4=findViewById(R.id.cardv4);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandable1.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(cd1,new AutoTransition());
                    expandable1.setVisibility(View.VISIBLE);
                    arrow1.setBackgroundResource(R.drawable.arrow_up_24);
                }
                else{
                    TransitionManager.beginDelayedTransition(cd1,new AutoTransition());
                    expandable1.setVisibility(View.GONE);
                    arrow1.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

                }
            }
        });
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