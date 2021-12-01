////package T7;
//
//public class Rectangle extends Shape {
//    protected double width;
//    protected double length;
//
//    public Rectangle() {
//    }
//
//    @Override
//    public double getArea() {
//        return width * length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (width + length);
//    }
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    /**
//     * Khai bao.
//     *
//     * @param width  r.
//     * @param length d.
//     * @param color  m.
//     * @param filled f.
//     */
//    public Rectangle(double width, double length, String color, boolean filled) {
//        super(color, filled);
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    public String toString() {
//        return "Rectangle[width=" + width + ",length=" + length
//                + ",color=" + getColor() + ",filled=" + isFilled() + "]";
//    }
//}
