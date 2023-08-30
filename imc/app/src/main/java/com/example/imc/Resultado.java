package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    public String imc;
    public TextView resultadoImc;
    public TextView altura;
    public TextView peso;
    public Double alturaR;
    public Double pesoR;

    public Button voltar;

    public ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent i = getIntent();

        altura = findViewById(R.id.AlturaTxt);
        peso = findViewById(R.id.PesoTxt);
        imagem = findViewById(R.id.imageView2);
        imc = i.getStringExtra("resultado");
        alturaR = i.getDoubleExtra("altura", 0);
        pesoR = i.getDoubleExtra("peso", 0);

        resultadoImc = findViewById(R.id.Final);
        altura.setText("Altura: " +  alturaR );
        peso.setText("Peso: " + pesoR);
        resultadoImc.setText(imc);
    }

    public void voltarM(View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void SetarImg(){
        if (Double.valueOf(imc) <= 18.5){
            imagem.setImageResource(R.drawable.abaixopeso);
        }
        if(Double.valueOf(imc) > 18.5 && Double.valueOf(imc) < 24.9)
    }

}