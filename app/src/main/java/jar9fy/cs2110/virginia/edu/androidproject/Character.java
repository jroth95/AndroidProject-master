package jar9fy.cs2110.virginia.edu.androidproject;

import android.graphics.Bitmap;

/**
 * Created by student on 4/13/2015.
 */
public interface Character {

    public void move();
    public Bitmap getBMap();
    public float getX();
    public float getY();
    public float getVelocityY();
}
