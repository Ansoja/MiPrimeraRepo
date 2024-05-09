package com.example.matefacil;



import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.app.AlertDialog;
import android.app.Dialog;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.media.MediaPlayer;

import org.w3c.dom.Text;


public class juego_tres extends AppCompatActivity {

    Random random = new Random();

    //Jugador UNO
    int numeroAleatorio1 = random.nextInt(15 - 0 + 1) + 0;
    int numeroAleatorio2 = random.nextInt(15 - 0 + 1) + 0;

    TextView txtNumeroAleatorio1;
    TextView txtNumeroAleatorio2;

    TextView txtNumeroAleatorio3;
    TextView txtNumeroAleatorio4;

    private Button pauseButton;
    private Dialog pauseDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_tres);

        txtNumeroAleatorio1 = findViewById(R.id.tvSumas3Ju11);
        txtNumeroAleatorio1.setText(String.valueOf(numeroAleatorio1));
        txtNumeroAleatorio2 = findViewById(R.id.tvSumas3Ju12);
        txtNumeroAleatorio2.setText(String.valueOf(numeroAleatorio2));

        txtNumeroAleatorio3 = findViewById(R.id.tvSumas3Ju21);
        txtNumeroAleatorio4 = findViewById(R.id.tvSumas3Ju22);

        txtNumeroAleatorio3.setText("" + numeroAleatorio1);
        txtNumeroAleatorio4.setText("" + numeroAleatorio2);

        List<Integer> valores = new ArrayList<>();
        int resultadoSuma = numeroAleatorio1 + numeroAleatorio2; // Resultado de la suma predefinida
        valores.add(resultadoSuma);

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int valorAleatorio = random.nextInt(10); // Generar valores aleatorios
            valores.add(valorAleatorio);
        }

        Collections.shuffle(valores);

        //Jugador 1
        Button boton1 = findViewById(R.id.btnSumas3Ju11);
        Button boton2 = findViewById(R.id.btnSumas3Ju12);
        Button boton3 = findViewById(R.id.btnSumas3Ju13);
        Button boton4 = findViewById(R.id.btnSumas3Ju14);

        //Jugador 2
        Button boton11 = findViewById(R.id.btnSumas3Ju21);
        Button boton22 = findViewById(R.id.btnSumas3Ju22);
        Button boton33 = findViewById(R.id.btnSumas3Ju23);
        Button boton44 = findViewById(R.id.btnSumas3Ju24);

        //Jugador 1
        boton1.setText(String.valueOf(valores.get(0)));
        boton2.setText(String.valueOf(valores.get(1)));
        boton3.setText(String.valueOf(valores.get(2)));
        boton4.setText(String.valueOf(valores.get(3)));

        //Jugador 2
        boton11.setText(String.valueOf(valores.get(0)));
        boton22.setText(String.valueOf(valores.get(1)));
        boton33.setText(String.valueOf(valores.get(2)));
        boton44.setText(String.valueOf(valores.get(3)));

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(0) == resultadoSuma) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion = awa.getInt("score_1", 0)+ 10;
                    awa.edit().putInt("score_1", puntuacion).apply();
                    TextView puntuacion1 = findViewById(R.id.tvPuntuacion1);
                    puntuacion1.setText("" + puntuacion);

                    if(puntuacion1.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 1").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
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
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion = awa.getInt("score_1", 0)+ 10;
                    awa.edit().putInt("score_1", puntuacion).apply();
                    TextView puntuacion1 = findViewById(R.id.tvPuntuacion1);
                    puntuacion1.setText("" + puntuacion);

                    if(puntuacion1.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 1").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
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
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion = awa.getInt("score_1", 0)+ 10;
                    awa.edit().putInt("score_1", puntuacion).apply();
                    TextView puntuacion1 = findViewById(R.id.tvPuntuacion1);
                    puntuacion1.setText("" + puntuacion);

                    if(puntuacion1.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 1").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
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
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion = awa.getInt("score_1", 0)+ 10;
                    awa.edit().putInt("score_1", puntuacion).apply();
                    TextView puntuacion1 = findViewById(R.id.tvPuntuacion1);
                    puntuacion1.setText("" + puntuacion);

                    if(puntuacion1.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 1").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        boton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(0) == resultadoSuma) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion22 = awa.getInt("score_2", 0)+ 10;
                    awa.edit().putInt("score_2", puntuacion22).apply();
                    TextView puntuacion2 = findViewById(R.id.tvPuntuacion2);
                    puntuacion2.setText("" + puntuacion22);

                    if(puntuacion2.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 2").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion22 >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
                    recreate();
                } else {
                    Toast.makeText(getApplicationContext(), "Sigue intentando", Toast.LENGTH_SHORT).show();
                }
            }
        });

        boton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(1) == resultadoSuma) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion22 = awa.getInt("score_2", 0)+ 10;
                    awa.edit().putInt("score_2", puntuacion22).apply();
                    TextView puntuacion2 = findViewById(R.id.tvPuntuacion2);
                    puntuacion2.setText("" + puntuacion22);

                    if(puntuacion2.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 2").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion22 >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
                    recreate();
                } else {
                }
            }
        });

        boton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(2) == resultadoSuma) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion22 = awa.getInt("score_2", 0)+ 10;
                    awa.edit().putInt("score_2", puntuacion22).apply();
                    TextView puntuacion2 = findViewById(R.id.tvPuntuacion2);
                    puntuacion2.setText("" + puntuacion22);

                    if(puntuacion2.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 2").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion22 >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
                    recreate();
                } else {
                }
            }
        });

        boton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valores.get(3) == resultadoSuma) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.correctsound);
                    mediaPlayer.start();
                    SharedPreferences awa = getSharedPreferences("puntuación", Context.MODE_PRIVATE);
                    int puntuacion22 = awa.getInt("score_2", 0)+ 10;
                    awa.edit().putInt("score_2", puntuacion22).apply();
                    TextView puntuacion2 = findViewById(R.id.tvPuntuacion2);
                    puntuacion2.setText("" + puntuacion22);

                    if(puntuacion2.getText().equals("100")){
                        new AlertDialog.Builder(juego_tres.this).setMessage("Ganó el jugador 2").setNeutralButton("Volver a jugar",  null).show();
                    }

                    if(puntuacion22 >= 100){
                        SharedPreferences.Editor editor = awa.edit();
                        editor.clear();
                        editor.apply();
                    }
                    recreate();
                } else {
                }
            }
        });


        //Pausa
        pauseButton = findViewById(R.id.btnPausaJuego3);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPauseDialog();
            }
        });
    }

    private void showPauseDialog () {
        pauseDialog = new Dialog(juego_tres.this);
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