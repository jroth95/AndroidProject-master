package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by student on 4/14/2015.
 */
public class ViewDrawer2 extends View {

    int lives = 2;
    ArrayList<Character> enemyList = new ArrayList<Character>();
    Toast begin = Toast.makeText(getContext(), "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);

    public void construct(Context context){

        Miami m = new Miami(context);
        NCState n = new NCState(context);
        PantSuit p = new PantSuit(context);

        enemyList.add(m);
        enemyList.add(n);
        enemyList.add(p);

    }

    public ViewDrawer2(Context context) {
        super(context);
        construct(context);
    }

    public ViewDrawer2(Context context, AttributeSet attrs) {
        super(context, attrs);
        construct(context);
    }

    public ViewDrawer2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        construct(context);
    }

    public void onDraw(Canvas canvas){

        super.onDraw(canvas);

        for( int i = 0; i < 3; ++i ){
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX()- (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);
            if( enemyList.get(i).getY() > canvas.getHeight() || ( enemyList.get(i+1).getY() > canvas.getHeight()) ) {
                begin.show();
            }
            enemyList.get(i).move();
        }
        invalidate();
    }

    public int getLives(){
        return lives;
    }
}
