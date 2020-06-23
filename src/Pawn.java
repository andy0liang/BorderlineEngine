import java.util.*;
public class Pawn{
    public static ArrayDeque<Board> possibleMoves(Board board, int startloc) {
        ArrayDeque<Board> arr = new ArrayDeque<>();

        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0) {//white

            if(startloc+8<64 && board.squares[startloc+8]==0){
                arr.add(new Board(board, 1, startloc, startloc+8));
            }
            if(startloc+16<64 && board.squares[startloc+16]==0){
                arr.add(new Board(board, 1, startloc, startloc+16));
            }
            if(column!=0 && startloc+7<64 && board.squares[startloc+7]<0){
                arr.add(new Board(board, 1, startloc, startloc+7));
            }
            if(column!=7 && startloc+9<64 && board.squares[startloc+9]<0){
                arr.add(new Board(board, 1, startloc, startloc+9));
            }

        }
        else{

            if(startloc-8>=0 && board.squares[startloc-8]==0){
                arr.add(new Board(board, 1, startloc, startloc-8));
            }
            if(startloc-16>=0 && board.squares[startloc-16]==0){
                arr.add(new Board(board, 1, startloc, startloc-16));
            }
            if(column!=7 && startloc-7<64 && board.squares[startloc-7]<0){
                arr.add(new Board(board, 1, startloc, startloc-7));
            }
            if(column!=0 && startloc-9<64 && board.squares[startloc-9]<0){
                arr.add(new Board(board, 1, startloc, startloc-9));
            }

        }

        return arr;
    }
}
