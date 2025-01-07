package com.example.ex06031;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textV;
    String text;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textV=findViewById(R.id.textV);
        counter=0;
    }

    public void pressed(View view) {
        counter++;
        text="This is a click number: "+counter;
        textV.setText(text);
        textV.setVisibility(View.VISIBLE);
    }
}