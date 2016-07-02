package com.example.arciniega.proyecto07_navigator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Declaración de los elementos con los que se va a ttrabajar
    private Button btnLayout1;
    private Button btnLayout2;

    // Declarar un objeto de la clase 'Intent' , esta clase permite 'intentar' llamar a otras activities
    private Intent intento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacionar los botones del 'java' con los botones del 'xml'
        btnLayout1 = (Button)findViewById(R.id.btnActivity1);
        btnLayout2 = (Button)findViewById(R.id.btnActivity2);

        // Crear el evento onClick del botón
        btnLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarActivity01(v);
            }
        });
    }

    // Método que al invocarse, manda crear a la nueva activity
    public void llamarActivity01(View v){
        intento = new Intent(this,Activity01.class);
        startActivity(intento);
    }
}
