package com.example.sqlitteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqlLitedb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqlLitedb = openOrCreateDatabase("meubd", MODE_PRIVATE, null);
        sqlLitedb.execSQL("CREATE TABLE IF NOT EXISTS usr(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome VARCHAR);");
        ContentValues cv = new ContentValues();
        cv.put("nome", "Eu");
        sqlLitedb.insert("usr", null, cv);
    }
}