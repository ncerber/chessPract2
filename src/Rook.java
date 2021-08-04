public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        System.out.print(" line:"+line+", column:"+column+", toLine:"+toLine+", toColumn:"+toColumn);
        if (!super.isOnChessBoard(line, column, toLine, toColumn)) {
//            System.out.println(" == res = false");
            return false;
        }

        if (line == toLine || column==toColumn) {
            return true;
        }

        return false;
    }

    public String getSymbol() {
        return "R";
    }
}
