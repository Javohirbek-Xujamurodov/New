package arrays;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Son kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new  int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        }

    }

