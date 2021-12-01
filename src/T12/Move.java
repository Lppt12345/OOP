package T12;

public class Move {

    private Piece movedPiece;
    private Piece killedPiece;
    private int startX;
    private int endX;
    private int startY;
    private int endY;

    /**
     * set.
     *
     * @param startX     bdx.
     * @param endX       kex.
     * @param startY     bdy.
     * @param endY       kty.
     * @param movedPiece move.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Setter.
     *
     * @param startX      x.
     * @param endX        xe.
     * @param startY      y.
     * @param endY        ye.
     * @param movedPiece  m.
     * @param killedPiece k.
     */
    public Move(int startX, int endX, int startY, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * str.
     *
     * @return str.
     */
    public String toString() {
        String[] arr = {"null", "a", "b", "c", "d", "e", "f", "g", "h"};
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(movedPiece.getColor()).append("-B");
        stringBuilder.append(arr[endX]).append(endY);
        return stringBuilder.toString();
    }
}
