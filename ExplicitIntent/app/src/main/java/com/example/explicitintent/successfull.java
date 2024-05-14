package com.example.explicitintent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class successfull extends AppCompatActivity
    {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.successfull_activity);

            Button logout =(Button) findViewById(R.id.Logoutbt);
            logout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            });
        }

    }

