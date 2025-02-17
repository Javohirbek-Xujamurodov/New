package ifs;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers N : ");
        int n = scanner.nextInt();
         if ( n > 0 ){
             System.out.println(" N = " + (n+1));
         }else {
             System.out.println(" N = " + n );
         }
    }
}
