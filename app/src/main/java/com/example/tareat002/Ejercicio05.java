package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio05 extends AppCompatActivity {
    Button btnCalcular;
    EditText txtMarca, txtTalla, txtPares;
    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio05);

        txtMarca = (EditText) findViewById(R.id.txtMarca);
        txtTalla = (EditText) findViewById(R.id.txtTalla);
        txtPares = (EditText) findViewById(R.id.txtPares);
        txtRes = (TextView) findViewById(R.id.txtRes5);

        btnCalcular = (Button) findViewById(R.id.btnCalcular5);
        btnCalcular.setOnClickListener(view -> calcular());
    }

    public void calcular() {
        String marca = txtMarca.getText().toString();
        if(marca.isEmpty()) {
            txtRes.setText("Ingrese una marca");
            return;
        }

        String tallaText = txtTalla.getText().toString();
        int talla = 0;
        if(!tallaText.isEmpty()) {
            talla = Integer.parseInt(tallaText);
        }
        String paresText = txtPares.getText().toString();
        int pares = 0;
        if(!paresText.isEmpty()) {
            pares = Integer.parseInt(paresText);
        }

        int precioZapatilla = 0;

        if(marca.equals("Nike")) {
           switch (talla) {
               case 38:
                   precioZapatilla = 150;
                   break;
               case 40:
                   precioZapatilla = 160;
                   break;
               case 42:
                   precioZapatilla = 160;
                   break;
               default:
                   precioZapatilla = 150;
                   break;
           }
        }

        if(marca.equals("Adidas")) {
            switch (talla) {
                case 38:
                    precioZapatilla = 140;
                    break;
                case 40:
                    precioZapatilla = 150;
                    break;
                case 42:
                    precioZapatilla = 150;
                    break;
                default:
                    precioZapatilla = 150;
                    break;
            }
        }

        if(marca.equals("Fila")) {
            switch (talla) {
                case 38:
                    precioZapatilla = 80;
                    break;
                case 40:
                    precioZapatilla = 85;
                    break;
                case 42:
                    precioZapatilla = 90;
                    break;
                default:
                    precioZapatilla = 100;
                    break;
            }
        }

        int venta = precioZapatilla * pares;

        double descuento = 0.0;

        if(pares > 2 && pares <= 5) {
           descuento = venta * 0.05;
        }

        if(pares > 6 && pares <= 10) {
            descuento = venta * 0.08;
        }

        if(pares > 11 && pares <= 20) {
            descuento = venta * 0.1;
        }

        if(pares > 20) {
            descuento = venta * 0.15;
        }

        double neto = venta - descuento;

        txtRes.setText("La venta es S/." + venta + "\nEl descuento es S/." + descuento + "\nEl neto es S/." + neto);
    }
}