package T12;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color = "white";

    /**
     * KT.
     *
     * @param x x.
     * @param y y.
     */
    public Piece(int x, int y) {
        this.coordinatesX = x;
        this.coordinatesY = y;
    }

    /**
     * KHai bao constructor.
     *
     * @param x     toa do x.
     * @param y     toa do y.
     * @param color mau
     */
    public Piece(int x, int y, String color) {
        this.coordinatesX = x;
        this.coordinatesY = y;
        this.color = color;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int x) {
        this.coordinatesX = x;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int y) {
        this.coordinatesY = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean checkPosition(Board board, int x, int y);

    public abstract boolean canMove(Board board, int x, int y);
}
