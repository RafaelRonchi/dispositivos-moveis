package com.example.sorteador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.stream.IntStream;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    TextView mostrador;
    EditText valor1;
    EditText valor2;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.button);
        mostrador = (TextView) findViewById(R.id.textView4);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);

    }

    public void sorteia(View v){
        int v1 = Integer.parseInt(String.valueOf(valor1.getText()));
        int v2 = Integer.parseInt(String.valueOf(valor2.getText()));
        int randomNum = rand.nextInt((v2 - v1) + 1) + v1;
        mostrador.setText(String.valueOf(randomNum));
    }
}