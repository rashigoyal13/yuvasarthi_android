package com.example.task;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbconnection extends SQLiteOpenHelper {

        public static final String DBNAME="registerdata.db";

        public dbconnection(@Nullable Context context) { super(context, "registerdata.db",null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase liteDatabase) {
            liteDatabase.execSQL("create table info(Email TEXT primary key,Username TEXT,Contact INTEGER,Password TEXT,Repassword TEXT)");

        }

        @Override
        public void onUpgrade(SQLiteDatabase liteDatabase, int i, int i1) {
            liteDatabase.execSQL("drop table if exists info");


        }
        public Boolean Insertdata(String email,String username, String contact, String pass, String repass) {
            SQLiteDatabase liteDatabase = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("Username", username);
            cv.put("Email", email);
            cv.put("Contact", contact);
            cv.put("Email", email);
            cv.put("Password",pass);
            cv.put("Repassword", repass);

            long x = liteDatabase.insert("info", null, cv);
            if (x == -1)
                return false;
            else
                return true;
        }


        public Boolean check_emailpass(String email, String password) {
            SQLiteDatabase liteDatabase= this.getWritableDatabase();
            Cursor cursor = liteDatabase.rawQuery("select * from info where email =? and password=?", new String[]{email, password});
            if (cursor.getCount()>0)
                return true;
            else
                return false;
        }
    }

