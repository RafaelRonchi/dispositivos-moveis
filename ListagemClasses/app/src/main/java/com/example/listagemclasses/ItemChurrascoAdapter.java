package com.example.listagemclasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
    }
}
