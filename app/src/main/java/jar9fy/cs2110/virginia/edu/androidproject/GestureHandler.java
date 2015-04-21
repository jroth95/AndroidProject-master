package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by student on 4/20/2015.
 */
public class GestureHandler extends GestureDetector.SimpleOnGestureListener {



    Context c;

    public GestureHandler(Context c) {
        this.c = c;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
       Toast begin = Toast.makeText(c, "yo", Toast.LENGTH_SHORT);
        begin.show();
        return true;
    }
}

