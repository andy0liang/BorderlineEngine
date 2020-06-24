import java.util.*;
public class Rook {
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();

        int row = startloc/8;
        int column = startloc%8;

        if(board.squares[startloc]>0){

            for(int x = startloc+8; x<64;x+=8){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc-8; x>=0;x-=8){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board,1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc+1; x/8==row; x++){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc-1; x/8==row; x--){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
            }


        }
        else{

            for(int x = startloc+8; x<64;x+=8){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc-8; x>=0;x-=8){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board,1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc+1; x/8==row; x++){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc-1; x/8==row; x--){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
            }


        }

        return arr;
    }
    public static ArrayList <Integer> defendList(Board board, int startloc){

        ArrayList<Integer> arr = new ArrayList<>();

        int row = startloc/8;
        int column = startloc%8;

        if(board.squares[startloc]>0){

            for(int x = startloc+8; x<64;x+=8){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc-8; x>=0;x-=8){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc+1; x/8==row; x++){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
            }
            for(int x = startloc-1; x/8==row; x--){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
            }


        }
        else{

            for(int x = startloc+8; x<64;x+=8){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc-8; x>=0;x-=8){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc+1; x/8==row; x++){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
            }
            for(int x = startloc-1; x/8==row; x--){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
            }


        }

        return arr;

    }
}
