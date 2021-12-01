package T12;

public class Rook extends Piece {
    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }


    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean checkPosition(Board board, int x, int y) {
        return false;
    }

    /**
     * check.
     *
     * @param board bang.
     * @param x     x.
     * @param y     y.
     * @return
     */
    @Override
    public boolean canMove(Board board, int x, int y) {

        Piece tmp = board.getAt(x, y); // Xet vi tri di chuyen den
        int xpiece = this.getCoordinatesX();
        int ypiece = this.getCoordinatesY();

        if ((xpiece == x && ypiece == y) || (xpiece != x && ypiece != y)) { // ko di chuyen
            return false;
        }

        if (board.validate(x, y)) {

            if (xpiece == x && y > ypiece) { // cang hang
                for (int i = ypiece + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
            }
            if (xpiece == x && y < ypiece) { // cang hang
                for (int i = y + 1; i < ypiece; i++) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
            }

            if (ypiece == y && x > xpiece) {
                for (int i = xpiece + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            }
            if (ypiece == y && x < xpiece) { // cung cot
                for (int i = x + 1; i < xpiece; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
            }

            if (tmp != null) {
                if (tmp.getColor().equals(this.getColor())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }
}
