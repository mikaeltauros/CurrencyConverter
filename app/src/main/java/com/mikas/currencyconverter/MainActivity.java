package com.mikas.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert (View view){

        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);
        EditText currencyFinalEditText = (EditText) findViewById(R.id.currencyFinalEditText);

        Double currency = Double.parseDouble(currencyEditText.getText().toString());
        Double currencyFinal = Double.parseDouble(currencyFinalEditText.getText().toString());
        Double value = currency * currencyFinal;

        Toast.makeText(MainActivity.this, "Converted Currency Value: " + value.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
