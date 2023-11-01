package com.example.sqlitecadastro.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sqlitecadastro.Model.Nota;
import com.example.sqlitecadastro.R;

import java.util.List;

public class ExibirNota extends AppCompatActivity {
    Context MyContext;
    int MyResource;

    public ExibirNota(@NonNull Context context, int resource, @NonNull List<Nota> objects) {
        super(context, resource, objects);
        MyContext = context;
        MyResource = resource;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_nota);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //infla o layout
        LayoutInflater inflater = LayoutInflater.from(MyContext);
        convertView  = inflater.inflate(MyResource, parent, false);

        //return super.getView(position, convertView, parent);
//        TextView txtiid = convertView.findViewById(R.id.txtid);
//        TextView txtNome = convertView.findViewById(R.id.txtnome);
//        ImageView image = convertView.findViewById(R.id.imageView);

//        txtNome.setText(getItem(position).nome);
//        txtiid.setText(String.valueOf(getItem(position).id));
//        image.setImageResource(getItem(position).imagem);
        return convertView;
    }
}