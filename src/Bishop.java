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
        int iterator = 1;
        for (int i = 0; i <= line; i++) {
            if (line - iterator == toLine && column - iterator == toColumn) {
                return true;
            }
            if (line + iterator <= 7) {
                if (line + iterator == toLine && column - iterator == toColumn) {
                    return true;
                }
            }
            iterator++;
        }

        iterator = 1;
        for (int i = 0; i < 7 - line; i++) {
            if (line - iterator == toLine && column + iterator == toColumn) {
                return true;
            }
            if (line + iterator <= 7) {
                if (line + iterator == toLine && column + iterator == toColumn) {
                    return true;
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
