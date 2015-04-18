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
    boolean didShoot = false;
    float baskY;
    ViewDrawer v = new ViewDrawer(this);
    //private GestureDetectorCompat gestureDetector;



//    //create sound for you ball

   //MediaPlayer collide = MediaPlayer.create(this, R.raw.collide);


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


        //layout gets onTouch listener attached to it
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                cavman.setX(event.getX() );
                basketball.setX(event.getX()+125);

                return true;
            }

        });

      //  this.gestureDetector = new GestureDetectorCompat(this, this);

        final Intent i2 = new Intent( this, Level2.class);

        if( scorecount == 200 ){
            startActivity(i2);

        }

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
    //this is for the basketball motion
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        this.gestureDetector.onTouchEvent(event);
//        return super.onTouchEvent(event);
//
//    }
//
//    @Override
//    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//        Basketball b = new Basketball(this);
//        b.move();
//
//        Basketball b2 = new Basketball(this);
//        b2.setY(cavman.getX() +125);
//
//        return true;
//    }

    public void clickScore(View v){
        Intent i = new Intent(this, Winners.class);
        startActivity(i);
    }

    public void onDeath(){
        if( v.getLives() == 0 ){
            Toast begin = Toast.makeText(MainActivity.this, "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);
           begin.show();
            onDestroy();
        }
    }
    //part of the gesture package
//    @Override
//    public boolean onDown(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public void onShowPress(MotionEvent e) {
//
//    }
//
//    @Override
//    public boolean onSingleTapUp(MotionEvent e) {
//        return false;
//    }
//
//    @Override
//    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
//        return false;
//    }
//
//    @Override
//    public void onLongPress(MotionEvent e) {
//
//    }
}

