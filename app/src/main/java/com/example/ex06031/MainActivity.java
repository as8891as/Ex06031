package com.example.ex06031;

import android.graphics.Color;
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
    int checkNum;
    boolean checkSeven;
    float textSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textV=findViewById(R.id.textV);
        textSize=textV.getTextSize();
        counter=0;
        checkSeven=false;
    }

    public void pressed(View view) {
        textV.setTextSize(textSize/2);
        textV.setTextColor(Color.BLACK);
        counter++;
        checkNum=counter;
        while ((checkNum/10>0) || (checkNum==7))
        {
            if ((checkNum%10==7) || (checkNum%7==0))
            {
                checkSeven=true;
            }
            checkNum/=10;
        }
        if (checkSeven)
        {
            text="BOOM !";
            textV.setTextColor(Color.RED);
            textV.setTextSize(textSize*2);
        }
        else
        {
            text="This is a click number: "+counter;
        }
        textV.setText(text);
        checkSeven=false;
        textV.setVisibility(View.VISIBLE);
    }
}