package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sig=(Button)findViewById(R.id.btn_sig);

        btn_sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_sig = new Intent(MainActivity.this, Formulario_ingreso.class);
                startActivity(btn_sig);
            }
        });

    }
}