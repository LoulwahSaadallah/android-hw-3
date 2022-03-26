package com.example.androidhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Games> videogames = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Games formula = new Games("Formula 1", R.drawable.formula1 , 2.0);
        videogames.add(formula);

        gamesAdapter GameAdapter = new gamesAdapter(this, 0, videogames);

        ListView list = findViewById(R.id.listview);
        list.setAdapter(GameAdapter);


    }
}