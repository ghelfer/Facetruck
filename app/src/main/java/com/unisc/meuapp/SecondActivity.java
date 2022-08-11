package com.unisc.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String conteudo =
                intent.getStringExtra("chave");

        txt2 = findViewById(R.id.txt2);
        txt2.setText(conteudo);

        int valor =
                intent.getIntExtra("chave1", 2);
        Log.d("chave2", valor + "");
    }
}