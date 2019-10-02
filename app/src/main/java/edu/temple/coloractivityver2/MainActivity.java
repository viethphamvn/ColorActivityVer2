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

        final String[] colors = {"Select a color", "CYAN","BLUE","RED","BLACK","GRAY","GREEN","MAGENTA","WHITE","YELLOW","PURPLE"};

        Spinner spinner = findViewById(R.id.spinner);

        spinner.setAdapter(new ColorAdapter(this, colors.length, colors));
        spinner.setSelection(0,false);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent launchCanvas = new Intent(MainActivity.this, CanvasActivity.class);
                launchCanvas.putExtra("background", colors[position]);
                startActivity(launchCanvas);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
