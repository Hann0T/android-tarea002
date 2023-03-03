package com.example.tareat002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ejercicio03 extends AppCompatActivity {
    Button btnCalcular;
    EditText txtNombre, txtHoras;
    TextView txtRes;
    Spinner spActividad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio03);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtHoras = (EditText) findViewById(R.id.txtHoras);
        txtRes = (TextView) findViewById(R.id.txtRes3);
        spActividad = (Spinner) findViewById(R.id.spActividad);
        btnCalcular = (Button) findViewById(R.id.btnCalcular3);

        btnCalcular.setOnClickListener(view -> calcular());
    }

    public void calcular() {
        double total = 0.0;
        double totalSemanal = 0.0;
        int horasBase = 40;
        String servicio = spActividad.getSelectedItem().toString();
        String nombre = txtNombre.getText().toString();
        int horas = Integer.parseInt(txtHoras.getText().toString());

        if(servicio.equals("Pintado")) {
            totalSemanal += 10.0 * horasBase;
        }
        if(servicio.equals("Laqueado")) {
            totalSemanal += 12.0 * horasBase;
        }
        if(servicio.equals("Barnizado")) {
            totalSemanal += 14.0 * horasBase;
        }

        double totalExtra = 0.0;
        if (horas > horasBase) {
            totalExtra += (totalSemanal * 0.3) * (horas - 40);
        }

        total = totalExtra + totalSemanal;

        txtRes.setText("El jornal Semanal sera de S/."+ totalSemanal +"\nEl jornal Extra sera de S/."+ totalExtra +"\nEl jornal Total sera de S/." + total);
    }
}