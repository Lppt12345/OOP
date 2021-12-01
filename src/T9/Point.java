package T9;

import java.text.DecimalFormat;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Khoang cach.
     *
     * @param t Point khac.
     * @return kc.
     */
    public double distance(Point t) {
        double x = t.pointX - this.pointX;
        double y = t.pointY - this.pointY;
        return Math.sqrt(x * x + y * y);
    }

    /**
     * so sanh.
     *
     * @param obj doi tuong truyen vao.
     * @return ket qua.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            if (Math.abs(this.pointX - other.pointX) <= 0.001
                    && Math.abs(this.pointY - other.pointY) <= 0.001) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Ham ghi ra toa do.
     *
     * @return toa do duoc ghi.
     */
    public String getInfo() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "(" + df.format(this.pointX)
                + "," + df.format(this.pointY) + ")";
    }
//    public String getInfo(){
//        return "(" +String.format("%.2f",pointX)+","+String.format("%.2f",pointY)+ ")";
//    }
}
