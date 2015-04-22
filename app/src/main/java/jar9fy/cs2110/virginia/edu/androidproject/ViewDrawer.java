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
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by student on 4/6/2015.
 */
public class ViewDrawer extends View {

    public static final int THRESHOLD = 20;

    int lives = 1;


    ArrayList<Character> enemyList = new ArrayList<>();
    ArrayList<Basketball> balls = new ArrayList<>();
    GestureDetector gestureDetector;
    boolean isTapped = false;
    public CavMan cav;
    public Basketball ball;
    Toast begin = Toast.makeText(getContext(), "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);

    Bitmap cavman  = BitmapFactory.decodeResource(getResources(), R.drawable.cavman);

    Bitmap basketball  = BitmapFactory.decodeResource(getResources(), R.drawable.basketball);

    public void construct(Context context) {

        //get your bitmaps
       Duke d = new Duke(context);
       Louisville l = new Louisville(context);
       ball = new Basketball(context);
       cav = new CavMan(context);
       // gestureDetector = new GestureDetector(context, new GestureListener());

        enemyList.add(d);
        enemyList.add(l);

    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent e) {
//        return gestureDetector.onTouchEvent(e);
//    }
//
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

    public void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawBitmap(cavman,canvas.getWidth()/2 ,600 ,null );
        canvas.drawBitmap(basketball,canvas.getWidth()/2 + 125 ,600 ,null );


//        if (isTapped == true) {
////            for (int j = 0; j < 1; ++j) {
////                canvas.drawBitmap(balls.get(j).getBMap(), balls.get(j).getX() - (balls.get(j).getBMap().getWidth() / 2), balls.get(j).getY() - (balls.get(j).getBMap().getHeight() / 2), null);
////                balls.get(j).move();
////                if( balls.get(j).getY() > 700 ) {
////                    balls.remove(j);
////                    isTapped = false;
////                }
////            }
//
//            //if basketball is launched then redraw
//        }

        for (int i = 0; i < 2; ++i) {
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX() - (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);
            enemyList.get(i).move();
            if (enemyList.get(i).getY() > canvas.getHeight() || (enemyList.get(i + 1).getY() > canvas.getHeight())) {
                begin.show();
            }
        }

        invalidate();
    }



    public int getLives(){
        return lives;
    }
}
