package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Ejercicio01 extends AppCompatActivity {
    TextView txtBasico, txtHijos, txtRes;
    Spinner spCargo;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio01);

        txtBasico = (TextView) findViewById(R.id.txtBasico);
        txtHijos = (TextView) findViewById(R.id.txtHijos);
        txtRes = (TextView) findViewById(R.id.txtRes);
        spCargo = (Spinner) findViewById(R.id.spCargo);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(view -> calcular(view));
    }

    protected void calcular(View view) {
        String cargo = spCargo.getSelectedItem().toString();
        int bono = 0;

        String hijosText = txtHijos.getText().toString();
        int hijos = 0;
        if(!hijosText.isEmpty()) {
            hijos = Integer.parseInt(hijosText);
        }

        String basicoText = txtBasico.getText().toString();
        int basico = 0;
        if(!basicoText.isEmpty()) {
            basico = Integer.parseInt(basicoText);
        }

        if (cargo.equals("Empleado")) {
            bono += 120;
        }

        if (cargo.equals("Obrero")) {
            bono += 100;
        }

        int total = basico + bono + (hijos * 41);
        txtRes.setText("El sueldo total es: S/." + total);
    }
}