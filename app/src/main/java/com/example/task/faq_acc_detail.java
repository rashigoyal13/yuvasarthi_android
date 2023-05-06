package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class faq_acc_detail extends AppCompatActivity {
     CardView cardView,cardView2, cardView3, cardView4;
    ConstraintLayout expandableView,expandableView2,expandableView3,expandableView4;
    Button arrowbtn, arrowbtn2,arrowbtn3, arrowbtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_acc_detail);
        expandableView=findViewById(R.id.expandableView);
        arrowbtn=findViewById(R.id.arrowbtn);
        cardView=findViewById(R.id.cardView);

        expandableView2=findViewById(R.id.expandableView2);
        arrowbtn2=findViewById(R.id.arrowbtn2);
        cardView2=findViewById(R.id.cardView2);

        expandableView3=findViewById(R.id.expandableView3);
        arrowbtn3=findViewById(R.id.arrowbtn3);
        cardView3=findViewById(R.id.cardView3);

        expandableView4=findViewById(R.id.expandableView4);
        arrowbtn4=findViewById(R.id.arrowbtn4);
        cardView4=findViewById(R.id.cardView4);
arrowbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (expandableView.getVisibility() == View.GONE){
            TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
            expandableView.setVisibility(View.VISIBLE);
            arrowbtn.setBackgroundResource(R.drawable.arrow_up_24);
        }
        else{
            TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
            expandableView.setVisibility(View.GONE);
            arrowbtn.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

        }
    }
});
    }
}