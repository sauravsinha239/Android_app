package com.example.contextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview;
        String contacts[] = {"Saurav", "Sachin", "AASU", "Niraj", "Priyanshu"};
        textview = findViewById(R.id.textview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
        textview.setAdapter(adapter);
        registerForContextMenu(listView);

    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        menu.setHeaderTitle("Chose The Action");


    }
    public <menu> boolean onContextItemSelected(menu item) {
        if (item.getClass().equals(R.id.open)) {
            Toast.makeText(getApplicationContext(), "Opning code", Toast.LENGTH_LONG).show();
        } else if (item.getClass().equals( R.id.save)) {
            Toast.makeText(getApplicationContext(), "Saving code", Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        Toast.makeText(getApplicationContext(), "Opning code", Toast.LENGTH_LONG).show();
        return true;
    }
}