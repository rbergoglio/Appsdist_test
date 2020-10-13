package com.example.appsdist_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnAceptar;
    private EditText txtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAceptar = findViewById(R.id.btnAceptar);
        txtUsuario = findViewById(R.id.txtUsuario);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtUsuario.getText().toString();

                if(nombre.isEmpty())
                    nombre = "Extraño";

                // Intent: un vinculo entre actividades, origen -> destino
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nombre",nombre);
                startActivity(i);
            }
        });
    }
    void caca(){

    }
}
