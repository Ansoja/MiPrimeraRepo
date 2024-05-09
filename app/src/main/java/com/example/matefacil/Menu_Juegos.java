package com.example.matefacil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Juegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juegos);

        Button boton1 = findViewById(R.id.btnJuego1);
        Button boton2 = findViewById(R.id.btnJuego2);
        Button boton3 = findViewById(R.id.btnJuego3);
        Button boton4 = findViewById(R.id.btnJuego4);
        Button boton5 = findViewById(R.id.btnVolverInicio);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Juegos.this, juego_uno.class);
                startActivity(intent);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Juegos.this, juego_dos.class);
                startActivity(intent);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Juegos.this, juego_tres.class);
                startActivity(intent);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Juegos.this, juego_cuatro2.class);
                startActivity(intent);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Juegos.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}