import java.util.*;
public class Piece {
    public static String piece(int n) {

        String[] arr = new String[]{"","Pawn","Bishop","Knight","Rook","Queen","King"};

        if(n>0){
            return "white "+arr[n];
        }
        else if(n<0){
            return "black "+arr[n];
        }
        else{
            return "empty piece";
        }

    }
}
