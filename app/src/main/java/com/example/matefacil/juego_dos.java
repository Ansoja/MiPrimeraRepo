package com.example.matefacil;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;


public class juego_dos extends AppCompatActivity {

    Random random = new Random();
    int numeroAleatorio1 = random.nextInt(10 - 0 + 1) + 0;
    int numeroAleatorio2 = random.nextInt(10 - 0 + 1) + 0;

    TextView txtNumeroAleatorio1;
    TextView txtNumeroAleatorio2;

    // pausa
    private Button pauseButton;
    private Dialog pauseDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_dos);

        txtNumeroAleatorio1 = findViewById(R.id.tv1Juego2);
        txtNumeroAleatorio1.setText(String.valueOf(numeroAleatorio1));
        txtNumeroAleatorio2 = findViewById(R.id.tv3Juego2);
        txtNumeroAleatorio2.setText(String.valueOf(numeroAleatorio2));

        int resultadoTabla = numeroAleatorio1 * numeroAleatorio2; // Resultado de la operación

        List<Integer> valores = new ArrayList<>();
        valores.add(resultadoTabla);

        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int valorAleatorio;
            do {
                valorAleatorio = random.nextInt(11); // Generar valores aleatorios
            } while (valorAleatorio == resultadoTabla);
            valores.add(valorAleatorio);
        }

        Collections.shuffle(valores);

        Button boton1 = findViewById(R.id.btnVerdadero);
        Button boton2 = findViewById(R.id.btnFalso);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(0) == resultadoTabla) {
                    Toast.makeText(getApplicationContext(), "¡Muy bien!", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                } else {
                    Toast.makeText(getApplicationContext(), "¡Sigue intentando!", Toast.LENGTH_SHORT).show();
                }
                recreate();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(1) == resultadoTabla) {
                    Toast.makeText(getApplicationContext(), "¡Muy bien!", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                } else {
                    Toast.makeText(getApplicationContext(), "¡Sigue intentando!", Toast.LENGTH_SHORT).show();
                }
                recreate();
            }
        });

        // Mostrar el resultado aleatorio en el TextView de respuesta
        TextView txtRespuesta = findViewById(R.id.tv5Juego2);
        boolean respuestaCorrecta = random.nextBoolean();
        if (respuestaCorrecta) {
            txtRespuesta.setText(String.valueOf(resultadoTabla));
            valores.set(0, resultadoTabla);
        } else {
            int respuestaAleatoria = valores.get(0);
            txtRespuesta.setText(String.valueOf(respuestaAleatoria));
        }

        boton1.setText("Verdadero");
        boton2.setText("Falso");


        //Pausa

        pauseButton = findViewById(R.id.btnJuego2Pausa);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPauseDialog();
            }
        });

    }

    private void showPauseDialog() {
        pauseDialog = new Dialog(juego_dos.this);
        pauseDialog.setContentView(R.layout.menupausa4);

        Button resumeButton = pauseDialog.findViewById(R.id.resumeButton);
        Button exitButton = pauseDialog.findViewById(R.id.exitButton);

        resumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para reanudar el juego
                pauseDialog.dismiss();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para salir del juego
                finish();
            }
        });

        pauseDialog.show();
    }
}