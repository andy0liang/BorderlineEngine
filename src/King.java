import java.util.*;
public class King{
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();
        int row = startloc/8;
        int column = startloc%8;
        Board temp;
        if(board.squares[startloc]>0){

            if(startloc+8<64){
                temp = new Board(board, 1, startloc, startloc+8);
            }
            if(startloc+9<64){
                temp = new Board(board, 1, startloc, startloc+9);

            }

        }
        else{


        }


        return arr;
    }
}
