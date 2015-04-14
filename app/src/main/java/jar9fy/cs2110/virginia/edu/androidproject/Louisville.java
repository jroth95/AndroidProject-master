package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */
public class Louisville extends View implements Character{

    Bitmap louisville  = BitmapFactory.decodeResource(getResources(), R.drawable.louisville);
    float x = 500,y = -1000;
    float velocityY = 3;

    public Louisville(Context context) {
        super(context);
    }

    @Override
    public float getVelocityY() {
        return velocityY;
    }

    public void move(){
        y += velocityY;

        if( y > 700) {

            //player loses life
        }

    }

    @Override
    public Bitmap getBMap() {
        return louisville;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }
}
