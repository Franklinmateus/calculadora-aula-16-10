package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button botaoSoma, botaoSubtracao, botaoDivisao, botaoMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSoma = findViewById(R.id.btnSoma);
        botaoSubtracao = findViewById(R.id.btnSubtrair);
        botaoDivisao = findViewById(R.id.btnDivisao);
        botaoMulti = findViewById(R.id.btnMulti);


        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itSoma = new Intent(MainActivity.this, telaSoma.class);
                startActivity(itSoma);
            }
        });

        botaoSubtracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent itSub = new Intent(MainActivity.this, telaSubtracao.class);
                startActivity(itSub);
            }
        });

        botaoDivisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent itDiv = new Intent(MainActivity.this, telaDivisao.class);
                startActivity(itDiv);
            }
        });

        botaoMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent itMulti = new Intent(MainActivity.this, telaMulti.class);
                startActivity(itMulti);
            }
        });


    }
}