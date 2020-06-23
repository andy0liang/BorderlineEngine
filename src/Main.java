import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//1: pawn, 2: bishop, 3: knight, 4: rook, 5: queen, 6: king
        int[] startingSquares = new int[]{  4,3,2,5,6,2,3,4,
                                            1,1,1,1,1,1,1,1,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            -1,-1,-1,-1,-1,-1,-1,-1,
                                            -4,-3,-2,-5,-6,-2,-3,-4};


        Board startingPosition = new Board(startingSquares,0);
        
    }
}
