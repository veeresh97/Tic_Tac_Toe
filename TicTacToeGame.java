
import java.util.Scanner;

public class TicTacToeGame {
 
    public static char[] createBoard() {                      //creating board
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static void makeChoice() {                         //creating to make choice for X or O
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your choice X or O  ");     //taking user input
        char player = obj.next().charAt(0);
        obj.close();
        char computer = ' ';
        if (player == 'X' || player == 'x') {                 //assigning the user choice based on the input
            computer = 'O';
        } else if (player == 'O' || player == 'o'){
            computer = 'X';
        } else {
            System.out.println("invalid");
        }
    }

                                                              //displaying the board
    public static void displayBoard(char[] board){
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("---------");
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println("---------");
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
        System.out.println(board);
    }
    
    public static void main(String[] args) {
        char[] board =createBoard();
        makeChoice();
        displayBoard(board);
    }
}