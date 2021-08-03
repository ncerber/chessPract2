public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line==toLine && column==toColumn) {
            return false;
        }
        if(toLine>7 || toColumn>7){
            return false;
        }

        if(toLine<0 || toColumn<0){
            return false;
        }

        if(toLine==line-1 || toLine==line+1){
            if(toColumn==column+2 || toColumn==column-2){
                return true;
            }
        }

        if(toLine==line-2 || toLine==line+2){
            if(toColumn==column+1 || toColumn==column-1){
                return true;
            }
        }
        return false;
    }

    public String getSymbol(){
        return "H";
    }


}


