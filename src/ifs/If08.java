package ifs;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers n1 : ");
        int n1 = scanner.nextInt();
        System.out.print(" Integers n2 : ");
        int n2 = scanner.nextInt();

        if ( n1 > n2 ){
            System.out.println(n1);
            System.out.println(n2);
        }else {
            System.out.println(n2);
            System.out.println(n1);
        }
    }
}
