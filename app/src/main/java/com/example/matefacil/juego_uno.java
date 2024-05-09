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



public class juego_uno extends AppCompatActivity {
    Random random = new Random();
    int numeroAleatorio1 = random.nextInt(15 - 0 + 1) + 0;
    int numeroAleatorio2 = random.nextInt(15 - 0 + 1) + 0;


    TextView txtNumeroAleatorio1;
    TextView txtNumeroAleatorio2;

    // pausa
    private Button pauseButton;
    private Dialog pauseDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_uno);

        txtNumeroAleatorio1 = findViewById(R.id.tvSumas1);
        txtNumeroAleatorio1.setText(String.valueOf(numeroAleatorio1));
        txtNumeroAleatorio2 = findViewById(R.id.tvSumas3);
        txtNumeroAleatorio2.setText(String.valueOf(numeroAleatorio2));

        List<Integer> valores = new ArrayList<>();
        int resultadoSuma = numeroAleatorio1 + numeroAleatorio2; // Resultado de la suma predefinida
        valores.add(resultadoSuma);

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int valorAleatorio = random.nextInt(30); // Generar valores aleatorios
            valores.add(valorAleatorio);
        }

        Collections.shuffle(valores);

        Button boton1 = findViewById(R.id.btnSumasR1);
        Button boton2 = findViewById(R.id.btnSumasR2);
        Button boton3 = findViewById(R.id.btnSumasR3);
        Button boton4 = findViewById(R.id.btnSumasR4);

        boton1.setText(String.valueOf(valores.get(0)));
        boton2.setText(String.valueOf(valores.get(1)));
        boton3.setText(String.valueOf(valores.get(2)));
        boton4.setText(String.valueOf(valores.get(3)));

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(0) == resultadoSuma) {
                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(1) == resultadoSuma) {
                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(2) == resultadoSuma) {
                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(3) == resultadoSuma) {
                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Pausa

        pauseButton = findViewById(R.id.btnSumaPausa);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPauseDialog();
            }
        });

    }


    private void showPauseDialog() {
        pauseDialog = new Dialog(juego_uno.this);
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