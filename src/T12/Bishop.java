package T12;

public class Bishop extends Piece {
    Bishop(int x, int y) {
        super(x, y);
    }

    Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean checkPosition(Board board, int x, int y) {
        return false;
    }

    /**
     * d.
     *
     * @param board b.
     * @param x     x.
     * @param y     y.
     * @return
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        Piece tmp = board.getAt(x, y); // Xet vi tri di chuyen den
        int xpiece = this.getCoordinatesX();
        int ypiece = this.getCoordinatesY();

        if ((xpiece == x && ypiece == y)
                || (Math.abs(xpiece - x) != Math.abs(ypiece - y))) { // ko di chuyen
            return false;
        }

        if (board.validate(x, y)) {
            if (xpiece < x && ypiece < y) {  // xet ben phai va tren
                for (int i = ypiece + 1; i < y; i++) {
                    for (int j = xpiece + 1; j < x; j++) {
                        if (board.getAt(j, i) != null) {
                            return false;
                        }
                    }
                }
            }
            if (xpiece < x && ypiece > y) { // xet ben phai va duoi
                for (int i = y + 1; i < ypiece; i++) {
                    for (int j = xpiece + 1; j < x; j++) {
                        if (board.getAt(j, i) != null) {
                            return false;
                        }
                    }
                }
            }
            if (xpiece > x && ypiece > y) {  // xet ben trai va duoi
                for (int i = x + 1; i < xpiece; i++) {
                    for (int j = y + 1; j < ypiece; j++) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                }
            }
            if (xpiece > x && ypiece < y) { // xet ben trai va tren
                for (int i = x + 1; i < xpiece; i++) {
                    for (int j = ypiece + 1; j < y; j++) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                }
            }

            if (tmp != null && tmp.getColor().equals(this.getColor())) {
                return false;
            }
        }
        return true;
    }


}
