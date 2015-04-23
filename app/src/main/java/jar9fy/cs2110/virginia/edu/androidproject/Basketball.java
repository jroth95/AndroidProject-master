package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by student on 4/6/2015.
 */
public class Basketball extends View {

    Bitmap basketball  = BitmapFactory.decodeResource(getResources(), R.drawable.basketball);
    Point point;
    public Point vel;


    public Basketball(Context context) {
        super(context);
    }

    public void move(){
        point.y -= vel.y;
    }

    public int getVelocityY() {
        return vel.y;
    }

    public Bitmap getBMap(){
        return basketball;
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

    public void setVelocity(int x, int y) {
        vel = new Point (x,y);
    }

    public Point getPoint() {
        return point;
    }


}
