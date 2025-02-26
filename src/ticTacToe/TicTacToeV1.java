package ticTacToe;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] board = new String[10];
        fillBoard(board);
        printBoard(board);
        String turn = getTurn();
        System.out.println();
        System.out.println(turn + " first");


        while (!isFullBoard(board)) {
            System.out.print(turn + " enter board number: ");
            int boardNumber = scanner.nextInt();
            if (!isFree(board, boardNumber)) {
                System.out.println(boardNumber + " already taken!😌");
                continue;
            }
            board[boardNumber] = turn;
            printBoard(board);
            if (checkWin(board, turn)) {
                System.out.println(turn + " win!🏆");
                return;
            }
            turn = turn.equals("X") ? "O" : "X";
            System.out.println();
        }

        System.out.println("Draw 😁😁😁✋");



    }

    static boolean checkWin(String[] board, String turn) {
        String[] winCases = {
                board[1]+board[2]+board[3],
                board[4]+board[5]+board[6],
                board[7]+board[8]+board[9],

                board[1]+board[4]+board[7],
                board[2]+board[5]+board[8],
                board[3]+board[6]+board[9],

                board[1]+board[5]+board[9],
                board[3]+board[5]+board[7]
        };
        for (String winCase : winCases) {
            if (winCase.equals(turn.repeat(3))){
                return true;
            }
        }
        return false;
    }

    static boolean isFullBoard(String[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i].equals(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }

    static boolean isFree(String[] board, int boardNumber) {
        return board[boardNumber].equals(String.valueOf(boardNumber));
    }

    static String getTurn() {
        Random random = new Random();
        return random.nextBoolean() ? "X" : "O";
    }

    static void printBoard(String[] board) {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static void fillBoard(String[] board) {
        for (int i = 1; i < board.length; i++) {
            board[i] = String.valueOf(i);
        }
    }


}
