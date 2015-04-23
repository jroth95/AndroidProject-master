package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/14/2015.
 */
public class NotreDame extends View implements Character {

        Bitmap notredame  = BitmapFactory.decodeResource(getResources(), R.drawable.notredame);
        float x = 100,y = -300;
        float velocityY = 4;
        int notredameX1, notredameX2;
        int notredameY1, notredameY2;
        float notredamelocation1, notredamelocation2;
        Rect aroundNotreDame;


    public NotreDame(Context context) {
            super(context);

        }

        @Override
        public void move() {

            y += velocityY;
          //  this.makeRectangle();
        }

        @Override
        public Bitmap getBMap() {
            return notredame;
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
//
//    @Override
//    public boolean makeRectangle() {
//        notredamelocation1 = this.getX();
//
//        notredameX1 = (int) notredamelocation1;
//        notredameX2 = notredameX1 + notredame.getWidth();
//
//        notredamelocation2 = this.getY();
//        notredameY1 = (int) notredamelocation2;
//        notredameY2 = notredameY1 - notredame.getHeight();
//
//        aroundNotreDame.set(notredameX1, notredameY1, notredameX2, notredameY1);
//
//        return true;
//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundNotreDame;
//    }

}
