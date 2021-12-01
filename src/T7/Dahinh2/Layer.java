//package T7.Dahinh2;
// shapes.removeIf(s -> s instanceof Circle);

import T7.Dahinh2.Circle;
import T7.Dahinh2.Shape;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * Xoa circle.
     */
    public void removeCircles() {
        shapes.removeIf(s -> s instanceof Circle);
    }

    /**
     * lay tt.
     *
     * @return tt.
     */
    public String getInfo() {
        StringBuilder sp = new StringBuilder("");
        sp.append("Layer of crazy shapes:\n");
        for (Shape s : shapes) {
            sp.append(s.toString());
            sp.append("\n");
        }
        return sp.toString();
    }

    /**
     * Ham xoa phan tu.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }

}

