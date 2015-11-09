package com.calculos.etcoder.calculosmatematicos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by eder on 11/05/15.
 */
public class Potencia extends Activity implements View.OnClickListener{
    private TextView numeros;
    private Button btnclcpotencia, btnlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.potencia);
        btnclcpotencia=(Button) findViewById(R.id.btncalcpotencia);
        btnlimpiar=(Button) findViewById(R.id.btnlimpiar);
        btnclcpotencia.setOnClickListener(this);
        btnlimpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btncalcpotencia){
            double numpotencia, numpotenciar, resultadopotencia;
            numeros=(TextView) findViewById(R.id.etnumero);
            numpotenciar=Double.parseDouble(numeros.getText().toString());
            numeros=(TextView) findViewById(R.id.etpotencia);
            numpotencia=Double.parseDouble(numeros.getText().toString());
            resultadopotencia=1;
            for(int i=1; i<=numpotencia;i++){
                resultadopotencia=resultadopotencia*numpotenciar;
            }
            numeros=(TextView) findViewById(R.id.respotencia);
            numeros.setText(String.valueOf(resultadopotencia));
        }else {
            numeros=(TextView) findViewById(R.id.etpotencia);
            numeros.setText(String.valueOf(""));
            numeros=(TextView) findViewById(R.id.etnumero);
            numeros.setText(String.valueOf(""));
            numeros=(TextView) findViewById(R.id.respotencia);
            numeros.setText(String.valueOf(""));
        }

    }
}
