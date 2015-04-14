package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class UNC extends View implements Character {

        Bitmap unc  = BitmapFactory.decodeResource(getResources(), R.drawable.unc);
        float x = 100,y = -300;
        float velocityY = 3;

        public UNC(Context context) {
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
            return unc;
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
