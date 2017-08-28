package Visitor;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Point p = new Point2d(1, 2);
        Visitor v = new Chebyshev();
        p.accept(v);
        System.out.println(p.getMetric());
    }

}
