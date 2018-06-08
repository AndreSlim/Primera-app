package com.andreslim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{ //Agregando Implements, solicitar crear nuevo metodo

    Button boton;
    EditText DatoIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton); //Enlazando este boton con el boton grafico

        DatoIntro = (EditText) findViewById(R.id.editText);

        boton.setOnClickListener(this);            //Habilitando la actividad del boton

    }

    @Override
    public void onClick(View v) {                //Aqui va el codigo del boton (Es la clase creada por "implements)

        switch (v.getId()){

            case R.id.boton:
                Intent Cambiar = new Intent(this, Actividad2.class);    //Crea un Intent para poder abrir la otra actividad

                String dato = DatoIntro.getText().toString();  //Contenedor recive lo que tiene 'dato' y lo hace String
                Cambiar.putExtra("Etiqueta",dato);               //Pregunto por 'Etiqueta' en la act. 2 para recibir a 'dato'

                startActivity(Cambiar);
                break;                                                  //Revisar AndroidManifest para organizar esta actividad

            default:
                break;

        }

    }
}
