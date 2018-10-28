package com.hw_3_calculator.erkin.calc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    Button btn_minus,btn_plus,btn_dev, btn_dot, btn_eqal, btn_multpl;
    ImageButton btn_clr;
    EditText txtNumber;
     int choice;
     Double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_dot =(Button)findViewById(R.id.btn_dot);
        btn_eqal=(Button)findViewById(R.id.btn_eqal);
        btn_dev=(Button)findViewById(R.id.btn_dev);
        btn_multpl=(Button)findViewById(R.id.btn_multpl);
        btn_minus=(Button)findViewById(R.id.btn_minus);
        btn_plus=(Button)findViewById(R.id.btn_plus);
        btn_clr=(ImageButton) findViewById(R.id.btn_clr);



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                if (!(s.isEmpty()))
                txtNumber.setText(s+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=txtNumber.getText().toString();
                txtNumber.setText(s+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                txtNumber.setText(s+"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                int n = s.indexOf(".");
                if(s.isEmpty())
                    txtNumber.setText("0.");
                else if(n<0)
                    txtNumber.setText(s+".");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                a=Double.parseDouble(s);
                choice=1;
                txtNumber.setText("");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                a=Double.parseDouble(s);
                choice=2;
                txtNumber.setText("");
            }
        });
        btn_multpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                a=Double.parseDouble(s);
                choice=3;
                txtNumber.setText("");
            }
        });
        btn_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                a=Double.parseDouble(s);
                choice=4;
                txtNumber.setText("");
            }
        });
        btn_eqal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= txtNumber.getText().toString();
                b=Double.parseDouble(s);
                switch (choice)
                {
                    case 1:
                        c=a+b;
                        break;
                    case 2:
                        c=a-b;
                        break;
                    case 3:
                        c=a*b;
                        break;
                    case 4:
                        c=a/b;
                        break;
                }
                txtNumber.setText("");
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumber.setText("");
            }
        });


    }
}
