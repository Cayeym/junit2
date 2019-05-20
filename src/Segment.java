import javax.swing.*;

public class Segment {

    private Punt a;
    private Punt b;
    private double longitud;

    public Segment(){
        a = new Punt();
        b = new Punt();
        a.setX(1);
        a.setY(2);
        b.setX(2);
        b.setY(1);
    }

    public Segment(int xa, int ya, int xb, int yb){
        a = new Punt();
        b = new Punt();
        this.a.setX(xa);
        this.a.setY(ya);
        this.b.setX(xb);
        this.b.setY(yb);
    }

    public void Longitud(){
        longitud = Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
    }
}
