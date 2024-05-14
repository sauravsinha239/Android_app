package com.example.studentsregistrationform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name=(EditText) findViewById(R.id.name);
        EditText fname=(EditText)  findViewById(R.id.F_name);
        EditText DOB=(EditText) findViewById(R.id.dob);
        EditText Reg=(EditText) findViewById(R.id.RN);
        RadioGroup rbg=(RadioGroup) findViewById(R.id.rdb);
        EditText email=(EditText) findViewById(R.id.Email);
        Button btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View  v)
            {
                String nm=name.getText().toString();
                String fn=fname.getText().toString();
                String dob=DOB.getText().toString();
                String reg=Reg.getText().toString();
                String em=email.getText().toString();
                if (TextUtils.isEmpty(nm)&& TextUtils.isEmpty(fn)&&TextUtils.isEmpty(dob)&&TextUtils.isEmpty(reg)&&TextUtils.isEmpty(em))
                {
                    Toast.makeText(getApplicationContext(),"Plese fill All field",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Registration Sucessfull",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}