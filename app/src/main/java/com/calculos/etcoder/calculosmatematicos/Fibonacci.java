package com.calculos.etcoder.calculosmatematicos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by eder on 11/05/15.
 */
public class Fibonacci extends Activity implements View.OnClickListener{
    private TextView numeros;
    private Button btnclcfibonacci, btnlimpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fibonacci);
        btnclcfibonacci=(Button) findViewById(R.id.btncalcfibonacci);
        btnlimpiar=(Button) findViewById(R.id.btnlimpiarfb);
        btnclcfibonacci.setOnClickListener(this);
        btnlimpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btncalcfibonacci){
            double resfibonacci, numserie, numuno, numdos,resant,ressig;
            resfibonacci=0;
            numuno=1;
            numdos=0;
            numeros=(TextView) findViewById(R.id.etfibonacci);
            numserie=Double.parseDouble(numeros.getText().toString());
            resfibonacci=1;
            resant=0;
            for(int i=0; i<=numserie;i++){
                resfibonacci=numuno+numdos;
                numuno=numdos;
                numdos=resfibonacci;
            }
            resfibonacci=(resfibonacci+numuno)-1;
            numeros=(TextView) findViewById(R.id.resfibonacci);
            numeros.setText(String.valueOf(resfibonacci));
        }else {
            numeros=(TextView) findViewById(R.id.resfibonacci);
            numeros.setText(String.valueOf(""));
            numeros=(TextView) findViewById(R.id.etfibonacci);
            numeros.setText(String.valueOf(""));
        }

    }
}
