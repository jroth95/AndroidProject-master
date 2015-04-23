package jar9fy.cs2110.virginia.edu.androidproject;

import android.content.Context;
import android.graphics.Rect;

/**
 * Created by student on 4/23/2015.
 */
public class Collide {
    Basketball b;
    CavMan c;
    Duke d;
    Louisville l;
    Miami m;
    NotreDame nd;
    PantSuit ps;
    TonyB tb;
    UNC u;


    public Collide(Context context) {
        Basketball b = new Basketball(context);
        CavMan c = new CavMan(context);
        Duke d = new Duke(context);
        Louisville l = new Louisville(context);
        Miami m = new Miami(context);
        NotreDame nd = new NotreDame(context);
        PantSuit ps = new PantSuit(context);
        TonyB tb = new TonyB(context);
        UNC u = new UNC(context);

    }

    public boolean checkDuke() {
        Rect ball = b.getRectangle();
        Rect duke = d.getRectangle();

        if (ball.intersect(duke)) {return true;}
        else {return false;}
    }
//
//    public boolean checkLouisville() {
//        Rect ball = b.getRectangle();
//        Rect louisville = l.getRectangle();
//
//        if (ball.intersect(louisville)) {return true;}
//        else {return false;}
//    }
//
//    public boolean checkMiami() {
//        Rect ball = b.getRectangle();
//        Rect miami = m.getRectangle();
//
//        if (ball.intersect(miami)) {return true;}
//        else {return false;}
//    }
//
//    public boolean checkNotreDame(){
//        Rect ball = b.getRectangle();
//        Rect notredame = nd.getRectangle();
//
//        if(ball.intersect(notredame)) {return true;}
//
//        else{return false;}
//    }
//
//    public boolean checkTonyB(){
//        Rect ball = b.getRectangle();
//        Rect tonyb = tb.getRectangle();
//
//        if(ball.intersect(tonyb)) {return true;}
//
//        else{return false;}
//    }
//
//    public boolean checkPantSuit(){
//        Rect ball = b.getRectangle();
//        Rect pantsuit = ps.getRectangle();
//
//        if(ball.intersect(pantsuit)) {return true;}
//
//        else{return false;}
//    }
//
//    public boolean checkUNC(){
//        Rect ball = b.getRectangle();
//        Rect unc = u.getRectangle();
//
//        if(ball.intersect(unc)){return true;}
//
//        else{return false;}
//    }


}
