package com.example.meuportifolio.meuportifolio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSobre(View view) {
        tela = new Intent(getApplicationContext(), SobreMim.class);
        startActivity(tela);
    }

    public void clickHobbies(View view) {
        tela = new Intent(getApplicationContext(), Hobbies.class);
        startActivity(tela);
    }

    public void clickVideo(View view) {
        tela = new Intent(getApplicationContext(), video.class);
        startActivity(tela);
    }
}
