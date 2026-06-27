package com.example.meuportifolio.meuportifolio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        video = (VideoView) findViewById(R.id.video);

        String caminho = "android.resource://com.example.meuportifolio.meuportifolio/" + R.raw.rickroll;
        Uri u = Uri.parse(caminho);
        video.setVideoURI(u);

        video.start();
    }
}
