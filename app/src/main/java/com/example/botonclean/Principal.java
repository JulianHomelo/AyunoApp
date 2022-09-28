package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    Button btn_registro_peso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn_registro_peso = (Button) findViewById(R.id.btn_registro_peso);

        btn_registro_peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_registro_peso = new Intent(Principal.this, RegistroPeso.class);
                startActivity(btn_registro_peso);
            }
        });

    }
}