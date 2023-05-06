package com.example.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText username, emailid, contact, password, repassword;
    Button signup,log_btn;
    dbconnection db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.user);
        emailid = (EditText) findViewById(R.id.email);
        contact = (EditText) findViewById(R.id.con);
        password = (EditText) findViewById(R.id.sp);
        repassword = (EditText) findViewById(R.id.cp);
        signup = (Button) findViewById(R.id.su);
        log_btn=(Button) findViewById(R.id.loginbutton);
        db = new dbconnection(this);
        Register_user();

        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(int1);
            }
        });
    }




    private void Register_user() {
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String cont = contact.getText().toString();
                String mail = emailid.getText().toString();
                String repass = repassword.getText().toString();

                if (user.equals("") || cont.equals("") || mail.equals("") || pass.equals("") || repass.equals("")) {
                    Toast.makeText(register.this, "invalid credentials", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals(repass)) {
                    Toast.makeText(register.this, "Password not matching", Toast.LENGTH_SHORT).show();
                } else if (!isEmailValidate(mail)) {
                    Toast.makeText(register.this, " invalid email address", Toast.LENGTH_SHORT).show();

                } else if (!cont.matches("[6-9][0-9]{11}")) {
                    Toast.makeText(register.this, "Phone number should be 12 digits", Toast.LENGTH_SHORT).show();
                } else if (!user.matches("[A-Z,a-z]*")) {
                    Toast.makeText(register.this, "Name only contains characters", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean Inserted = db.Insertdata(mail,user, cont, pass, repass);

                    if (Inserted == true) {
                        Toast.makeText(register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(register.this, MainActivity.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(register.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }










        private boolean isEmailValidate(String mail)
        {
            return mail.contains("@gmail.com");
        }


        });
    }



    }






