package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       datePicker = findViewById(R.id.date);
        TextView show = findViewById(R.id.show);
        Button  click =  findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("Current Date "+getCurrentDate());
            }
        });
        }
    public String getCurrentDate(){
        StringBuilder stringb = new StringBuilder();
        stringb.append(datePicker.getMonth()+1+"/");
        stringb.append(datePicker.getDayOfMonth()+"/");
        stringb.append(datePicker.getYear());
        return stringb.toString();
    }
}