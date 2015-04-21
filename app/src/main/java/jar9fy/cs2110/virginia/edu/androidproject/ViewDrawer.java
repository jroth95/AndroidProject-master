package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.Image;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by student on 4/6/2015.
 */
public class ViewDrawer extends View {

    public static final int THRESHOLD = 20;

    int lives = 1;

    ArrayList<Character> enemyList = new ArrayList<Character>();
  //  ArrayList<Basketball> balls = new ArrayList<>();
    Toast begin = Toast.makeText(getContext(), "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);

    public void construct(Context context){
        Duke d = new Duke(context);
        Louisville l = new Louisville(context);

        enemyList.add(d);
        enemyList.add(l);


//        //fill up your basketball array
//        Basketball b1 = new Basketball(context);
//        Basketball b2 = new Basketball(context);
//        Basketball b3 = new Basketball(context);
//        Basketball b4 = new Basketball(context);
//        Basketball b5 = new Basketball(context);
//        Basketball b6 = new Basketball(context);
//        Basketball b7 = new Basketball(context);
//        Basketball b8 = new Basketball(context);
//        Basketball b9 = new Basketball(context);
//        Basketball b10 = new Basketball(context);
//
//        balls.add(b1);
//        balls.add(b2);
//        balls.add(b3);
//        balls.add(b4);
//        balls.add(b5);
//        balls.add(b6);
//        balls.add(b7);
//        balls.add(b8);
//        balls.add(b9);
//        balls.add(b10);
    }

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

    public void onDraw(Canvas canvas){

        super.onDraw(canvas);

        for( int i = 0; i < 2; ++i ){
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX()- (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);
           enemyList.get(i).move();
            if( enemyList.get(i).getY() > canvas.getHeight() || ( enemyList.get(i+1).getY() > canvas.getHeight()) ) {
                begin.show();
            }
        }
//        for( int j = 0; j < balls.size(); ++j){
//            canvas.drawBitmap(balls.get(j).getBMap(), balls.get(j).getX()- (balls.get(j).getBMap().getWidth() / 2), balls.get(j).getY() - (balls.get(j).getBMap().getHeight() / 2), null);
//        }
        invalidate();
    }

    public int getLives(){
        return lives;
    }
}
