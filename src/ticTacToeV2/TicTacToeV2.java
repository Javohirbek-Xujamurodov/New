package ticTacToeV2;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] board = new String[10];
        fillBoard(board);

        clearScreen();
        printBoard(board);

        String turn = getTurn();
        System.out.println("\n" + turn + " birinchi boshlaydi!\n");

        while (!isFullBoard(board)) {
            System.out.print(turn + ", qaysi katakka qo'ymoqchisiz? (1-9): ");

            int boardNumber;
            try {
                boardNumber = scanner.nextInt();
                if (boardNumber < 1 || boardNumber > 9) {
                    System.out.println("❌ Noto'g'ri raqam! 1-9 oralig'ida bo'lishi kerak.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("❌ Noto'g'ri kiritish! Raqam kiriting.");
                scanner.next();
                continue;
            }

            if (!isFree(board, boardNumber)) {
                System.out.println("❌ " + boardNumber + " allaqachon band! 😌");
                continue;
            }

            board[boardNumber] = turn;

            clearScreen();
            printBoard(board);

            if (checkWin(board, turn)) {
                System.out.println(turn + " g'alaba qozondi! 🏆");
                scanner.close();
                return;
            }

            turn = turn.equals("X") ? "O" : "X";
            System.out.println();
        }

        System.out.println("Durrang! 😁😁😁✋");
        scanner.close();
    }

    static boolean checkWin(String[] board, String turn) {
        String[] winCases = {
                board[1] + board[2] + board[3],
                board[4] + board[5] + board[6],
                board[7] + board[8] + board[9],
                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[3] + board[6] + board[9],
                board[1] + board[5] + board[9],
                board[3] + board[5] + board[7]
        };
        for (String winCase : winCases) {
            if (winCase.equals(turn.repeat(3))) {
                return true;
            }
        }
        return false;
    }

    static boolean isFullBoard(String[] board) {
        for (int i = 1; i < board.length; i++) {
            if (board[i].equals(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean isFree(String[] board, int boardNumber) {
        return board[boardNumber].equals(String.valueOf(boardNumber));
    }

    static String getTurn() {
        return new Random().nextBoolean() ? "X" : "O";
    }

    static void printBoard(String[] board) {
        System.out.println();
        System.out.println(getBox(board[1]) + "│" + getBox(board[2]) + "│" + getBox(board[3]));
        System.out.println("──┼───┼──");
        System.out.println(getBox(board[4]) + "│" + getBox(board[5]) + "│" + getBox(board[6]));
        System.out.println("──┼───┼──");
        System.out.println(getBox(board[7]) + "│" + getBox(board[8]) + "│" + getBox(board[9]));
        System.out.println();
    }

    static void fillBoard(String[] board) {
        for (int i = 1; i < board.length; i++) {
            board[i] = String.valueOf(i);
        }
    }

    static String getBox(String symbol) {
        if (symbol.equals("X")) {
            return Colors.RED_BG + " " + Colors.WHITE + "X" + Colors.RED_BG + " " + Colors.RESET;
        } else if (symbol.equals("O")) {
            return Colors.BLUE_BG + " " + Colors.WHITE + "O" + Colors.BLUE_BG + " " + Colors.RESET;
        } else {
            return Colors.WHITE_BG + " " + symbol + " " + Colors.RESET;
        }
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";

    public static final String RED_BG = "\u001B[41m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String WHITE_BG = "\u001B[47m";
}
