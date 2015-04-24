package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */


public class Duke extends View implements Character{

    Bitmap duke  = BitmapFactory.decodeResource(getResources(), R.drawable.duke);
    float x = 200,y = -200;
    float velocityY = 2;
    Point point;
    int dukeX1, dukeX2;
    int dukeY1, dukeY2;
    float dukelocation1, dukelocation2;
    Rect aroundDuke;



    public Duke(Context context){
        super(context);
        point = new Point();
    }

    public int getcharX() {
        return point.x;
    }

    public int getcharY() {
        return point.y;
    }

    public void setCharX( int x) {
        point.x = x ;
    }

    public void setCharY(int y) {
        point.y = y;
    }

    public Point getPoint() {
        return point;
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
    public boolean checkForCollision(Basketball ball) {

        if (this.getcharX() < 0 && ball.getcharX() < 0) {
            return false;
        }
        Rect r1 = getRectangle();
        Rect r2 = ball.getRectangle();
        Rect r3 = new Rect(r1);
        if (r1.intersect(r2)) {
            for (int i = r1.left; i < r1.right; i++) {
                for (int j = r1.top; j < r1.bottom; j++) {
                    if (duke.getPixel(i - r3.left, j - r3.top) != Color.TRANSPARENT) {
                        if (ball.getBMap().getPixel(i - r2.left, j - r2.top) != Color.TRANSPARENT) {
                            return true;
                        }
                    }
                }
            }

        }
        return false;
    }

   // @Override
    public Rect makeRectangle() {
        dukelocation1 = this.getX();
        dukeX1 = (int) dukelocation1;
        dukeX2 = dukeX1 + duke.getWidth();

        dukelocation2 = this.getY();
        dukeY1 = (int) dukelocation2;
        dukeY2 = dukeY1 + duke.getHeight();

        aroundDuke.set(dukeX1, dukeY1, dukeX2, dukeY1);

        return aroundDuke;
    }

    public Rect getRectangle() {
        return aroundDuke;
    }
}
