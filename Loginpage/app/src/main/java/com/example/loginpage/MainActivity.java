package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        EditText Email = (EditText)findViewById(R.id.edt1 );
        EditText Password = (EditText)findViewById(R.id.edt2);
        Button click=(Button)findViewById(R.id.LoginBt);
        click.setOnClickListener(new View.OnClickListener(){

            public  void onClick(View  v){

        if(Email.getText().toString().equals("sauravsinha239@gmail.com") && Password.getText().toString().equals("Admin"))
        {
            Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
            Email.setBackgroundColor(Color.green(1));
            Email.setVisibility(View.VISIBLE);
        }
        else {
            Toast.makeText(getApplicationContext(),"Invalid user password",Toast.LENGTH_SHORT).show();
            Email.setBackgroundColor(Color.red(1));
            Email.setVisibility(View.VISIBLE);
        }
            }
        });

    }
    }
