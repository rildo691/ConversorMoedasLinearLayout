package com.example.conversormoedaslinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_valor;
    Button btn_kwanza;
    Button btn_real;
    Button btn_dolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor = (EditText) findViewById(R.id.et_valor);
        btn_kwanza = (Button) findViewById(R.id.btn_kwanza);
        btn_dolar = (Button) findViewById(R.id.btn_dolar);
        btn_real = (Button) findViewById(R.id.btn_real);

        btn_kwanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_valor.getText().toString().equals("")){
                    double converter;

                    if (et_valor.getText().toString().contains(",")){
                        Toast.makeText(MainActivity.this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                    else {
                        converter = Double.parseDouble(et_valor.getText().toString()) * 795.61;
                        Toast.makeText(MainActivity.this, "€ " + et_valor.getText().toString() + " = " + "Kz " + converter, Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Deve inserir um valor em primeiro lugar", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_dolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_valor.getText().toString().equals("")){
                    double converter;

                    if (et_valor.getText().toString().contains(",")){
                        Toast.makeText(MainActivity.this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                    else {
                        converter = Double.parseDouble(et_valor.getText().toString()) * 1.22;
                        Toast.makeText(MainActivity.this, "€ " + et_valor.getText().toString() + " = " + "Kz " + converter, Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Deve inserir um valor em primeiro lugar", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!et_valor.getText().toString().equals("")){
                    double converter;

                    if (et_valor.getText().toString().contains(",")){
                        Toast.makeText(MainActivity.this, "Se pretender inserir um valor decimal deve substituir a vírgula pelo ponto", Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                    else {
                        converter = Double.parseDouble(et_valor.getText().toString()) * 6.37;
                        Toast.makeText(MainActivity.this, "€ " + et_valor.getText().toString() + " = " + "Kz " + converter, Toast.LENGTH_SHORT).show();
                        et_valor.setText("");
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Deve inserir um valor em primeiro lugar", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}