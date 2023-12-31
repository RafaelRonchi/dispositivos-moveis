package com.example.listagemclasses;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemChurrascoAdapter extends ArrayAdapter<ItemChurrasco> {
    Context MyContext;
    int MyResource;

    public ItemChurrascoAdapter(@NonNull Context context, int resource, @NonNull List<ItemChurrasco> objects) {
        super(context, resource, objects);
        MyContext = context;
        MyResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //infla o layout
        LayoutInflater inflater = LayoutInflater.from(MyContext);
        convertView  = inflater.inflate(MyResource, parent, false);

        //return super.getView(position, convertView, parent);
        TextView txtiid = convertView.findViewById(R.id.txtid);
        TextView txtNome = convertView.findViewById(R.id.txtnome);
        ImageView image = convertView.findViewById(R.id.imageView);

        txtNome.setText(getItem(position).nome);
        txtiid.setText(String.valueOf(getItem(position).id));
        image.setImageResource(getItem(position).imagem);
        return convertView;
    }
}
