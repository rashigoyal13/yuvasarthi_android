package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText emailid, password;
    Button login;
    dbconnection db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailid = (EditText) findViewById(R.id.mail);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.log);
        Spinner spin=(Spinner) findViewById(R.id.spinner1) ;
        db=new dbconnection(this);


      //on click login button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = emailid.getText().toString();
                String passwrd = password.getText().toString();
                if (mail.equals("") || passwrd.equals("")) {
                    Toast.makeText(MainActivity.this, "Enter valid details", Toast.LENGTH_SHORT).show();
                } else {
                    boolean i= db.check_emailpass(mail,passwrd);
                    if(i==true){
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),botton_nav.class);
                    startActivity(intent);
                }
                    else {
                        Toast.makeText(MainActivity.this, "Login Failed:user not exist", Toast.LENGTH_SHORT).show();

                    }
                    }

            }
        });

        //on select spinner option
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;
                switch (position)
                {
                    case 1:
                         intent=new Intent(getApplicationContext(), register.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(getApplicationContext(),signup2.class);
                        startActivity(intent);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}