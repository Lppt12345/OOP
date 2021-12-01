package T12;

import java.util.ArrayList;

public class Game {
    private Board board;
    private static final ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public static ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * m.
     *
     * @param piece p.
     * @param x     x.
     * @param y     y.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (!piece.canMove(board, x, y)) {
            return;
        }

        if (board.getAt(x, y) != null) {
            Move newMove = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(),
                    y, piece, board.getAt(x, y));
            moveHistory.add(newMove);
            board.removeAt(x, y);
        } else {
            Move newMove = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            moveHistory.add(newMove);
        }

        piece.setCoordinatesX(x);
        piece.setCoordinatesY(y);
    }
}
