package Booleans;

import java.util.Scanner;

public class Boolean13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Integers A : ");
        int a = scanner.nextInt();

        System.out.print(" Int  egers B : ");
        int b = scanner.nextInt();
        System.out.print(" Integers C : ");
        int c = scanner.nextInt();

        System.out.println(a > 0 || b > 0 || c > 0);
    }
}

