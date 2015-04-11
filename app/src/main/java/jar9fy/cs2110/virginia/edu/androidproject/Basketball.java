package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by student on 4/6/2015.
 */
public class Basketball extends View {
    RelativeLayout layout;
    ImageView basketball;


    public Basketball(Context context) {
        super(context);
    }

    public void move() {

        layout = (RelativeLayout) findViewById(R.id.layout);

        //layout gets onTouch listener attached to it
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                basketball.setX(event.getX());

                return true;
            }

        });

    }
}
