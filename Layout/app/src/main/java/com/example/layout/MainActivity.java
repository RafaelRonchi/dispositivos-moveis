package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView viImage;
    Integer[] magess = new Integer[] {
            R.drawable.gardem,
            R.drawable.happy
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        viImage=findViewById(R.id.imageView);
        viImage.setImageResource(R.drawable.patinho);
        next(view);
    }

    public  void  next (View v, Integer mages){
        viImage=findViewById(R.id.imageView);
        viImage.setImageResource(
                mages[0]);
    }
}