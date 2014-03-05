package control;

import model.Tort;

/**
 * Created by riblee on 2014.03.05..
 */
public class Iteracio {
    private static Tort t = new Tort(-42, -42);

    public static void main(String[] args) {
        t.println();
        t=t.kivon(new Tort(3,1));
        t.println();
        /*t.egyszerusit();
        t.println();*/
    }
}
