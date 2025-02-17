package booleans;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Integers A : ");
        int a = scanner.nextInt();

        System.out.print(" Integers B : ");
        int b = scanner.nextInt();
        System.out.print(" Integers C : ");
        int c = scanner.nextInt();

        System.out.println(a > 0 && b > 0 && c > 0);
    }
}

