package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class PantSuit extends View implements Character {

    Bitmap pantsuit  = BitmapFactory.decodeResource(getResources(), R.drawable.pantsuit);
    float x = 500,y = -600;
    float velocityY = 3;
    int pantsX1, pantsX2;
    int pantsY1, pantsY2;
    float pantslocation1, pantslocation2;
    Rect aroundPants;

    public PantSuit(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;
      //  this.makeRectangle();
    }

    @Override
    public Bitmap getBMap() {
        return pantsuit;

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
//        pantslocation1 = this.getX();
//
//        pantsX1 = (int) pantslocation1;
//        pantsX2 = pantsX1 + pantsuit.getWidth();
//
//        pantslocation2 = this.getY();
//        pantsY1 = (int) pantslocation2;
//        pantsY2 = pantsY1 - pantsuit.getHeight();
//
//        aroundPants.set(pantsX1, pantsY1, pantsX2, pantsY1);
//
//        return true;
//
//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundPants;
//    }
}
