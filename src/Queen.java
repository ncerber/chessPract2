public class Queen extends ChessPiece {
    public Queen(String color) {
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

        if (line == toLine || column==toColumn) {
            return true;
        }

        for (int i = 1; i <= line; i++) {
            if (line - i == toLine && column - i == toColumn) {
                return true;
            }
            if (line + i <= 7) {
                if (line + i == toLine && column - i == toColumn) {
                    return true;
                }
            }
        }

        for (int i = 1; i <= 7 - line; i++) {
            if (line - i == toLine && column + i == toColumn) {
                return true;
            }
            if (line + i <= 7) {
                if (line + i == toLine && column + i == toColumn) {
                    return true;
                }
            }
        }

        return false;
    }

    public String getSymbol() {
        return "Q";
    }
}
