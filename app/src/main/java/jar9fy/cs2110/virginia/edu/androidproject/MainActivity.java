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

public class MainActivity extends ActionBarActivity {

    int scorecount = 0;
   // RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);
    ViewDrawer v;
    Basketball ball;
    CavMan cav;

    boolean isShoot = false;

    private float cavX, cavY;


        @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            v = new ViewDrawer(this);
            ball = new Basketball(this);
            cav = new CavMan(this);

            setContentView(R.layout.activity_main);

            Toast begin = Toast.makeText(MainActivity.this, "Let the games begin!", Toast.LENGTH_SHORT);
            begin.show();

//            layout.setOnTouchListener(new View.OnTouchListener() {
//                @Override
//                public boolean onTouch(View v, MotionEvent event) {
//                    cavX = event.getX();
//                    cavY = event.getY();
//
//                        if (!isShoot) {
//                            ball.setCharX( (int) cavX + 125 );
//                            ball.setCharY( (int) cavY - 75);
//                            cav.setCharX( (int ) cavX);
//                            cav.setCharY( (int) cavY);
//
//                        }
//                    return true;
//                    }});

                final Intent i2 = new Intent(this, Level2.class);

                if(scorecount==200) {

                }

            //make a shoot button
            Button launch = (Button) findViewById(R.id.shoot_button);
            launch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast hey = Toast.makeText(MainActivity.this, "shoot", Toast.LENGTH_SHORT);
                    hey.show();
                    shootBall();
                }
            });

            if(isShoot){
               ball.move();
            }
            }

    public void clickScore(View v){
        Intent i = new Intent(this, Winners.class);
        startActivity(i);
    }

    public void shootBall() {
        isShoot = true;
    }



}

