package T12;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    public Board() {
    }

    /**
     * vl.
     *
     * @param x x.
     * @param y y.
     * @return
     */
    public boolean validate(int x, int y) {
        if (x > WIDTH || y > WIDTH) {
            return false;
        }
        if (1 <= x && y >= 1) {
            return true;
        }
        return false;
    }

    /**
     * them.
     *
     * @param piece p.
     */
    public void addPiece(Piece piece) {
        int x = piece.getCoordinatesX();
        int y = piece.getCoordinatesY();

        if (!validate(x, y) || this.getAt(x, y) != null) {
            return;
        }
        this.pieces.add(piece);
    }

    /**
     * them.
     *
     * @param x x.
     * @param y y.
     * @return get.
     */
    public Piece getAt(int x, int y) {
        for (Piece tmp : pieces) {
            if (tmp.getCoordinatesX() == x && tmp.getCoordinatesY() == y) {
                return tmp;
            }
        }
        return null;
    }

    /**
     * xoa.
     *
     * @param x x.
     * @param y y.
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            Piece tmp = pieces.get(i);
            if (tmp.getCoordinatesX() == x && tmp.getCoordinatesY() == y) {
                this.pieces.remove(tmp);
                break;
            }
        }
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}

