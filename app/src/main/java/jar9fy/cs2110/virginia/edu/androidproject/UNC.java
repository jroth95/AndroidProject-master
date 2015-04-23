package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class UNC extends View implements Character {

    Bitmap unc  = BitmapFactory.decodeResource(getResources(), R.drawable.unc);
    float x = 300,y = -600;
    float velocityY = 4;
    int uncX1, uncX2;
    int uncY1, uncY2;
    float unclocation1, unclocation2;
    Rect aroundUnc;

    public UNC(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;
        //this.makeRectangle();
    }

    @Override
    public Bitmap getBMap() {
        return unc;
    }

    @Override
    public float getVelocityY() {
        return velocityY;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

//    @Override
//    public boolean makeRectangle() {
//        unclocation1 = this.getX();
//        uncX1 = (int) unclocation1;
//        uncX2 = uncX1 + unc.getWidth();
//
//        unclocation2 = this.getY();
//        uncY1 = (int) unclocation2;
//        uncY2 = uncY1 - unc.getHeight();
//
//        aroundUnc.set(uncX1, uncY1, uncX2, uncY1);
//
//        return true;
//
//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundUnc;
//    }
}
