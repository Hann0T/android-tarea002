package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btnEjercicio1;
    public Button btnEjercicio2;
    public Button btnEjercicio3;
    public Button btnEjercicio4;
    public Button btnEjercicio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjercicio1 = (Button) findViewById(R.id.btnEjercicio1);
        btnEjercicio1.setOnClickListener(view -> {
            Intent intent = new Intent(this, Ejercicio01.class);
            startActivity(intent);
        });

        btnEjercicio2 = (Button) findViewById(R.id.btnEjercicio2);
        btnEjercicio2.setOnClickListener(view -> {
            Intent intent = new Intent(this, Ejercicio02.class);
            startActivity(intent);
        });

        btnEjercicio3 = (Button) findViewById(R.id.btnEjercicio3);
        btnEjercicio3.setOnClickListener(view -> {
            Intent intent = new Intent(this, Ejercicio03.class);
            startActivity(intent);
        });

        btnEjercicio4 = (Button) findViewById(R.id.btnEjercicio4);
        btnEjercicio4.setOnClickListener(view -> {
            Intent intent = new Intent(this, Ejercicio04.class);
            startActivity(intent);
        });

        btnEjercicio5 = (Button) findViewById(R.id.btnEjercicio5);
        btnEjercicio5.setOnClickListener(view -> {
            Intent intent = new Intent(this, Ejercicio05.class);
            startActivity(intent);
        });
    }
}