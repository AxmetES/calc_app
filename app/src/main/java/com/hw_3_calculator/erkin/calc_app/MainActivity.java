package com.hw_3_calculator.erkin.calc_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import butterknife.ButterKnife;
import butterknife.OnClick;



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

}
