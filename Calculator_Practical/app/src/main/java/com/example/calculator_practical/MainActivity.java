package com.example.calculator_practical;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1;
    Button add,sub,mul,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.Sub);
        mul=findViewById(R.id.Mul);
        div=findViewById(R.id.Div);
        clear=findViewById(R.id.clear);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 =et1.getText().toString();
                String value2=et2.getText().toString();
                Double d1= Double.valueOf(value1);
                Double d2=Double.valueOf(value2);
                Double result=d1+d2;
                String res=String.valueOf(result);
                tv1.setText(res);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 =et1.getText().toString();
                String value2=et2.getText().toString();
                Double d1= Double.valueOf(value1);
                Double d2=Double.valueOf(value2);
                Double result=d1-d2;
                String res=String.valueOf(result);
                tv1.setText(res);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 =et1.getText().toString();
                String value2=et2.getText().toString();
                Double d1= Double.valueOf(value1);
                Double d2=Double.valueOf(value2);
                Double result=d1*d2;
                String res=String.valueOf(result);
                tv1.setText(res);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 =et1.getText().toString();
                String value2=et2.getText().toString();
                Double d1= Double.valueOf(value1);
                Double d2=Double.valueOf(value2);
                Double result=d1/d2;
                String res=String.valueOf(result);
                tv1.setText(res);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              et1.setText("");
              et2.setText("");
            }
        });
    }


}