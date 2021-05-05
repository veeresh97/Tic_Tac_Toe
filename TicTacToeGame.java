
import java.util.Scanner;

public class TicTacToeGame {
 //creating board
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
 //creating to make choice for X or O
    public static void makeChoice() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your choice X or O  ");
        char player = obj.next().charAt(0);
        char computer = ' ';
        if (player == 'X' || player == 'x') {
            computer = 'O';
        } else if (player == 'O' || player == 'o'){
            computer = 'X';
        } else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        createBoard();
        makeChoice();
    }
}