public class Bishop extends ChessPiece {
    public Bishop(String color) {
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
        if (column == toColumn) {
            return false;
        }

        int iterator = 1;
        int lAdd = 1;
        int cAdd = 1;
        int count = Math.abs(column - toColumn);
        int locLine, locColumn;

        if (line > toLine) {
            lAdd = -1;
        }
        if (column > toColumn) {
            cAdd = -1;
        }

        for (int i = 0; i < count; i++) {
            if (line + iterator > 0) {
                locLine = line + (iterator * lAdd);
                locColumn = column + (iterator * cAdd);
                if (locLine == toLine && locColumn == toColumn) {
                    return true;
                } else {
                    if(chessBoard.board[locLine][locColumn]!=null){
                        return false;
                    }
                }
            }
            iterator++;
        }
        return false;
    }

    public String getSymbol() {
        return "B";
    }
}
