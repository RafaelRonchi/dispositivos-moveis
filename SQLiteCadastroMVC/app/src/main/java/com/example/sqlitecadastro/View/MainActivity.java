package com.example.sqlitecadastro.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.sqlitecadastro.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqlLitedb;
    ListView lv;
    Button btn;

    EditText text;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listV);
        btn = findViewById(R.id.button);
        text = findViewById(R.id.editTextTextPersonName);

       listarA();
    }



    public void listarA(){
        Cursor cursor = sqlLitedb.rawQuery("SELECT * FROM pessoas", null);
        cursor.moveToFirst();

        ArrayList<String> listaUsers = new ArrayList<>();
        while (!cursor.isAfterLast()){
            listaUsers.add(cursor.getString(cursor.getColumnIndex("nome")));
            cursor.moveToNext();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaUsers
        );

        lv.setAdapter(arrayAdapter);
    }
}