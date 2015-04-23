package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by student on 4/6/2015.
 */
public class CavMan extends View {
    Bitmap cavman = BitmapFactory.decodeResource(getResources(), R.drawable.cavman);
    Point point;
    public Point vel;
    int x, y;

    public CavMan(Context context) {
        super(context);
    }

    public int getVelocityY() {
        return vel.y;
    }

    public Bitmap getBMap() {
        return cavman;
    }

    public int getcharX() {
        return point.x;
    }

    public int getcharY() {
        return point.y;
    }

    public void setCharX(int x) {
        point.x = x;
    }

    public void setCharY(int y) {
        point.y = y;
    }

    public void setVelocity(int x, int y) {
        vel = new Point(x, y);
    }

    public Point getPoint() {
        return point;
    }

    public void move() {
//        cavman = (ImageView) findViewById(R.id.cavman);
//        layout = (RelativeLayout) findViewById(R.id.layout);
//        basketball = (ImageView) findViewById(R.id.basketball);
//
//
//        //layout gets onTouch listener attached to it
//        layout.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//
//                cavman.setX(event.getX());
//                basketball.setX(event.getX() + 125);
//
//                return true;
//            }
//
//        });
    }
}
