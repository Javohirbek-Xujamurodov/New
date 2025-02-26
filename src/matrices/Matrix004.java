package matrices;

import java.util.Scanner;

public class Matrix004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();

        double[] sequence = new double[m];
        System.out.println("Enter " + m + " real numbers:");
        for (int i = 0; i < m; i++) {
            sequence[i] = scanner.nextDouble();
        }

        double[][] arr = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sequence[i];
            }
        }

        System.out.println("\nGenerated Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
