package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText peso;
    public EditText altura;
    public Button calcular;
    public Double alturaD;
    public Double pesoD;

    public String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = findViewById(R.id.button);
        peso = findViewById(R.id.PesoTxt);
        altura = findViewById(R.id.AlturaTxt);
    }

    public void calcularIMC(View view){
        pesoD = Double.parseDouble(peso.getText().toString());
        alturaD = Double.parseDouble(altura.getText().toString());

        resultado = String.valueOf(pesoD / (alturaD * alturaD));
        Intent i = new Intent(this, Resultado.class);
        i.putExtra("resultado", resultado);
        i.putExtra("peso", pesoD);
        i.putExtra("altura", alturaD);
        startActivity(i);
    }


}