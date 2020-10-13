
package com.example.appsdist_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPageActivity extends AppCompatActivity {

    private TextView txtMensaje;
    private Button btnCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        txtMensaje = findViewById(R.id.txtMensaje);
        btnCamera = findViewById(R.id.btnCamera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Intent: un vinculo entre actividades, origen -> destino
                Intent i = new Intent(MainPageActivity.this, CameraActivity.class);
                //i.putExtra("nombre",nombre);
                startActivity(i);
            }
        });

        String nombre = getIntent().getStringExtra("nombre");
        txtMensaje.setText("Bienvenido "+ nombre);
    }



}