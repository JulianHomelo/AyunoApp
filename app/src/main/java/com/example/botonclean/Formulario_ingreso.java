package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Formulario_ingreso extends AppCompatActivity {

    Button btn_guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ingreso);
        btn_guardar=(Button)findViewById(R.id.btn_guardar);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_guardar = new Intent(Formulario_ingreso.this, activity2_clean.class);
                startActivity(btn_guardar);
            }
        });
    }
}





