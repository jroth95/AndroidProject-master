package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

import jar9fy.cs2110.virginia.edu.androidproject.*;

/**
 * Created by student on 4/14/2015.
 */
public class Miami extends View implements Character{

    Bitmap miami  = BitmapFactory.decodeResource(getResources(), R.drawable.miami);
    float x = 100,y = -200;
    float velocityY = 3;

    public Miami(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;
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
}
