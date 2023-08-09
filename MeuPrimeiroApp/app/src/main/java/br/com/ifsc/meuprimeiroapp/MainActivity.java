package br.com.ifsc.meuprimeiroapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Cliclo de vida", "OnCreate");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        btnClick = (Button) findViewById(R.id.button2);
        btnClick.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Cliclo de vida", "onStart");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Cliclo de vida", "onResume");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Cliclo de vida", "onRestart");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(2500); // Vibrate for 500 milliseconds


    }

}