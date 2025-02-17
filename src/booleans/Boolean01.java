package booleans;

import java.util.Scanner;

public class Boolean01 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println(" Integers A : ");
        int a = scanner.nextInt();

        if (a > 0){
            System.out.println(" a musbat son");
        }else {
            System.out.println(" a manfiy son");
        }
    }
}

