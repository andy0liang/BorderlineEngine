import java.util.*;
public class Queen{
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();


        arr.addAll(Bishop.possibleMoves(board,startloc));
        arr.addAll(Rook.possibleMoves(board,startloc));

        return arr;
    }

    public static ArrayList <Integer> defendList(Board board, int startloc){

        ArrayList <Integer> arr = new ArrayList <>();

        arr.addAll(Bishop.defendList(board,startloc));
        arr.addAll(Rook.defendList(board,startloc));
        return arr;

    }
}
