package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = scanner.nextInt();
        int [] arr = new  int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 2*i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("2^" + i + " = " + arr[i]);
        }
        }

    }

