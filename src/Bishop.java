import java.util.*;
public class Bishop{
    public static ArrayList<Board> possibleMoves(Board board, int startloc) {
        ArrayList<Board> arr = new ArrayList<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            for(int x = startloc+9; x<64 && column!=7;x+=9){

                if(board.squares[x]>0){
                    break;
                }

                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==7){
                    break;
                }

            }
            for(int x = startloc+7; x<64 && column!=0; x+=7){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }
            for(int x = startloc-7; x>=0 && column!=7;x-=7){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board,1,startloc,x));
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==7){
                    break;
                }
            }
            for(int x = startloc-9; x>=0 && column!=0;x-=9){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }


        }
        else{ //black

            for(int x = startloc+9; x<64 && column!=7;x+=9){

                if(board.squares[x]<0){
                    break;
                }

                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==7){
                    break;
                }

            }
            for(int x = startloc+7; x<64 && column!=0; x+=7){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }
            for(int x = startloc-7; x>=0 && column!=7;x-=7){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board,1,startloc,x));
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==7){
                    break;
                }
            }
            for(int x = startloc-9; x>=0 && column!=0;x-=9){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(new Board(board, 1, startloc, x));
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }

        }


        return arr;
    }

    public static ArrayList<Integer> defendList(Board board, int startloc){
        ArrayList<Integer> arr = new ArrayList<>();
        int row = startloc/8;
        int column = startloc%8;
        if(board.squares[startloc]>0){ //white

            for(int x = startloc+9; x<64 && column!=7;x+=9){

                if(board.squares[x]>0){
                    break;
                }

                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==7){
                    break;
                }

            }
            for(int x = startloc+7; x<64 && column!=0; x+=7){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }
            for(int x = startloc-7; x>=0 && column!=7;x-=7){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==7){
                    break;
                }
            }
            for(int x = startloc-9; x>=0 && column!=0;x-=9){
                if(board.squares[x]>0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]<0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }


        }
        else{ //black

            for(int x = startloc+9; x<64 && column!=7;x+=9){

                if(board.squares[x]<0){
                    break;
                }

                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==7){
                    break;
                }

            }
            for(int x = startloc+7; x<64 && column!=0; x+=7){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }
            for(int x = startloc-7; x>=0 && column!=7;x-=7){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==7){
                    break;
                }
            }
            for(int x = startloc-9; x>=0 && column!=0;x-=9){
                if(board.squares[x]<0){
                    break;
                }
                arr.add(x);
                if(board.squares[x]>0){
                    break;
                }
                if(x%8==0){
                    break;
                }
            }

        }


        return arr;


    }

}
