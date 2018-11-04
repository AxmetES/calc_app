package com.hw_3_calculator.erkin.calc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    Button btn_minus,btn_plus,btn_dev, btn_multpl, btn_eqal, btn_dot;
    ImageButton btn_clr;
    TextView info,result;

    final char ADDITION ='+';
    final char SUBTRACTION ='-';
    final char MULTIPLICATION ='*';
    final char DIVISION ='/';

    double val1 = Double.NaN;
    double val2;

    /*
    int choice;
     Double a,b,c;
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });



    }
    private void setupUIViews(){
        btn_0 =(Button)findViewById(R.id.btn_0);
        btn_1 =(Button)findViewById(R.id.btn_1);
        btn_2 =(Button)findViewById(R.id.btn_2);
        btn_3 =(Button)findViewById(R.id.btn_3);
        btn_4 =(Button)findViewById(R.id.btn_4);
        btn_5 =(Button)findViewById(R.id.btn_5);
        btn_6 =(Button)findViewById(R.id.btn_6);
        btn_7 =(Button)findViewById(R.id.btn_7);
        btn_8 =(Button)findViewById(R.id.btn_8);
        btn_9 =(Button)findViewById(R.id.btn_9);
        btn_clr =(ImageButton) findViewById(R.id.btn_clr);
        btn_minus =(Button)findViewById(R.id.btn_minus);
        btn_plus =(Button)findViewById(R.id.btn_plus);
        btn_dev =(Button)findViewById(R.id.btn_dev);
        btn_multpl =(Button)findViewById(R.id.btn_multpl);
        btn_eqal =(Button)findViewById(R.id.btn_eqal);
        btn_dot =(Button)findViewById(R.id.btn_dot);
        info = (TextView)findViewById(R.id.tvControl);
        result = (TextView)findViewById(R.id.tvResult);


    }




/*
    @OnClick({R.id.btn_0,R.id.btn_1,R.id.btn_2,R.id.btn_3,R.id.btn_4,R.id.btn_5,R.id.btn_6,R.id.btn_7,R.id.btn_8,R.id.btn_9})
    public void onButtonClick(Button v){
        if (v.getId()==btn_0.getId())
            txtNumber.append("0");
        else if (v.getId()==btn_1.getId())
            txtNumber.append("1");
        else if(v.getId()==btn_2.getId())
            txtNumber.append("2");
        else if (v.getId()==btn_3.getId())
            txtNumber.append("3");
        else if (v.getId()==btn_4.getId())
            txtNumber.append("4");
        else if (v.getId()==btn_5.getId())
            txtNumber.append("5");
        else if (v.getId()==btn_6.getId())
            txtNumber.append("6");
        else if (v.getId()==btn_7.getId())
            txtNumber.append("7");
        else if (v.getId()==btn_8.getId())
            txtNumber.append("8");
        else if (v.getId()==btn_9.getId())
            txtNumber.append("9");
    }

    @OnClick({R.id.btn_dot})
    public void DotButtonClick(Button v){
        if(v.getId()==btn_dot.getId()){
            if(txtNumber.getText().toString().isEmpty())
                txtNumber.append("0.");
            else if((v.getText().toString().indexOf("."))<0)
                txtNumber.append(".");
        }
    }

    @OnClick({R.id.btn_clr})
    public void ClearButtonClick(Button v){
        if(v.getId()==btn_clr.getId())
            txtNumber.setText("");
    }

    @OnClick({R.id.btn_plus,R.id.btn_multpl,R.id.btn_minus,R.id.btn_dev})
    public void OperationButtonClick(Button v){
        if (v.getId()==btn_plus.getId())
        {
            a=Double.parseDouble(v.getText().toString());
            choice=1;
            txtNumber.setText("");
        } else if (v.getId()==btn_minus.getId())
        {
            a=Double.parseDouble(v.getText().toString());
            choice=2;
            txtNumber.setText("");
        } else if (v.getId()==btn_multpl.getId())
        {
            a=Double.parseDouble(v.getText().toString());
            choice=3;
            txtNumber.setText("");
        } else if (v.getId()==btn_dev.getId())
        {
            a=Double.parseDouble(v.getText().toString());
            choice=4;
            txtNumber.setText("");
        }
    }

    @OnClick({R.id.btn_eqal})
    public void eqalButtonClick(Button v){
        if (v.getId()==btn_eqal.getId())
        {
            b=Double.parseDouble(txtNumber.getText().toString());
            switch (choice)
            {
                case 1:
                    c=a+b;
                    break;
                case 2:
                    c=a-b;
                case 3:
                    c=a*b;
                    break;
                case 4:
                    c=a/b;
                    break;
            }
            txtNumber.setText(Double.toString(c));
        }
    }
    */
}
