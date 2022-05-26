package com.example.custom_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    private LovelyView myView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        myView=(LovelyView)findViewById(R.id.custView);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnPressed(View view){
        //update the view
        myView.setCircleCol(Color.GREEN);
        myView.setCircleCol(Color.MAGENTA);
        myView.setLabelText("Help");

    }
    

}
