
package com.example.appsdist_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtMensaje = findViewById(R.id.txtMensaje);

        String nombre = getIntent().getStringExtra("nombre");
        txtMensaje.setText("Bienvenido "+ nombre);
    }
}