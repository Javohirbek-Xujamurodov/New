package arrays;

import java.util.Scanner;

public class Array009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Yangi Massiv");
        int juftSanoq = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
                juftSanoq++;
            }
        }
        System.out.println(" \nyigindisi : " + juftSanoq);
    }
}



