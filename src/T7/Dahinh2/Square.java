//
package T7.Dahinh2;

import java.text.DecimalFormat;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Square[topLeft=" + this.topLeft.toString() + ",side="
                + df.format(getSide()) + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

    /**
     * check.
     *
     * @param obj dt.
     * @return boolean.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            double check = Math.abs(this.getSide() - other.getSide());
            if (check <= 0.001 && this.topLeft.equals(other.topLeft)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
