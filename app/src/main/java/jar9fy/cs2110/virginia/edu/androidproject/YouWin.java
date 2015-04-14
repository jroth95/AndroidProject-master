package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class YouWin extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_win);
    }

    private class gameOver extends Thread{

        @Override
        public void run() {
            try {
                Thread.sleep(6000);
            }catch(Exception e) {
                Log.e("winner", "splashScreen is up ");
            }

            YouWin.this.finish();
        }
    }
}
