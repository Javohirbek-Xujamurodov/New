package arrays;

import java.util.Scanner;

public class Array010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEven numbers (ascending order of indices):");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nOdd numbers (descending order of indices):");
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }


    }

}




