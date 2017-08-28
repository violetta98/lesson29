package Visitor;

/**
 * Created by Hillel9 on 28.08.2017.
 */
public abstract class Point {

    private double metric = -1;

    public abstract void accept(Visitor v);

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }

}
