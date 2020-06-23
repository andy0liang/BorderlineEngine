import java.util.*;

public class Board {

    int[] squares = new int[64];
    int moveNumber;

    //1: pawn, 2: bishop, 3: knight, 4: rook, 5: queen, 6: king

    public Board(int[] squares, int moveNumber){

        this.squares = squares;

        this.moveNumber = moveNumber;

    }

    public Board(int[] squares, int moveNumber, int startloc, int endloc) {

        this.moveNumber = moveNumber;

        int pieceToMove = squares[startloc];
        squares[endloc] = pieceToMove;
        this.squares = squares;

    }

    public Board(Board board, int moveNumber, int startloc, int endloc){

        this.moveNumber = moveNumber;
        squares = board.squares;
        int pieceToMove = squares[startloc];
        squares[endloc] = startloc;

    }

}
