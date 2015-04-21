package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */


public class Duke extends View implements Character{

    Bitmap duke  = BitmapFactory.decodeResource(getResources(), R.drawable.duke);
    float x = 200,y = -200;
    float velocityY = 2;

    public Duke(Context context){
        super(context);
    }

    @Override
    public Bitmap getBMap() {
       return duke;
    }

    public void move(){
        y += velocityY;
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
}
