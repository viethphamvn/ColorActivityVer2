package edu.temple.coloractivityver2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] colors = {"CYAN","BLUE","RED","BLACK","GRAY","GREEN","MAGENTA","WHITE","YELLOW","PURPLE"};

        Spinner spinner = findViewById(R.id.spinner);

        spinner.setAdapter(new ColorAdapter(this, colors.length, colors));



    }
}