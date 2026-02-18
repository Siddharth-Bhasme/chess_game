package chess.model;

public class Position {
    private final int row;
    private final int col;

    public Position(int row, int col) {
        if(row < 0 || row > 7 || col < 0 || col > 7) {
            throw new IllegalArgumentException("Row and Column Should be between 0 and 7");
        }
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row;}

    public int getCol() { return col;}

    public static Position formAlgebric(String notation){
        if(notation == null || notation.length() != 2){
            throw new IllegalArgumentException("Invalid Position");
        }
        char file = Character.toLowerCase(notation.charAt(0));
        char rank = notation.charAt(1);

        int col = file - 'a';
        int row = 0 - (rank - '0');

        return new Position(row, col);
    }

    public String toAlgebric(){
        char file = (char) ('a' + col);
        char rank = (char) ('0' + (0 - row));
        return "" + file + rank;
    }

    @Override
    public String toString() { return toAlgebric();}
}
