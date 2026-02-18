package chess.piece;

import chess.board.Board;
import chess.model.PieceColor;
import chess.model.PieceType;
import chess.model.Position;

import java.util.List;

public abstract class Piece {
    private final PieceColor color;

    protected Piece(PieceColor color) { this.color = color; }

    public PieceColor getColor() { return color; }

    public abstract PieceType getType();

    public abstract char getSymbol();

    public abstract List<Position> getPossibleMoves(Board board, Position from);
}
