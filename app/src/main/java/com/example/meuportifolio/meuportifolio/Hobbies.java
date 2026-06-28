package com.example.meuportifolio.meuportifolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Hobbies extends AppCompatActivity {

    Intent nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
    }

    public void clickVoltar (View view) {
        finish();
    }

    public void clickGenshin(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://genshin-impact.fandom.com/wiki/Genshin_Impact_Wiki"));
        startActivity(nav);
    }

    public void clickAlanzoka(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@alanzoka/videos"));
        startActivity(nav);
    }

    public void clickDormir(View view) {
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/MNYSYiuV8QA?si=8HL89piVQfS76U6g"));
        startActivity(nav);
    }
}
