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
public class ViewDrawer3 extends View {

    int lives = 3;
    ArrayList<Character> enemyList = new ArrayList<Character>();

    public void construct(Context context){

        NotreDame nd = new NotreDame(context);
        UNC u = new UNC(context);
        TonyB t = new TonyB(context);

        enemyList.add(nd);
        enemyList.add(u);
        enemyList.add(t);

    }

    public ViewDrawer3(Context context) {
        super(context);
        construct(context);
    }

    public ViewDrawer3(Context context, AttributeSet attrs) {
        super(context, attrs);
        construct(context);
    }

    public ViewDrawer3(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        construct(context);
    }

    public void onDraw(Canvas canvas){

        super.onDraw(canvas);

        for( int i = 0; i < 2; ++i ){
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

    public int getLives(){
        return lives;
    }
}