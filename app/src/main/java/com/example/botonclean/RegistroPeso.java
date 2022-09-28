package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegistroPeso extends AppCompatActivity {

    ImageView img_atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_peso);
        img_atras = (ImageView) findViewById(R.id.img_atras);

        img_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent img_atras = new Intent(RegistroPeso.this, Principal.class);
                startActivity(img_atras);
            }
        });
    }
}