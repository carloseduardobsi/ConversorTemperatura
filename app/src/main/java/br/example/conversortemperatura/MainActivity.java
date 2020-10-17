package br.example.conversortemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Temp C = (F - 32) * 5 / 9
    Temp F = (C * 9 / 5) + 32*/


    public void converterCelsiosTofarenheit(View view) {
        TextView valor = ((TextView) findViewById(R.id.textotemperatura));
        if(!valor.getText().toString().equals("")&&!valor.getText().toString().equals(null)){
            Float celsius = Float.valueOf(valor.getText().toString() + "f");
            celsius = (celsius * 9 / 5) + 32;
            valor.setText(celsius.toString());
            TextView mostrar = ((TextView) findViewById(R.id.mostraConvertido));
            mostrar.setText(celsius.toString()+"° F");

        }else{
            TextView mostrar = ((TextView) findViewById(R.id.mostraConvertido));
            mostrar.setText("Valor inválido");

        }


    }
    public void converterfarenheitToCelsius(View view) {

        TextView valor = ((TextView) findViewById(R.id.textotemperatura));
        if(!valor.getText().toString().equals("")&&!valor.getText().toString().equals(null)){
            Float farenheit = Float.valueOf(valor.getText().toString() + "f");
            farenheit = (farenheit - 32) * 5 / 9;
            valor.setText(farenheit.toString());
            TextView mostrar = ((TextView) findViewById(R.id.mostraConvertido));
            mostrar.setText(farenheit.toString()+"° C");

        }else{
            TextView mostrar = ((TextView) findViewById(R.id.mostraConvertido));
            mostrar.setText("Valor inválido");
        }

    }


}