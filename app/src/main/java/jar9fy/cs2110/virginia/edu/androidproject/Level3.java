package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Level3 extends ActionBarActivity {

    int scorecount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        final Intent i3 = new Intent( this,YouWin.class);

        Button shoot = (Button) findViewById(R.id.shoot_button);
        shoot.setOnClickListener( new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                scorecount = scorecount + 100;

                if (scorecount == 300) {

                    startActivity(i3);

                }
            }
        });
    }



}
