package jar9fy.cs2110.virginia.edu.androidproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import android.os.Handler;

public class MainActivity extends ActionBarActivity {

    int scorecount = 0;
    ViewDrawer v;
    Basketball ball;
    CavMan cav;
    Duke d;
    private Handler frame = new Handler();
    private static final int FRAME_RATE = 20;


        @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            d = new Duke(this);
            v = new ViewDrawer(this);
            ball = new Basketball(this);
            cav = new CavMan(this);

            setContentView(R.layout.activity_main);

            Toast begin = Toast.makeText(MainActivity.this, "Let the games begin!", Toast.LENGTH_SHORT);
            begin.show();

            final Intent i2 = new Intent(this, Level2.class);

            if (scorecount == 200) {

            }
        }
    public Runnable update = new Runnable() {
        @Override
        synchronized public void run(){
            if( d.checkForCollision(ball) ){
                scorecount += 100;
                d.getBMap().recycle();
            }
            frame.removeCallbacks(update);
            frame.postDelayed(update, FRAME_RATE);
        }
    };

    public void clickScore(View v){
        Intent i = new Intent(this, Winners.class);
        startActivity(i);
    }


}

