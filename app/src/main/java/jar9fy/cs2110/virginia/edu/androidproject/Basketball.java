package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by student on 4/6/2015.
 */
public class Basketball extends View {

    ImageView cavman = (ImageView) findViewById(R.id.cavman);

    Bitmap basketball  = BitmapFactory.decodeResource(getResources(), R.drawable.basketball);

    float x = cavman.getX() + 125;
    float y = cavman.getY();
    int velocityY = 4;

    public Basketball(Context context) {
        super(context);
    }

    public void move(){
        y -= velocityY;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public Bitmap getBMap(){
        return basketball;
    }

}
