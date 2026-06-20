package com.example.meuportifolio.meuportifolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SobreMim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_mim);
    }
    public void clickVoltar (View view) {
        finish();
    }
}
