package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by student on 4/13/2015.
 */
public class Louisville extends View implements Character{

    Bitmap louisville  = BitmapFactory.decodeResource(getResources(), R.drawable.louisville);
    float x = 500,y = -700;
    float velocityY = 2;
    int louisvilleX1, louisvilleX2;
    int louisvilleY1, louisvilleY2;
    float louisvillelocation1, louisvillelocation2;
    Rect aroundLouisville;

    public Louisville(Context context) {
        super(context);
    }

    @Override
    public float getVelocityY() {
        return velocityY;
    }

    public void move(){
        y += velocityY;
       // this.makeRectangle();
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
//    @Override
//    public boolean makeRectangle() {
//        louisvillelocation1 = this.getX();
//        louisvilleX1 = (int) louisvillelocation1;
//        louisvilleX2 = louisvilleX1 + louisville.getWidth();
//
//        louisvillelocation2 = this.getY();
//        louisvilleY1 = (int) louisvillelocation2;
//        louisvilleY2 = louisvilleY1 - louisville.getHeight();
//
//        aroundLouisville.set(louisvilleX1, louisvilleY1, louisvilleX2, louisvilleY1);
//
//        return true;
//    }
//
//    @Override
//    public Rect getRectangle() {
//        return aroundLouisville;
//
//    }
}
