package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3_horas extends AppCompatActivity {

    Button bt_aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_horas);
        bt_aceptar = (Button) findViewById(R.id.bt_aceptar);

        bt_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bt_aceptar = new Intent(Activity3_horas.this, Principal.class);
                startActivity(bt_aceptar);
            }
        });

    }
}