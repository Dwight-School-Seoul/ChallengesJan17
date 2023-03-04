import java.util.Scanner;

public class TicTacToa {

    public static void main() {

        initializeBoard();
        displayBoard();

        while (!gameOver()) {

            playTurn();
            displayBoard();

            if (hasWon()) {
                System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"\nPlayer " + currentPlayer + " has won the game!");
                return;
            }

            switchPlayer();
        }
        System.out.println(ConsoleColors.YELLOW_BRIGHT+"\nGame over. It's a tie!");



    } // void main

    private static final char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    private static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    private static void displayBoard() {
        System.out.println("\n\n\n\n\t\t-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("\t\t| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("\t\t-------------");
        }
    }

    private static void playTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ConsoleColors.BLUE+"\nPlayer " + currentPlayer + ", enter row (1-3): "+ConsoleColors.RESET);
        int row = scanner.nextInt() - 1;
        System.out.print(ConsoleColors.BLUE+"Player " + currentPlayer + ", enter column (1-3): "+ConsoleColors.RESET);
        int col = scanner.nextInt() - 1;
        if (board[row][col] != '-') {
            System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"\nThat space is already taken. Try again."+ConsoleColors.RESET);
            playTurn();
        } else {
            board[row][col] = currentPlayer;
        }
    }

    private static boolean hasWon() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer) {
                return true;
            }
        }
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }

    private static boolean gameOver() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

}
