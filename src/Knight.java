import java.util.*;
public class Knight{
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            if(row<6){
                if(column!=7 && board.squares[startloc+17]<1){
                    arr.add(new Board(board, 1, startloc, startloc+17));
                }
                if(column!=0 && board.squares[startloc+15]<1){
                    arr.add(new Board(board, 1, startloc, startloc+15));
                }
            }
            if(row>1){
                if(column!=7 && board.squares[startloc-15]<1){
                    arr.add(new Board(board, 1, startloc, startloc-15));
                }
                if(column!=0 && board.squares[startloc-17]<1){
                    arr.add(new Board(board, 1, startloc, startloc-17));
                }
            }
            if(column<6){
                if(row!=7 && board.squares[startloc+10]<1){
                    arr.add(new Board(board, 1, startloc, startloc+10));
                }
                if(row!=0 && board.squares[startloc-6]<1){
                    arr.add(new Board(board, 1, startloc, startloc-6));
                }
            }
            if(column>1){
                if(row!=7 && board.squares[startloc+6]<1){
                    arr.add(new Board(board, 1, startloc, startloc+6));
                }
                if(row!=0 && board.squares[startloc-10]<1){
                    arr.add(new Board(board, 1, startloc, startloc-10));
                }
            }


        }
        else{ //black

            if(row<6){
                if(column!=7 && board.squares[startloc+17]>-1){
                    arr.add(new Board(board, 1, startloc, startloc+17));
                }
                if(column!=0 && board.squares[startloc+15]>-1){
                    arr.add(new Board(board, 1, startloc, startloc+15));
                }
            }
            if(row>1){
                if(column!=7 && board.squares[startloc-15]>-1){
                    arr.add(new Board(board, 1, startloc, startloc-15));
                }
                if(column!=0 && board.squares[startloc-17]>-1){
                    arr.add(new Board(board, 1, startloc, startloc-17));
                }
            }
            if(column<6){
                if(row!=7 && board.squares[startloc+10]>-1){
                    arr.add(new Board(board, 1, startloc, startloc+10));
                }
                if(row!=0 && board.squares[startloc-6]>-1){
                    arr.add(new Board(board, 1, startloc, startloc-6));
                }
            }
            if(column>1){
                if(row!=7 && board.squares[startloc+6]>-1){
                    arr.add(new Board(board, 1, startloc, startloc+6));
                }
                if(row!=0 && board.squares[startloc-10]>-1){
                    arr.add(new Board(board, 1, startloc, startloc-10));
                }
            }

        }

        return arr;
    }
    public static ArrayList <Integer> defendList(Board board, int startloc){
        ArrayList<Integer> arr = new ArrayList<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            if(row<6){
                if(column!=7 && board.squares[startloc+17]<1){
                    arr.add(startloc+17);
                }
                if(column!=0 && board.squares[startloc+15]<1){
                    arr.add(startloc+15);
                }
            }
            if(row>1){
                if(column!=7 && board.squares[startloc-15]<1){
                    arr.add(startloc-15);
                }
                if(column!=0 && board.squares[startloc-17]<1){
                    arr.add(startloc-17);
                }
            }
            if(column<6){
                if(row!=7 && board.squares[startloc+10]<1){
                    arr.add(startloc+10);
                }
                if(row!=0 && board.squares[startloc-6]<1){
                    arr.add(startloc-6);
                }
            }
            if(column>1){
                if(row!=7 && board.squares[startloc+6]<1){
                    arr.add(startloc+6);
                }
                if(row!=0 && board.squares[startloc-10]<1){
                    arr.add(startloc-10);
                }
            }


        }
        else{ //black

            if(row<6){
                if(column!=7 && board.squares[startloc+17]>-1){
                    arr.add(startloc+17);
                }
                if(column!=0 && board.squares[startloc+15]>-1){
                    arr.add(startloc+15);
                }
            }
            if(row>1){
                if(column!=7 && board.squares[startloc-15]>-1){
                    arr.add(startloc-15);
                }
                if(column!=0 && board.squares[startloc-17]>-1){
                    arr.add(startloc-17);
                }
            }
            if(column<6){
                if(row!=7 && board.squares[startloc+10]>-1){
                    arr.add(startloc+10);
                }
                if(row!=0 && board.squares[startloc-6]>-1){
                    arr.add(startloc-6);
                }
            }
            if(column>1){
                if(row!=7 && board.squares[startloc+6]>-1){
                    arr.add(startloc+6);
                }
                if(row!=0 && board.squares[startloc-10]>-1){
                    arr.add(startloc-10);
                }
            }

        }

        return arr;
    }
}
