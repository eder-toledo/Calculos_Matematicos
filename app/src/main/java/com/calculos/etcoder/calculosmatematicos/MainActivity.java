package com.calculos.etcoder.calculosmatematicos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnfactorial, btnfibonacci, btnpotencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfactorial=(Button) findViewById(R.id.btnirfactorial);
        btnfibonacci=(Button) findViewById(R.id.btnirfibonacci);
        btnpotencia=(Button) findViewById(R.id.btnirpotencia);
        btnfactorial.setOnClickListener(this);
        btnfibonacci.setOnClickListener(this);
        btnpotencia.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //onclick es para responder al evento click en los botones
    @Override
    public void onClick(View v) {
        //evaluamos el id del elemento al que se esta dando click
        if(v.getId()==R.id.btnirfactorial){
            //Con este codigo podemos mandar a llamar una activity
            startActivity(new Intent(MainActivity.this, Factorial.class));

        }else if(v.getId()==R.id.btnirfibonacci){
            startActivity(new Intent(MainActivity.this, Fibonacci.class));
        }else {
            startActivity(new Intent(MainActivity.this, Potencia.class));
        }

    }
}
