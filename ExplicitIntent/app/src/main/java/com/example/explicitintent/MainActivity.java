package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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

                    Intent i = new Intent(v.getContext(), successfull.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText(getApplicationContext(),"Invalid user password",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
