package edu.temple.coloractivityver2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        ConstraintLayout canvas = findViewById(R.id.canvas);

        Intent receiveColor = getIntent();
        TextView banner = findViewById(R.id.textView2);

        String msg = receiveColor.getStringExtra("background");

        if (msg != null){
            banner.setText(msg);
            banner.setTextColor(Color.WHITE);
            canvas.setBackgroundColor(Color.parseColor(msg));
        }

    }
}
