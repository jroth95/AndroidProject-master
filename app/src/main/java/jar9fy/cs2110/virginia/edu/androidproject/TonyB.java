package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */
public class TonyB extends View implements Character {

    Bitmap tony  = BitmapFactory.decodeResource(getResources(), R.drawable.tonybennett);
    float x = 100,y = -300;
    float velocityY = 3;

    public TonyB(Context context) {
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
}
