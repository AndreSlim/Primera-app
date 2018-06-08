package com.andreslim.myapplication;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity implements View.OnClickListener{

    TextView mostrar;

    RadioGroup GrupoRB;

    Button botonAct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        mostrar = (TextView) findViewById(R.id.mostrar);


        GrupoRB = (RadioGroup) findViewById(R.id.GrupoRB);          //Enlazando con XML

        botonAct3 = (Button) findViewById(R.id.botonAct3);

        botonAct3.setOnClickListener(this);                         //habilitando el boton


        GrupoRB.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"Opcion 1",Toast.LENGTH_SHORT).show();
                }else if (i == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"Opcion 2",Toast.LENGTH_SHORT).show();
                }else if (i == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"Opcion 3",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Intent RECIBIR = getIntent();
        Bundle bundlexd = RECIBIR.getExtras();                      //Sirve para manejar los "Extras"

        if (bundlexd!=null){                                        //Consultar si el bundle viene vacio

            String cadena = (String) bundlexd.get("Etiqueta");      //Pregunto por 'Etiqueta' para recibir a "Contenedor" (de la act. 1)
                                                                    //y lo almaceno en 'cadena'

            mostrar.setText(cadena);                                //Lo que tengo en 'cadena' lo muestro con 'Mostrar'

        }


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Actividad3.class);
        startActivity(intent);
    }
}
