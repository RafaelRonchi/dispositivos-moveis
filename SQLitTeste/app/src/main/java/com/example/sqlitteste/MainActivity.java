package com.example.sqlitteste;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqlLitedb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqlLitedb = openOrCreateDatabase("meubd", MODE_PRIVATE, null);
        sqlLitedb.execSQL("CREATE TABLE usr(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome VARCHAR);");


    }
}