package T9;

import java.text.DecimalFormat;

public class Circle implements GeometricObject {
    private double radius;
    private Point center;
    public static final double PI = 3.14;

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Lay info.
     *
     * @return IF.
     */
    @Override
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle[" + center.getInfo() + ",r="
                + df.format(this.radius) + "]";
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }

}
