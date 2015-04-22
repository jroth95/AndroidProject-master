package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by student on 4/6/2015.
 */
public class CavMan extends View {

    Bitmap cavman  = BitmapFactory.decodeResource(getResources(), R.drawable.cavman);
    Point p = new Point(-1,-1);
    int x, y;


    public CavMan(Context context) {
        super(context);

    }

    public Bitmap getBMap() {
        return cavman;
    }

    public float getVelocityY() {
        return 0;
    }

    public int getCharX(){
        return x;

    }

    public int getCharY(){
        return y;
    }

    public void setCharX(int x){
        p.x = x;
    }

    public void setCharY(int y){
        p.y = y;
    }

}
