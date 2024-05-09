package com.example.matefacil;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class juego_cuatro2 extends AppCompatActivity {

    private Button pauseButton;
    private Dialog pauseDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_cuatro2);


        //Colocar las abejas en el layout
        // Obtiene el número aleatorio para determinar la cantidad de imágenes
        Random random = new Random();
        int imageCount = random.nextInt(10) + 1; // Número aleatorio entre 1 y 10

        LinearLayout imageLayout = findViewById(R.id.imageLayout);

        for (int i = 0; i < imageCount; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.abejita);
            imageView.setPadding(8, 8, 8, 8);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            params.gravity = Gravity.CENTER_HORIZONTAL;
            params.weight = 1; // Distribuye el espacio disponible de manera equitativa

            imageView.setLayoutParams(params); // Establece los parámetros de diseño

            imageLayout.addView(imageView);
        }

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                50, // Ancho en píxeles
                50  // Altura en píxeles
        );

        //Botones
        List<Integer> valores = new ArrayList<>();
        int cantidadAbejas =  imageCount; // Resultado de la suma predefinida
        valores.add(cantidadAbejas);

        for (int i = 0; i < 3; i++) {
            int valorAleatorio = random.nextInt(10); // Generar valores aleatorios
            valores.add(valorAleatorio);
        }

        Collections.shuffle(valores);

        Button boton1 = findViewById(R.id.btnAbejas1);
        Button boton2 = findViewById(R.id.btnAbejas2);
        Button boton3 = findViewById(R.id.btnAbejas3);
        Button boton4 = findViewById(R.id.btnAbejas4);

        boton1.setText(String.valueOf(valores.get(0)));
        boton2.setText(String.valueOf(valores.get(1)));
        boton3.setText(String.valueOf(valores.get(2)));
        boton4.setText(String.valueOf(valores.get(3)));

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(0) == cantidadAbejas) {
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
                if (valores.get(1) == cantidadAbejas) {
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
                if (valores.get(2) == cantidadAbejas) {
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
                if (valores.get(3) == cantidadAbejas) {
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
        pauseButton = findViewById(R.id.btnPausaJuego4);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPauseDialog();
            }
        });
    }

    //Pausa
    private void showPauseDialog() {
        pauseDialog = new Dialog(juego_cuatro2.this);
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