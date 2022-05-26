package com.example.custom_view;

import android.content.Context;
import android.view.View;
import android.view.View;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

public class LovelyView extends View {
    public LovelyView(Context context,AttributeSet attrs) {
        super(context,attrs);
        circlePaint=new Paint();

        TypedArray a =context.getTheme().obtainStyledAttributes(attrs,R.styleable.LovelyView,0,0);

        try {
            //get the text and colors specified using the names in attrs.xml
            circleText=a.getString(R.styleable.LovelyView_circleLabel);
            circleCol=a.getInteger(R.styleable.LovelyView_circleColour,0); //0 is default
            labelCol=a.getInteger(R.styleable.LovelyView_labelColor,0);
        }finally {
            a.recycle();
        }

    }

    protected void onDraw(Canvas canvas){
        //draw the view
        //get the half of the width and height as we are working with a circle
        int viewWidthHalf=this.getMeasuredWidth()/2;
        int viewHeightHalf=this.getMeasuredHeight()/2;
        //get the radius as half of the width or height,whichever is smaller
        //subtract ten so that it has some space aroundit
        int radius=0;
        if(viewWidthHalf>viewHeightHalf)
            radius=viewHeightHalf-10;
        else
            radius=viewWidthHalf-10;

        //set the paint color using the circle color specified
        circlePaint.setColor(circleCol);

        //set text properties
        circlePaint.setTextAlign(Paint.Align.CENTER);
        circlePaint.setTextSize(50);

        //draw the text using the string attribute and chosen properties
        canvas.drawText(circleText,viewWidthHalf,viewHeightHalf,circlePaint);

    }
    public int getCircleColor(){
        return circleCol;
    }
    public int getLabelCol(){
        return labelCol;
    }
    public String getLabelText(){
        return circleText;
    }
    public void setCircleCol(int newColor){
        //update the instance variable
        circleCol=newColor;
        //redraw the view
        invalidate();
        requestLayout();
    }
    public void setLabelColor(int newColor){
        //update the instance variable
        labelCol=newColor;
        //redraw the view
        invalidate();
        requestLayout();
    }
    public void setLabelText(String newLabel){
        //update the instance variable
        circleText=newLabel;
        //redraw the view
        invalidate();
        requestLayout();
    }

    //circle and text colors
    private int circleCol, labelCol;
    //label text
    private String circleText;
    //paint for drawing custom view
    private Paint circlePaint;







}
