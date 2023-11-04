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

import com.example.sqlitecadastro.Controller.NotaController;
import com.example.sqlitecadastro.Model.Nota;
import com.example.sqlitecadastro.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Button btn;

    EditText titulo;
    EditText texto;

    ArrayList<Nota> lista = new ArrayList<Nota>();

    NotaController _controller;
    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listV);
        btn = findViewById(R.id.button);
        texto = findViewById(R.id.NTexto);
        titulo = findViewById(R.id.Ntitulo);

        atualizarLista();
        NotaArrayAdpter adpter = new NotaArrayAdpter(this, R.layout.activity_list_item, lista);
        lv.setAdapter(adpter);
    }
    
    public void cadastrar(){
        _controller.cadastrarNovaNota(new Nota(titulo.getText().toString(), texto.getText().toString()));
        atualizarLista();
    }

    public void atualizarLista(){
        lista = _controller.getListaNotas();
    }




}