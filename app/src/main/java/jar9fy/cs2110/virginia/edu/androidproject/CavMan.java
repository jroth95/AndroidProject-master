package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by student on 4/6/2015.
 */
public class CavMan extends View implements Character{
    RelativeLayout layout;
    ImageView cavman;
    ImageView basketball;

    public CavMan(Context context) {
        super(context);

    }


    public void move() {
        cavman = (ImageView) findViewById(R.id.cavman);
        layout = (RelativeLayout) findViewById(R.id.layout);
        basketball = (ImageView) findViewById(R.id.basketball);


        //layout gets onTouch listener attached to it
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                cavman.setX(event.getX());
                basketball.setX(event.getX());

                return true;
            }

        });
    }

}
