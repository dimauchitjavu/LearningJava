package DaySeventeen;

public class ChessBoard {
    private Main.ChessPiece[][] boardState;

    public ChessBoard(Main.ChessPiece[][] boardState) {
        this.boardState = boardState;
    }
    public void print(){
        for (Main.ChessPiece[] row:boardState) {
            for (Main.ChessPiece piece:row) {
                System.out.print(piece.emoji);
            }
            System.out.print("\n");
        }
    }
}
