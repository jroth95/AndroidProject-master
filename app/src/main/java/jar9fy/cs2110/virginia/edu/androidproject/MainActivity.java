package jar9fy.cs2110.virginia.edu.androidproject;

import android.media.MediaPlayer;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    int scorecount = 0;
    RelativeLayout layout;
    ImageView cavman;
    ImageView basketball;
    ViewDrawer v;


//    private GestureDetectorCompat detect;
//    private GestureHandler handle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v = new ViewDrawer(this);
//
//        this.handle = new GestureHandler(this);
//        this.detect = new GestureDetectorCompat(this,handle);

        setContentView(R.layout.activity_main);

        Toast begin = Toast.makeText(MainActivity.this, "Let the games begin!", Toast.LENGTH_SHORT);
        begin.show();


        //give movement to cavman and basketball
        cavman = (ImageView) findViewById(R.id.cavman);
        layout = (RelativeLayout) findViewById(R.id.layout);
        basketball = (ImageView) findViewById(R.id.basketball);

        //layout gets onTouch listener attached to it
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                cavman.setX(event.getX());
                basketball.setX(event.getX() + 125);

                return true;
            }

        });

        final Intent i2 = new Intent(this, Level2.class);

        if (scorecount == 200) {
            startActivity(i2);

        }
    }

    public void clickScore(View v){
        Intent i = new Intent(this, Winners.class);
        startActivity(i);
    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        return detect.onTouchEvent(event);
//    }
}

