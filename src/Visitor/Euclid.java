package Visitor;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Euclid implements Visitor {

    @Override
    public void visit(Point2d p) {
        p.setMetric(Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY()));
    }

    @Override
    public void visit(Point3d p) {
        p.setMetric(Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY() + p.getZ() * p.getZ() ) );
    }

}
