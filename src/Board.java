import java.util.*;

public class Board {

    int[] squares = new int[64];
    int moveNumber;
    int prevLoc;
    int prevPiece;
    int currentLoc;
    int currentPiece;
    int isCheck = -1;
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

        currentLoc = endloc;

        this.squares = squares;
        this.squares[endloc] = pieceToMove;
        this.squares[startloc] = 0;

    }

    public Board(Board board, int moveNumber, int startloc, int endloc){

        prevLoc = startloc;
        this.moveNumber = moveNumber;
        this.squares = board.getSquares().clone();
        int pieceToMove = this.squares[startloc];
        prevPiece = pieceToMove;
        currentPiece = this.squares[endloc];
        this.squares[endloc] = pieceToMove;
        currentLoc = endloc;
        this.squares[startloc] = 0;
    }

    @Override
    public String toString(){

        return Piece.piece(prevPiece)+" "+columns[prevLoc%8]+(prevLoc/8)+" takes "+Piece.piece(currentPiece)+" "+columns[currentLoc%8]+(currentLoc/8);

    }
    public void printBoard(){
        for(int x = 0; x<64;x++){
            if(x%8==0){
                System.out.println();
            }
            System.out.print(squares[x]+"  ");
        }
        System.out.println();
    }


    public int[] getSquares() {
        return squares;
    }

    public boolean isCheck(){
        if(this.isCheck>-1){
            return this.isCheck==1;
        }

        int whiteKingLoc = indexOf(squares, 6);
        int blackKingLoc = indexOf(squares, -6);


        this.isCheck = 0;
        return false;
    }

    public static int indexOf(int[] arr, int value){
        int index = -1;
        for(int x = 0; x<arr.length;x++){
            if(arr[x]==value){
                index = x;
                break;
            }
        }
        return index;
    }

}
