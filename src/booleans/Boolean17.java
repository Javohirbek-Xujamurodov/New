package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Integers A : ");
        int a = scanner.nextInt();

        System.out.println( ( a > 99 && a < 1000 && a % 2 != 0) );
    }
}


