package chess.board;

import chess.piece.Piece;

public class Tile {
    private final int row;
    private final int col;
    private Piece piece;

    public Tile(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    public Piece getPiece() { return piece; }

    public boolean isOccupied() {return piece != null;}

    public void setPiece(Piece piece) { this.piece = piece;}
}
