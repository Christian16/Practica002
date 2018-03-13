package com.hermesis.christian.practica002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
       res= (TextView)findViewById(R.id.textView3);

    }

    public void suma (View v)
    {
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float resultado = numero1 + numero2;

        res.setText(Float.toString(resultado) );

    }

    public  void resta(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float resultado = numero1 - numero2;

        res.setText(Float.toString(resultado));
    }

    public void multi(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float resultado = numero1 * numero2;

        res.setText(Float.toString(resultado));
    }

    public void divi(View v){
        float numero1 = Float.parseFloat(num1.getText().toString());
        float numero2 = Float.parseFloat(num2.getText().toString());

        float resultado = numero1 / numero2;

        res.setText(Float.toString(resultado));
    }


}

