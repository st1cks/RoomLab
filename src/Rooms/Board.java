package Rooms;

public class Board {
    private Room[][] board;
    private String str;
    public Board(Room[][] board, String str){
        this.board = board;
        this.str = str;
    }

    public String toString() {
        str = "";
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                str = str + board[a][b];
            }
            str = str +"\n";
        }
        return str;
    }

    public void printRooms(){
        System.out.println(str);
    }
}
