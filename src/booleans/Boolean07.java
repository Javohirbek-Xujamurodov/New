package booleans;

import java.util.Scanner;

public class Boolean07 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println(" Integers A : ");
        int a = scanner.nextInt();

        System.out.println(" Integers B : ");
        int b = scanner.nextInt();
        System.out.println(" Integers C : ");
        int c = scanner.nextInt();
        System.out.println(b > a && c > b);
    }
}

