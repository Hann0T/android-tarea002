package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Ejercicio04 extends AppCompatActivity {

    Button btnCalular;
    TextView txtRes;
    EditText txtSueldoBase;
    Spinner spCargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio04);

        txtRes = (TextView) findViewById(R.id.txtRes4);
        txtSueldoBase = (EditText) findViewById(R.id.txtSueldoBase);
        spCargo = (Spinner) findViewById(R.id.spCargo4);

        btnCalular = (Button) findViewById(R.id.btnCalcular4);
        btnCalular.setOnClickListener(view -> calcular());
    }

    public void calcular() {
        int bonificacion = 0;
        int asignacion = 0;
        int refrigerio = 0;

        String cargo = spCargo.getSelectedItem().toString();

        if(cargo.equals("Obrero")) {
            bonificacion = 100;
            asignacion = 120;
        }

        if(cargo.equals("Empleado")) {
            bonificacion = 120;
            asignacion = 150;
            refrigerio = 200;
        }

        if(cargo.equals("Ejecutivo")) {
            bonificacion = 250;
            asignacion = 500;
            refrigerio = 250;
        }

        int base = Integer.parseInt(txtSueldoBase.getText().toString());
        String total = "Bonificacion S/." + bonificacion + "\nAsignacion S/." + asignacion + "\nRefrigerio S/." + refrigerio + "\nTotal S/." + (bonificacion + asignacion + refrigerio + base);

        txtRes.setText(total);
    }
}