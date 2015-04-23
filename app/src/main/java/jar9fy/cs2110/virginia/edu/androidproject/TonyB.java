package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */
public class TonyB extends View implements Character {

    Bitmap tony  = BitmapFactory.decodeResource(getResources(), R.drawable.tonybennett);
    float x = 500,y = -700;
    float velocityY = 4;
    int tonyX1, tonyX2;
    int tonyY1, tonyY2;
    float tonylocation1, tonylocation2;
    Rect aroundTony;

    public TonyB(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;
        //this.makeRectangle();
    }

    @Override
    public Bitmap getBMap() {
        return tony;
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
//        tonylocation1 = this.getX();
//
//        tonyX1 = (int) tonylocation1;
//        tonyX2 = tonyX1 + tony.getWidth();
//
//        tonylocation2 = this.getY();
//        tonyY1 = (int) tonylocation2;
//        tonyY2 = tonyY1 - tony.getHeight();
//
//        aroundTony.set(tonyX1, tonyY1, tonyX2, tonyY1);
//
//        return true;
//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundTony;
//    }
}
