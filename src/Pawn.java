public class Pawn extends ChessPiece {
    public Pawn(String color) {
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

        if (column != toColumn) {
//            System.out.println(" == res = false");
            return false;
        }

        if (line == 6) {
              if (toLine==5 || toLine ==4){
//                System.out.println(" == res = true");
                return true;
            }
        }
        if (line == 1) {
            if (toLine == 2 || toLine == 3) {
//                System.out.println(" == res = true");
                return true;
            }
        }

        if (Math.abs(toLine-line) == 1){
//            System.out.println(" == res = true");
            return true;
        }
//        System.out.println(" == res = false");
        return false;
    }

    public String getSymbol() {
        return "P";
    }
}
