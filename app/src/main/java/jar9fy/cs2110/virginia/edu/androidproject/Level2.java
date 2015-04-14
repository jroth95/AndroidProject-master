package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class Level2 extends ActionBarActivity {

    int scorecount = 0;
    RelativeLayout layout;
    ImageView cavman;
    ImageView basketball;
    boolean didShoot = false;
    ViewDrawer2 v = new ViewDrawer2(this);


//    //create sound for you ball

    //MediaPlayer collide = MediaPlayer.create(this, R.raw.collide);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_level2);

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

        final Intent i3 = new Intent( this, Level3.class);

        if( scorecount == 200 ){
            startActivity(i3);

        }

        Button shoot = (Button) findViewById(R.id.shoot_button);
        shoot.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast begin2 = Toast.makeText(Level2.this, "shoot!", Toast.LENGTH_SHORT);
                begin2.show();
                didShoot = true;
//                shootBall.start();


               /* scorecount = scorecount + 100;

                if (scorecount == 300) {

                    startActivity(i2);
                    Toast begin2 = Toast.makeText(MainActivity.this, "You made a layup into level 3!", Toast.LENGTH_SHORT);
                    begin2.show();
                }*/
            }
        });
    }

    public void onDeath(){
        if( v.getLives() == 0 ){
            Toast begin = Toast.makeText(Level2.this, "Not such a big guy are you? You died!!", Toast.LENGTH_SHORT);
            begin.show();
            onDestroy();
        }
    }

}
