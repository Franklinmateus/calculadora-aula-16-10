package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class telaSubtracao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_subtracao);
    }

    public void subtrair(View v){
        EditText num1, num2;
        TextView resultado;

        num1 = findViewById(R.id.editNum1);
        num2 = findViewById(R.id.editNum2);

        resultado = findViewById(R.id.textResultado2);

        Double numero1 = Double.parseDouble(num1.getText().toString());
        Double numero2 = Double.parseDouble(num2.getText().toString());

        Double subtracao = (numero1 - numero2);

        resultado.setText(new DecimalFormat(".##").format(subtracao));


    }
}