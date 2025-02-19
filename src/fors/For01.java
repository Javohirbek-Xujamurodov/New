package fors;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k : ");
        int k = scanner.nextInt();
        System.out.print("n : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(k + " ");
        }
    }
}
