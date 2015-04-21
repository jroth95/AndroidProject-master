package jar9fy.cs2110.virginia.edu.androidproject;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by student on 4/20/2015.
 */
public class GestureHandler extends GestureDetector.SimpleOnGestureListener {

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.i("hello", "hello");
        return true;
    }
}
