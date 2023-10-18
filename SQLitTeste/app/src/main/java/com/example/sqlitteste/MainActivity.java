package com.example.sqlitteste;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqlLitedb;
    ListView lv;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listaV);

        sqlLitedb = openOrCreateDatabase("meubd", MODE_PRIVATE, null);
        sqlLitedb.execSQL("CREATE TABLE IF NOT EXISTS usr(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome VARCHAR);");
        ContentValues cv = new ContentValues();
        cv.put("nome", "Eu");
        sqlLitedb.insert("usr", null, cv);
        Cursor cursor = sqlLitedb.rawQuery("SELECT * FROM usr", null);

        cursor.moveToFirst();
        ArrayList<String> listaUsuario = new ArrayList<>();
//        cursor.getString(cursor.getColumnIndex("id"));
        while (!cursor.isAfterLast()){
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("nome")));
            Log.d("lablusr", cursor.getString(cursor.getColumnIndex("id")) + cursor.getString(cursor.getColumnIndex("nome")));
            cursor.moveToNext();
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaUsuario
        );

        lv.setAdapter(arrayAdapter);
    }
}