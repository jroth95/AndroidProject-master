package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */


public class Duke extends View implements Character{

    Bitmap duke  = BitmapFactory.decodeResource(getResources(), R.drawable.duke);
    float x = 200,y = -200;
    float velocityY = 2;
    int dukeX1, dukeX2;
    int dukeY1, dukeY2;
    float dukelocation1, dukelocation2;
    Rect aroundDuke;


    public Duke(Context context){
        super(context);
    }

    @Override
    public Bitmap getBMap() {
       return duke;
    }

    public void move(){
        y += velocityY;
       // this.makeRectangle();
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float getVelocityY(){
        return velocityY;
    }

//   // @Override
//    public boolean makeRectangle() {
//        dukelocation1 = this.getX();
//        dukeX1 = (int) dukelocation1;
//        dukeX2 = dukeX1 + duke.getWidth();
//
//        dukelocation2 = this.getY();
//        dukeY1 = (int) dukelocation2;
//        dukeY2 = dukeY1 - duke.getHeight();
//
//        aroundDuke.set(dukeX1, dukeY1, dukeX2, dukeY1);
//
//        return true;
//    }
//
//    //@Override
//    public Rect getRectangle() {
//        return aroundDuke;
//    }
}
