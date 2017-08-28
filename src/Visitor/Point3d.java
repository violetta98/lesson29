package Visitor;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Point3d extends Point {

    private double x, y, z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

}
