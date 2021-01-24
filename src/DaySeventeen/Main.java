package DaySeventeen;


public class Main {
    public enum  ChessPiece {
        KING_WHITE("♔", 100),
        KING_BLACK("♚",100),
        QUEEN_WHITE("♕",9),
        QUEEN_BLACK("♛", 9),
        PAWN_WHITE("♙",1),
        PAWN_BLACK("♟",1),
        KNIGHT_WHITE("♘",3),
        KNIGHT_BLACK("♞",3),
        BISHOP_WHITE("♗",3.5),
        BISHOP_BLACK("♝",3.5),
        ROOK_WHITE("♖",5),
        ROOK_BLACK("♜",5),
        EMPTY("_",-1);

        public String emoji;
        public double value;
        ChessPiece(String emoji, double value){
            this.emoji = emoji;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        ChessPiece[] pieces;
        pieces = new ChessPiece[]{ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};
        for (ChessPiece i: pieces) {
           System.out.print(i.emoji);
        }
        System.out.print("\nMY BOARD\n");
        ChessPiece[][] board;
        board = new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
                {ChessPiece.KING_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.KING_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.QUEEN_WHITE,ChessPiece.EMPTY}
        };
        ChessBoard MyBoard = new ChessBoard(board);
        MyBoard.print();
    }
}
