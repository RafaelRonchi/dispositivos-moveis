package com.example.sqlitecadastro.Model;

import static android.content.Context.MODE_PRIVATE;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NotaDAO {
    SQLiteDatabase sqlLitedb;

    public NotaDAO(Context c) {
        sqlLitedb = openOrCreateDatabase("dbCadastro", MODE_PRIVATE, null);
    }
}
