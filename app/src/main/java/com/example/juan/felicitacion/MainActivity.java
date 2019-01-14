package com.example.juan.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(),"Beauty and the Beast Sample.ttf");
        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}
