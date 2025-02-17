package booleans;

import java.util.Scanner;

public class Boolean09 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println(" Integers A : ");
        int a = scanner.nextInt();

        System.out.println(" Integers B : ");
        int b = scanner.nextInt();

        System.out.println((a % 2 != 0) || (b % 2 != 0));
    }
}

