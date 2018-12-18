package Rooms;
import Rooms.Room;

public class Board {
    private Room[][] board;


    public Board(Room[][] board) {
        this.board = board;
    }

    public void print() {
        String print1;
        for (int a = 0; a < board.length; a++) {
            print1 = "";
            for (int b = 0; b < board[a].length; b++) {
                print1+= board[a][b].toString();
            }
            System.out.println(print1);
        }
    }

}