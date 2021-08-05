public class Main {
    public static ChessBoard buildBoard() {
        ChessBoard board = new ChessBoard("White");

        board.board[0][0] = new Rook("White");
        board.board[0][1] = new Horse("White");
        board.board[0][2] = new Bishop("White");
        board.board[0][3] = new Queen("White");
        board.board[0][4] = new King("White");
        board.board[0][5] = new Bishop("White");
        board.board[0][6] = new Horse("White");
        board.board[0][7] = new Rook("White");
        board.board[1][0] = new Pawn("White");
        board.board[1][1] = new Pawn("White");
        board.board[1][2] = new Pawn("White");
        board.board[1][3] = new Pawn("White");
        board.board[1][4] = new Pawn("White");
        board.board[1][5] = new Pawn("White");
        board.board[1][6] = new Pawn("White");
        board.board[1][7] = new Pawn("White");

        board.board[7][0] = new Rook("Black");
        board.board[7][1] = new Horse("Black");
        board.board[7][2] = new Bishop("Black");
        board.board[7][3] = new Queen("Black");
        board.board[7][4] = new King("Black");
        board.board[7][5] = new Bishop("Black");
        board.board[7][6] = new Horse("Black");
        board.board[7][7] = new Rook("Black");
        board.board[6][0] = new Pawn("Black");
        board.board[6][1] = new Pawn("Black");
        board.board[6][2] = new Pawn("Black");
        board.board[6][3] = new Pawn("Black");
        board.board[6][4] = new Pawn("Black");
        board.board[6][5] = new Pawn("Black");
        board.board[6][6] = new Pawn("Black");
        board.board[6][7] = new Pawn("Black");
        return board;
    }

    public static void main(String[] args) {
        ChessBoard board = buildBoard();
//        board.printBoard();
        if (board.moveToPosition(1, 4, 3, 4)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        if (board.moveToPosition(6, 4, 4, 4)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        if (board.moveToPosition(0, 5, 3, 2)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        if (board.moveToPosition(7, 5, 4, 2)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        if (board.moveToPosition(3, 2, 7, 6)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        if (board.moveToPosition(3, 2, 6, 5)) {
            System.out.println("Успешно передвинулись");
        } else System.out.println("Передвижение не удалось");

        board.printBoard();
    }
}
