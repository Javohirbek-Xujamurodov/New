package booleans;

import java.util.Scanner;

public class Boolean03 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println(" Integers A : ");
        int a = scanner.nextInt();

        if (a % 2 == 0){
            System.out.println(" a soni juft son");
        }else {
            System.out.println(" a soni toq son");
        }
    }
}

