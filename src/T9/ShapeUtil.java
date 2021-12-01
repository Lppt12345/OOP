package T9;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * In danh sach de nhap vao.
     *
     * @param shapes danh sach shap.
     * @return string.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder info = new StringBuilder("");
        info.append("Circle:\n");
        for (GeometricObject i : shapes) {
            if (i instanceof Circle) {
                info.append(i.getInfo());
                info.append("\n");
            }
        }
        info.append("Triangle:\n");
        for (GeometricObject i : shapes) {
            if (i instanceof Triangle) {
                info.append(i.getInfo());
                info.append("\n");
            }
        }
        return info.toString();
    }

    /**
     * Ham main.
     *
     * @param args bien ham main.
     */
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        List<GeometricObject> shapes = new ArrayList<>();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(7, 4);
        Point p3 = new Point(5, 6);
        Circle circle1 = new Circle(p1, 2);
        shapes.add(circle1);
        Point p4 = new Point(0, 2);
        Point p5 = new Point(7, 4);
        Point p6 = new Point(2, 6);
        Circle circle2 = new Circle(p2, 2);
        shapes.add(circle2);
        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p4, p5, p6);
        shapes.add(t1);
        shapes.add(t2);
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(shapeUtil.printInfo(shapes));
    }
}
