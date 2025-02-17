package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers A : ");
        int a = scanner.nextInt();
        System.out.print(" Integers B : ");
        int b = scanner.nextInt();
        System.out.print(" Integers C : ");
        int c = scanner.nextInt();

        System.out.println( (a == b ) || ( b == c) || ( c == a ));
    }
}


