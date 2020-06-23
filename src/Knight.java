import java.util.*;
public class Knight{
    public static ArrayDeque<Board> possibleMoves(Board board, int startloc) {
        ArrayDeque<Board> arr = new ArrayDeque<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            if(row<6){
                if(column!=7){
                    arr.add(new Board(board, 1, startloc, startloc+17));
                }
                if(column!=0){
                    arr.add(new Board(board, 1, startloc, startloc+15));
                }
            }
            if(row>1){
                if(column!=7){
                    arr.add(new Board(board, 1, startloc, startloc-15));
                }
                if(column!=0){
                    arr.add(new Board(board, 1, startloc, startloc-17));
                }
            }


        }
        else{ //black


        }

        return arr;
    }
}
