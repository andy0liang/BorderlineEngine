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
    public static ArrayList<Integer> defendList (Board board, int startloc){
        ArrayList <Integer> arr = new ArrayList <>();
        int row = startloc/8;
        int column = startloc%8;

        if(startloc+8<64){
            arr.add(startloc+8);
        }
        if(startloc+9<64 && column!=7){
            arr.add(startloc+9);
        }
        if(startloc+7<64 && column!=0){
            arr.add(startloc+7);
        }
        if(column!=7){
            arr.add(startloc+1);
        }
        if(column!=0){
            arr.add(startloc-1);
        }
        if(startloc-8>=0){
            arr.add(startloc-8);
        }
        if(startloc-9>=0 && column!=0){
            arr.add(startloc-9);
        }
        if(startloc-7>=0 && column!=7){
            arr.add(startloc-7);
        }

        return arr;


    }
}
