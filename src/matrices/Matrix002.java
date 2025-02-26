package matrices;

import java.util.Scanner;

public class Matrix002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" m = ");
        int m = scanner.nextInt();
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 5 * (j + 1);
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
