package T9;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
    }

    public Point getP1() {
        return p1;
    }

    /**
     * Khai bao.
     *
     * @param p1 p1.
     * @param p2 p2.
     * @param p3 p3.
     * @throws RuntimeException ib loi.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if (this.getArea() == 0) {
            throw new RuntimeException("Ko phai Triangle");
        }
    }

    public Point getP2() {
        return p2;
    }


    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double x = p2.distance(p3);
        double y = p3.distance(p1);
        double z = p1.distance(p2);
        double result = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return result;
    }

    @Override
    public double getPerimeter() {
        double x = p2.distance(p3);
        double y = p3.distance(p1);
        double z = p1.distance(p2);
        return x + y + z;
    }

    @Override
    public String getInfo() {
        return "Triangle["
                + p1.getInfo() + ","
                + p2.getInfo() + ","
                + p3.getInfo() + "]";
    }
}
