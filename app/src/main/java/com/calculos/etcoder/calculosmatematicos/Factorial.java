package com.calculos.etcoder.calculosmatematicos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by eder on 11/05/15.
 */
public class Factorial extends Activity implements View.OnClickListener {
    private TextView numeros;
    private Button btnclcfactorial, btncancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factorial);
        btnclcfactorial=(Button) findViewById(R.id.btncalcfactorial);
        btncancel=(Button) findViewById(R.id.btnlimpiarft);
        btnclcfactorial.setOnClickListener(this);
        btncancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        double factorial, numero;
        if(v.getId()==R.id.btncalcfactorial){
            numeros=(TextView) findViewById(R.id.etfibonacci);
            numero= Double.parseDouble(numeros.getText().toString());
            factorial=1;
            for(int i=1;i<=numero;i++){
                factorial=factorial*i;
            }
            numeros=(TextView) findViewById(R.id.resfactorial);
            numeros.setText(String.valueOf(factorial));
        }else {
            numeros=(TextView) findViewById(R.id.etfibonacci);
            numeros.setText(String.valueOf(""));
            numeros=(TextView) findViewById(R.id.resfactorial);
            numeros.setText(String.valueOf(""));
        }
    }
}
