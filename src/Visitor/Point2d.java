package Visitor;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Point2d extends Point {

    private double x, y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
