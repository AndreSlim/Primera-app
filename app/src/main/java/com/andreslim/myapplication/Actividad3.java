package com.andreslim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class Actividad3 extends AppCompatActivity implements View.OnClickListener{

    Spinner Lista;

    Button botonAct4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        Lista = (Spinner) findViewById(R.id.Lista);             //Enlazando con XML

        botonAct4 = (Button) findViewById(R.id.botonAct4);

        botonAct4.setOnClickListener(this);

        final List ListaL = new ArrayList();
        ListaL.add("Opcion 1");
        ListaL.add("Opcion 2");
        ListaL.add("Opcion 3");
        ListaL.add("Opcion 4");
        ListaL.add("Opcion 5");
        ListaL.add("Opcion 6");
        ListaL.add("Opcion 7");
        ListaL.add("Opcion 8");
        ListaL.add("Opcion 9");
        ListaL.add("Opcion 10");

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,ListaL);
        adaptador.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        Lista.setAdapter(adaptador);

        Lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Actividad3.this,"Seleccionaste "+String.valueOf(Lista.getSelectedItem()),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Actividad4.class);
        startActivity(intent);
    }
}
