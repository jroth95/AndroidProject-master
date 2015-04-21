package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class NotreDame extends View implements Character {

        Bitmap notredame  = BitmapFactory.decodeResource(getResources(), R.drawable.notredame);
        float x = 100,y = -300;
        float velocityY = 4;

        public NotreDame(Context context) {
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
            return 0;
        }

        public float getX(){
            return x;
        }

        public float getY(){
            return y;
        }
}
