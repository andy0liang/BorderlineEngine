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

        int[] testPosition = new int[]{     0,0,2,0,0,2,0,0,
                                            1,0,1,0,0,1,0,1,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,2,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0,
                                            0,0,0,0,0,0,0,0

        };

        Board startingPosition = new Board(startingSquares,0);

        Board testboard = new Board(testPosition, 0);

        Board nextBoard = new Board(testboard,1,2,20);

        System.out.println(nextBoard);

        ArrayList<Board> arr = Bishop.possibleMoves(testboard, 35);

        System.out.println(arr.size());

        print(arr);
        testboard.printBoard();

        nextBoard.printBoard();

        print(Bishop.possibleMoves(nextBoard, 35));

    }

    public static void print(ArrayList <Board> arr){

        for(int x =0; x<arr.size();x++){
            System.out.println(arr.get(x));
        }

    }
}
