package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

import jar9fy.cs2110.virginia.edu.androidproject.*;

/**
 * Created by student on 4/14/2015.
 */
public class Miami extends View implements Character{

    Bitmap miami  = BitmapFactory.decodeResource(getResources(), R.drawable.miami);
    float x = 100,y = -200;
    float velocityY = 3;
    int miamiX1,miamiX2;
    int miamiY1, miamiY2;
    float miamilocation1, miamilocation2;
    Rect aroundMiami;

    public Miami(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;
        //this.makeRectangle();
    }

    @Override
    public Bitmap getBMap() {
        return miami;
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
//        miamilocation1 = this.getX();
//
//        miamiX1 = (int) miamilocation1;
//        miamiX2 = miamiX1 + miami.getWidth();
//
//        miamilocation2 = this.getY();
//        miamiY1 = (int) miamilocation2;
//        miamiY2 = miamiY1 - miami.getHeight();
//
//        aroundMiami.set(miamiX1, miamiY1, miamiX2, miamiY1);
//
//        return true;

//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundMiami;
//    }
}
