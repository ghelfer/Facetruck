package com.unisc.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);

        //btn1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
       //         TextView txt1 = findViewById(R.id.txtNome);
        //        txt1.setText("Olá");
        //    }
        //});


        int valor = 4;
        Log.d("ciclo","onCreate");
    }



    public void cliqueButton(View view) {
        TextView txt1 = findViewById(R.id.txtNome);
        txt1.setText("Olá");

        //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        //intent.putExtra("chave", txt1.getText());
        //intent.putExtra("chave2", 4);
        //startActivity(intent);

        Intent intent2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent2, 1);
    }
}