package T7.Dahinh2;

import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Khai bao.
     *
     * @param width  r.
     * @param length d.
     * @param color  m.
     * @param filled f.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * khai bao.
     *
     * @param point  p.
     * @param width  w.
     * @param length l.
     * @param color  c.
     * @param filled f.
     */
    public Rectangle(Point point, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = point;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * So sanh.
     *
     * @param obj doi tuong.
     * @return ket qua sau so sanh.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            double checkWidth = Math.abs(this.width - other.width);
            double checckLength = Math.abs(this.length - other.length);
            if (checkWidth <= 0.001 && checckLength <= 0.001
                    && this.topLeft.equals(other.topLeft)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Rectangle[topLeft=" + topLeft.toString()
                + ",width=" + df.format(width) + ",length=" + df.format(length)
                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
