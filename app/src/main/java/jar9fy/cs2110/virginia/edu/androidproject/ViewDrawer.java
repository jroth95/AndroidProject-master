package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.Image;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;


/**
 * Created by student on 4/6/2015.
 */
public class ViewDrawer extends View {

    public static final int THRESHOLD = 20;

    int lives = 1;
    ArrayList<Character> enemyList = new ArrayList<Character>();

    //RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);

    public void construct(Context context){
        Duke d = new Duke(context);
        Louisville l = new Louisville(context);

        enemyList.add(d);
        enemyList.add(l);
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

        for( int i = 0; i < enemyList.size(); i++ ){
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX()- (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);

            if( enemyList.get(i).getX() > canvas.getHeight()){
                lives -= 1;
                enemyList.remove(i);
                i--;
            }
           enemyList.get(i).move();
        }

        invalidate();
    }
}
