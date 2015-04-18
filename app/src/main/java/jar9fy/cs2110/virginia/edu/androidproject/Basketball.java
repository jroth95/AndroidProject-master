package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Color;
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

    ImageView basketball = (ImageView) findViewById(R.id.basketball);
    float y = basketball.getY();
    float velocityY = 3;


    public Basketball(Context context) {
        super(context);
    }

    public void move() {

        y += velocityY;

    }


}
