package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class PantSuit extends View implements Character {

    Bitmap duke  = BitmapFactory.decodeResource(getResources(), R.drawable.duke);
    float x = 100,y = -500;
    float velocityY = 3;

    public PantSuit(Context context) {
        super(context);
    }

    @Override
    public void move() {

        y += velocityY;

        if( y > 700) {

            //player loses life
        }

    }

    @Override
    public Bitmap getBMap() {
        return null;
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
