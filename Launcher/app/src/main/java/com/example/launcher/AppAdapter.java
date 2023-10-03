package com.example.launcher;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AppAdapter extends ArrayAdapter<ApplicationInfo> {
    Context MyContext;
    int MyResource;

    public AppAdapter(MainActivity mainActivity, int item_lista, List<ApplicationInfo> packageInfoList) {
        super(mainActivity, item_lista, packageInfoList);
        MyContext = mainActivity;
        MyResource = item_lista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Inflando layout do item da lista
        LayoutInflater inflater = LayoutInflater.from(MyContext);
        View view = inflater.inflate(MyResource, parent, false);
        //Recuperando o objeto ApplicationInfo da posição atual
        ApplicationInfo applicationInfo = getItem(position);
        //Recuperando os componentes do layout
        TextView textViewAppName = view.findViewById(R.id.app_name);
        ImageView imageViewAppIcon = view.findViewById(R.id.app_icon);
        //Setando os valores nos componentes
        imageViewAppIcon.setImageDrawable(applicationInfo.loadIcon(getContext().getPackageManager()));
        textViewAppName.setText(applicationInfo.loadLabel(getContext().getPackageManager()));
        return view;
    }
}
