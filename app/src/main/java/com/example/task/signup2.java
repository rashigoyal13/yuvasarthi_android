package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class signup2 extends AppCompatActivity {

    EditText username1, emailid1, contact1, password1, repassword1,blood_group,Dob,state,city,village,district;
    Button signup1,log_btn1;
    FirebaseFirestore dbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        username1 = (EditText) findViewById(R.id.user1);
        emailid1 = (EditText) findViewById(R.id.email1);
        contact1 = (EditText) findViewById(R.id.con1);
        blood_group = (EditText) findViewById(R.id.signup_bldgrp1);
        Dob = (EditText) findViewById(R.id.signup_dob1);
        state = (EditText) findViewById(R.id.signup_state1);
        city = (EditText) findViewById(R.id.signup_city1);
        village = (EditText) findViewById(R.id.signup_village1);
        district = (EditText) findViewById(R.id.signup_district1);
        password1 = (EditText) findViewById(R.id.sp1);
        repassword1 = (EditText) findViewById(R.id.cp1);
        signup1 = (Button) findViewById(R.id.su1);
        log_btn1 = (Button) findViewById(R.id.loginbtn1);
        dbs=FirebaseFirestore.getInstance();

        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertindustrialperson();
            }
        });
    }
    public void insertindustrialperson()
    {
        Map<String,String> field=new HashMap<>();
        field.put("Name",username1.getText().toString().trim());
        field.put("Email",emailid1.getText().toString().trim());
        field.put("Contact_Info",contact1.getText().toString().trim());
        field.put("Password",password1.getText().toString().trim());
        field.put("Blood_Group",blood_group.getText().toString().trim());
        field.put("BirthDate",Dob.getText().toString().trim());
        field.put("State",state.getText().toString().trim());
        field.put("City",city.getText().toString().trim());
        field.put("District",district.getText().toString().trim());
        field.put("Village",village.getText().toString().trim());

        dbs.collection("Industrial_Person").add(field)
                .addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentReference> task) {
                        username1.setText("");
                        emailid1.setText("");
                        contact1.setText("");
                        password1.setText("");
                        blood_group.setText("");
                        Dob.setText("");
                        state.setText("");
                        city.setText("");
                        village.setText("");
                        district.setText("");
                        Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_SHORT).show();
                        Intent i=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                });

                }


}