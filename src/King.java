public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!super.isOnChessBoard(line, column, toLine, toColumn)) {
            return false;
        }
        //Horizontal: left-right
        if (line == toLine && Math.abs(column-toColumn)==1) {
            return true;
        }
        //Vertical: up-down
        if (column == toColumn && Math.abs(line-toLine)==1) {
            return true;
        }
        //Diagonal
        if(Math.abs(column-toColumn)==1 && Math.abs(line-toLine)==1){
            return true;
        }

        return false;
    }

    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        return false;
    }
}
