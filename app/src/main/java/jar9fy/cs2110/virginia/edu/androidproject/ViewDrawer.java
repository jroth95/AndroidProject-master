package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.Image;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by student on 4/6/2015.
 */
public class ViewDrawer extends View implements Character {

    public static final int THRESHOLD = 20;

    Bitmap lousville  = BitmapFactory.decodeResource(getResources(), R.drawable.lousville);
    Bitmap duke  = BitmapFactory.decodeResource(getResources(), R.drawable.duke);
    float x1 = 50,x2 = 20,y1 = -10,y2 = -20;
    float velocityY1 = 5, velocityY2 = 5;
    //RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);

    public ViewDrawer(Context context) {
        super(context);
    }


    public void onDraw(Canvas canvas){

        super.onDraw(canvas);

        canvas.drawBitmap(lousville, x1 - (lousville.getWidth() / 2), y1 - (lousville.getHeight() / 2), null);
        canvas.drawBitmap(duke, x2 - (duke.getWidth() / 2), y2 - (duke.getHeight() / 2), null);

        invalidate();
    }

    public void move() {

        y1 += velocityY1;
        y2 += velocityY2;

   /*     //if it moves too far to the right it will begin to move to the left
        if (x1 >= layout.getWidth() - THRESHOLD) {
            velocityX1 = -5;
            x1 += velocityX1;
        }
        if (x2 > layout.getWidth() - THRESHOLD) {
            velocityX2 = -5;
            x2 += velocityX2;
        }
        //if it hits the left wall it will begin to move back to the right
        if (x1 >= 0) {
            velocityX1 = 5;
            x1 += velocityX1;
        }
        if (x2 >= 0) {
            velocityX2 = 5;
            x2 += velocityX2;
        }*/
    }
}
