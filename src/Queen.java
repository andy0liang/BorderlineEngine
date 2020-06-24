import java.util.*;
public class Queen{
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();

        Knight.possibleMoves(board,startloc).forEach(n->arr.add(n));
        Rook.possibleMoves(board,startloc).forEach(n->arr.add(n));

        return arr;
    }
}
