package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" Yangi matrix ");
        for (int j = 0; j < n; j++) {
            System.out.print(matrix[k][j] + " ");

        }
    }
}
