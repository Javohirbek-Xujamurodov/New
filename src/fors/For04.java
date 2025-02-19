package fors;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 kg konfet narxi : ");
        int konfetNarxi = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " kg konfet narxi ---->  " + i * konfetNarxi);
        }
    }
}
