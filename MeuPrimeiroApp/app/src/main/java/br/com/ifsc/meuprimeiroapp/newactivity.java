package br.com.ifsc.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newactivity extends AppCompatActivity {
    Button btnClick;
    TextView tvContador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);

        btnClick = (Button) findViewById(R.id.button);
        tvContador = (TextView) findViewById(R.id.textView) ;
    }


    public void contagem(View v){

        tvContador.setText(" "+ i++);
    }
    public void OnClick(){

    }


    public Integer i = 0;
}