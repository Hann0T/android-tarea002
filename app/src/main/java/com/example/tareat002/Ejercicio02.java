package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Ejercicio02 extends AppCompatActivity {
    TextView txtRes, txtMonto;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio02);

        txtMonto = (TextView) findViewById(R.id.txtMonto);
        txtRes = (TextView) findViewById(R.id.txtRes2);
        btnCalcular = (Button) findViewById(R.id.btnCalcular2);

        btnCalcular.setOnClickListener(view -> calcular());
    }

    public void calcular() {
       String montoText = txtMonto.getText().toString();
       int monto = 0;
       if(!montoText.isEmpty()) {
          monto = Integer.parseInt(montoText);
       }

       double total = 0.0;

       if(monto < 10000) {
          total = monto * 0.05;
       }
       if(monto <= 50000 && monto >= 10000) {
           total = (monto * 0.075) + 200;
       }

       if(monto > 50000) {
           total = (monto * 0.09) + 300;
       }

       txtRes.setText("Total de comision: S/." + total );
    }
}