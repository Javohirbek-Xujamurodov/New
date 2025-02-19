package fors;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 kg konfet narxi: ");
        int konfetNarxi = scanner.nextInt();

        for (double i = 1.2; i <= 2.0; i += 0.2) {
            System.out.printf("%.1f kg konfet narxi ----> %.2f so'm%n", i, i * konfetNarxi);
        }

    }
}
