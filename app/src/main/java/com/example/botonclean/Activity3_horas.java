package com.example.botonclean;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.BreakIterator;
import java.util.Calendar;

public class Activity3_horas extends AppCompatActivity {

    Button bt_aceptar;


    TextView tv;



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


    public void abrirHora(View view) {

        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);

        TimePickerDialog tmd = new TimePickerDialog(Activity3_horas.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {

                tv.setText(hourOfDay +":"+ minute);

            }
        }
                ,hora,minutos,false);
        tmd.show();
    }

    }
