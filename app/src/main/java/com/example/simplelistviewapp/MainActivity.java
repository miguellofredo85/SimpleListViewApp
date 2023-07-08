package com.example.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Adapter view
    ListView listView;
    //data list
    String[] world_cup = {"Germany", "Spain", "Brazil", "England", "USA", "Saudi A.", "Qatar" };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    listView = findViewById(R.id.listView); // this will be the adapter view, that contain the array list
    //Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.my_list_item,R.id.textView, world_cup );
        listView.setAdapter(adapter);
    }
}