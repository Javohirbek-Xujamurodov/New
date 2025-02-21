package arrays;

import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Yangi Massiv");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}



