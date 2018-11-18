package com.hw_3_calculator.erkin.calc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    private TextView display;
    private String _info = "";
    private String currentOperator ="";
    private String result = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView)findViewById(R.id.display);
        display.setText(_info);

    }

    private void updateDisplay(){
        display.setText(_info);
    }

    public void onClickNumber(View v){
        if (result != ""){
            clear();
            updateDisplay();
        }
        Button b  = (Button) v;
        _info += b.getText();
        updateDisplay();
    }

    public void onClickOperator(View v){
        if (result!=""){
            _info = result;
            result = "";
        }

        Button b = (Button) v;
        _info += b.getText();
        currentOperator = b.getText().toString();
        updateDisplay();
    }


    public void clear(){
        _info = "";
        currentOperator = "";
        result = "";
    }

    public void onClickClear(View v){
        clear();
        updateDisplay();
    }

    private double operate(String a, String b, String op){
        switch (op){
            case "+": return Double.valueOf(a) + Double.valueOf(b);
            case "-": return Double.valueOf(a) - Double.valueOf(b);
            case "*": return Double.valueOf(a) * Double.valueOf(b);
            case "/": try {
                return Double.valueOf(a) / Double.valueOf(b);
            }catch (Exception e){
                Log.d("Calc",e.getMessage());
            }
                default: return -1;

        }
    }

    public void onClickEqual(View v){
        String[] operation = _info.split(Pattern.quote(currentOperator));
        if(operation.length < 2) return;

            result = String.valueOf(operate(operation[0],operation[1],currentOperator));
            display.setText( String.valueOf(result));

    }
}
