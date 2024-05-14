package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TimePicker time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         time = (TimePicker) findViewById(R.id.timepick);
        Button set = (Button) findViewById(R.id.changetime);
        time.setIs24HourView(true);
        set.setText(getCurrentTime());
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                set.setText(getCurrentTime());

            }

        });
    }
    public String getCurrentTime(){
        String currentTime="Current Time: "+time.getHour()+":"+time.getMinute();
        return currentTime;
    }
}