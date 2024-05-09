package com.example.matefacil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class juego_cuatro extends AppCompatActivity {
    private Button pauseButton;
    private Dialog pauseDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_cuatro);

        //Pausa
        pauseButton = findViewById(R.id.btnPausaJuego4);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPauseDialog();
            }
        });
    }

    private void showPauseDialog() {
        pauseDialog = new Dialog(juego_cuatro.this);
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