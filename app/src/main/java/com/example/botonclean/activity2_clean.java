package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2_clean extends AppCompatActivity {

    Button btn_usar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_clean);
        btn_usar1 = (Button) findViewById(R.id.btn_usar1);

        btn_usar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_usar1 = new Intent(activity2_clean.this, Activity3_horas.class);
                startActivity(btn_usar1);
            }
        });
    }
}