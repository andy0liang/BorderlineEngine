import java.util.*;

public class Board {

    int[] squares = new int[64];
    int moveNumber;
    int prevLoc;
    int prevPiece;
    int currentLoc;
    int currentPiece;
    String[] columns = new String[]{"a","b","c","d","e","f","g","h"};

    //1: pawn, 2: bishop, 3: knight, 4: rook, 5: queen, 6: king

    public Board(int[] squares, int moveNumber){

        this.squares = squares;

        this.moveNumber = moveNumber;

    }

    public Board(int[] squares, int moveNumber, int startloc, int endloc) {

        this.moveNumber = moveNumber;
        prevLoc = startloc;
        int pieceToMove = squares[startloc];
        prevPiece = pieceToMove;
        currentPiece = squares[endloc];
        squares[endloc] = pieceToMove;
        currentLoc = endloc;

        this.squares = squares;

    }

    public Board(Board board, int moveNumber, int startloc, int endloc){

        prevLoc = startloc;
        this.moveNumber = moveNumber;
        squares = board.squares;
        int pieceToMove = squares[startloc];
        prevPiece = pieceToMove;
        currentPiece = squares[endloc];
        squares[endloc] = pieceToMove;
        currentLoc = endloc;
    }

    @Override
    public String toString(){

        return Piece.piece(prevPiece)+" "+columns[prevLoc%8]+(prevLoc/8)+" takes "+Piece.piece(currentPiece)+" "+columns[currentLoc%8]+(currentLoc/8);

    }


}
