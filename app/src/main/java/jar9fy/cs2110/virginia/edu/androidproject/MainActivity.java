package jar9fy.cs2110.virginia.edu.androidproject;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.os.Handler;

import java.net.URL;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    int scorecount = 0;
    RelativeLayout layout;
    ImageView cavman;
    ImageView basketball;
    boolean didShoot = false;
    float baskY;

//
//    //create sound for you ball
//    MediaPlayer shootBall=  MediaPlayer.create(this, R.raw.shootbutton);
//    MediaPlayer collide = MediaPlayer.create(this, R.raw.collide);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        Toast begin = Toast.makeText(MainActivity.this, "Let the games begin!", Toast.LENGTH_SHORT);
        begin.show();


        //give movement to cavman and basketball
       cavman = (ImageView) findViewById(R.id.cavman);
        layout = (RelativeLayout) findViewById(R.id.layout);
        basketball = (ImageView) findViewById(R.id.basketball);

//        Loop render = new Loop();
//        render.execute();


        //layout gets onTouch listener attached to it
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                cavman.setX(event.getX() );
                basketball.setX(event.getX()+125);

                return true;
            }

        });


        final Intent i2 = new Intent( this, Level2.class);

        Button shoot = (Button) findViewById(R.id.shoot_button);
        shoot.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast begin2 = Toast.makeText(MainActivity.this, "shoot!", Toast.LENGTH_SHORT);
                begin2.show();
                didShoot = true;
//                shootBall.start();


               /* scorecount = scorecount + 100;

                if (scorecount == 300) {

                    startActivity(i2);
                    Toast begin2 = Toast.makeText(MainActivity.this, "You made a layup into level 2!", Toast.LENGTH_SHORT);
                    begin2.show();
                }*/
            }
        });
    }


//    //drawing the images
//    public class Loop extends AsyncTask<Void, Void, Void> {
//        @Override
//        protected Void doInBackground(Void... params) {
//
//            if( didShoot == true){
//                Log.d("jord", "it works");
//               baskY = basketball.getY();
//
//               baskY = baskY - 5;
//            }
//        return null;
//        }
//    }
//    public void resetBall(){
//        if( basketball.getY() < -10){
//            basketball.setY( cavman.getY());
//            basketball.setX( cavman.getX() + 125);
//        }
//    }


    public void clickScore(View v){
        Intent i = new Intent(this, Winners.class);
        startActivity(i);
    }
}

