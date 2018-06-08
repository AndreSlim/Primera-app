package com.andreslim.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Actividad4 extends AppCompatActivity implements View.OnClickListener{

    ToggleButton interruptor;
    Context contexto = this;

    Button boton;
    CheckBox checkR, checkG, checkB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        interruptor = (ToggleButton)findViewById(R.id.interruptor);                    //INTERRUPTOR

        boton = (Button) findViewById(R.id.botonCheck);
        boton.setOnClickListener(this);                                                 //Habilitado por Implements

        checkR = (CheckBox) findViewById(R.id.R);
        checkG = (CheckBox) findViewById(R.id.G);
        checkB = (CheckBox) findViewById(R.id.B);

        interruptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder constructorDeAlerta  = new AlertDialog.Builder(contexto);

                constructorDeAlerta.setMessage("Este es un mensaje")
                        .setCancelable(false)
                        .setPositiveButton("Simona la Mona", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                //Codigo en caso de ser positiva la seleccion

                            }
                        })

                        .setNegativeButton("Nelson Nel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                //Codigo en caso de ser Negativa la seleccion

                            }
                        });

                AlertDialog Alerta = constructorDeAlerta.create();
                Alerta.show();

            }
        });


    }

    @Override
    public void onClick(View view) {

        StringBuffer resultado = new StringBuffer();
        resultado.append(" Rojo: ").append((checkR.isChecked()));
        resultado.append(" \n Verde: ").append((checkG.isChecked()));
        resultado.append(" \n Azul: ").append((checkB.isChecked()));

        Toast.makeText(Actividad4.this, resultado.toString(),Toast.LENGTH_SHORT).show();


    }
}
