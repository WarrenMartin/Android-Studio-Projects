package com.example.lovelyview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;

public class LovelyActivity extends AppCompatActivity {

    private LovelyView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovely);
        //myView = (LovelyView)findViewById(R.id.custView);
    }

    public void btnPressed(View view){
//update the View

        myView.setCircleColor(Color.GREEN);
        myView.setLabelColor(Color.MAGENTA);
        myView.setLabelText("Help");
    }
}