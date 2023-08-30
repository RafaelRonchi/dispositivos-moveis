package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

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
        SetarImg();
    }

    public void voltarM(View view){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void SetarImg() {
        double imcValue = Double.parseDouble(imc);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedIMC = decimalFormat.format(imcValue);

        if (imcValue < 18.5) {
            imagem.setImageResource(R.drawable.abaixopeso);
            resultadoImc.setText(formattedIMC + " Abaixo do peso");
        } else if (imcValue < 24.9) {
            imagem.setImageResource(R.drawable.perfil);
            resultadoImc.setText(formattedIMC + " Normal");
        } else if (imcValue < 29.9) {
            imagem.setImageResource(R.drawable.sobrepeso);
            resultadoImc.setText(formattedIMC + " Sobrepeso");
        } else if (imcValue < 34.9) {
            imagem.setImageResource(R.drawable.obesidade1);
            resultadoImc.setText(formattedIMC + " Obesidade 1");
        } else if (imcValue < 39.9) {
            imagem.setImageResource(R.drawable.obesidade2);
            resultadoImc.setText(formattedIMC + " Obesidade 2");
        } else {
            imagem.setImageResource(R.drawable.obesidade3);
            resultadoImc.setText(formattedIMC + " Obesidade 3");
        }
    }


}