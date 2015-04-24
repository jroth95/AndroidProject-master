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

    Toast begin = Toast.makeText(getContext(), "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);

    //enemies and collide
    Collide c;
    NotreDame nd;
    UNC u;
    TonyB t;

    //enemy list
    ArrayList<Character> enemyList = new ArrayList<Character>();
    boolean deadNot = false, deadUN = false, deadTony = false;

    public void construct(Context context){

        nd = new NotreDame(context);
        u = new UNC(context);
        t = new TonyB(context);

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

        for( int i = 0; i < 3; ++i ){
            canvas.drawBitmap(enemyList.get(i).getBMap(), enemyList.get(i).getX()- (enemyList.get(i).getBMap().getWidth() / 2), enemyList.get(i).getY() - (enemyList.get(i).getBMap().getHeight() / 2), null);
            if( enemyList.get(i).getY() > canvas.getHeight() || ( enemyList.get(i+1).getY() > canvas.getHeight()) ) {
                begin.show();
            }
            enemyList.get(i).move();
        }
//        if(c.checkNotreDame()){
//            nd.getBMap().recycle();
//        }
//        else if(c.checkUNC()){
//            u.getBMap().recycle();
//        }
//        else if(c.checkTonyB()){
//            t.getBMap().recycle();
//
//        }
        if( nd.getY() > canvas.getHeight() ){
            deadNot = true;
        }
        if( u.getY() > canvas.getHeight()  ){
            deadUN = true;
        }
        if( t.getY() > canvas.getHeight()){
            deadTony = true;
        }
        if( deadNot && deadUN&& deadTony){
            begin.show();
        }
        invalidate();

    }

    public int getLives(){
        return lives;
    }
}
