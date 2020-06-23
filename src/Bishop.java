import java.util.*;
public class Bishop{
    public static ArrayDeque<Board> possibleMoves(Board board, int startloc) {
        ArrayDeque<Board> arr = new ArrayDeque<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            for(int x = startloc+9; x<64;x+=9){


            }
            for(int x = startloc+7; x<64; x+=7){

            }
            for(int x = startloc-7; x>=0;x-=7){

            }
            for(int x = startloc-9; x>=0;x++){
                
            }


        }
        else{

        }


        return arr;
    }
}
