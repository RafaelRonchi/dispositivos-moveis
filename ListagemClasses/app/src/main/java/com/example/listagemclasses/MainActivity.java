package com.example.listagemclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ItemChurrasco> listaItensChurrasco = new ArrayList<ItemChurrasco>();
    ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView = findViewById(R.id.listview);
        listaItensChurrasco.add(new ItemChurrasco(1, "Carne", R.drawable.carne));
        listaItensChurrasco.add(new ItemChurrasco(2, "Pao de áio", R.drawable.pao));

        ListView.setAdapter();
    }
}