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
        System.out.print(" line:"+line+", column:"+column+", toLine:"+toLine+", toColumn:"+toColumn);
        if (!super.isOnChessBoard(line, column, toLine, toColumn)) {
            System.out.println(" == res = false");
            return false;
        }

        //Сначала проверяем все диагонали уходящие влево
        for (int i = 1; i <= line; i++) {
            if (line - i == toLine && column - i == toColumn) {
                System.out.println(" == res = true");
                return true;
            }
            if (line + i <= 7) {
                if (line + i == toLine && column - i == toColumn) {
                    System.out.println(" == res = true");
                    return true;
                }
            }
        }

        for (int i = 1; i <= 7 - line; i++) {
            if (line - i == toLine && column + i == toColumn) {
                System.out.println(" == res = true");
                return true;
            }
            if (line + i <= 7) {
                if (line + i == toLine && column + i == toColumn) {
                    System.out.println(" == res = true");
                    return true;
                }
            }
        }
        System.out.println(" == res = false");
        return false;
    }

    public String getSymbol() {
        return "B";
    }
}
