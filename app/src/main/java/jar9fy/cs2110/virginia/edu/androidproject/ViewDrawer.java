package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Toast;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import android.view.MotionEvent;

/**
 * Created by student on 4/6/2015.
 */
public class ViewDrawer extends View implements OnTouchListener {

    public static final int THRESHOLD = 20;

    int lives = 1;

    int count = 0;
    float x, y;

    ArrayList<Character> enemyList = new ArrayList<>();
    ArrayList<Basketball> balls = new ArrayList<>();
    GestureDetector gestureDetector;
    boolean isTapped = false;

    Toast begin = Toast.makeText(getContext(), "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);

    Bitmap cavman  = BitmapFactory.decodeResource(getResources(), R.drawable.cavman);

    Bitmap basketball  = BitmapFactory.decodeResource(getResources(), R.drawable.basketball);

    public void construct(Context context) {

        //get your bitmaps
       Duke d = new Duke(context);
       Louisville l = new Louisville(context);
       Basketball ball = new Basketball(context);
       CavMan cav = new CavMan(context);
       // gestureDetector = new GestureDetector(context, new GestureListener());

        enemyList.add(d);
        enemyList.add(l);
    }


//
//    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
//
//        @Override
//        public boolean onDown(MotionEvent e) {
//            return true;
//        }
//        // event when double tap occurs
//        @Override
//        public boolean onDoubleTap(MotionEvent event) {
//            isTapped = true;
//            begin.show();
//            return isTapped;
//        }
//    }

    public ViewDrawer(Context context) {
        super(context);
        construct(context);
    }

    public ViewDrawer(Context context, AttributeSet attrs) {
        super(context, attrs);
        construct(context);
    }

    public ViewDrawer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        construct(context);
    }

    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        return true;
    }

    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawBitmap(cavman, x - (cavman.getWidth() / 2 ), 800, null);
        canvas.drawBitmap(basketball, x - (cavman.getWidth() / 2 -160) ,875, null);

        for (int i = 0; i < enemyList.size(); ++i) {
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX() - (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);
            enemyList.get(i).move();
            if( ( enemyList.get(i).getY() > canvas.getHeight() ) ){

                begin.show();

            }

        }
        invalidate();

    }


    public int getLives(){
        return lives;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
