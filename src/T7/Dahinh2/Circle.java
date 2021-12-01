package T7.Dahinh2;//package T7.Dahinh2;


import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    /**
     * Khai bao.
     *
     * @param center pint.
     * @param radius radius.
     * @param color  color.
     * @param filled f.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
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

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Circle[center=" + center.toString() + ",radius="
                + df.format(this.radius) + ",color="
                + this.color + ",filled=" + this.isFilled() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * Ham so sanh.
     *
     * @param obj doi tuong.
     * @return ket qua.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if (Math.abs(this.radius - other.radius) <= 0.001 && this.center.equals(other.center)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.radius, this.center);
    }

}
