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
    Point p = new Point(-1,-1);
    int x, y;
    float velocityY = 4;

    public Basketball(Context context) {
        super(context);
    }

    public void move(){
        y -= velocityY;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public Bitmap getBMap(){
        return basketball;
    }

    public int getCharX(){
        return x;

    }

    public int getCharY(){
        return y;
    }

    public void setCharX(int x){
        p.x = x;
    }

    public void setCharY(int y){
        p.y = y;
    }
}
