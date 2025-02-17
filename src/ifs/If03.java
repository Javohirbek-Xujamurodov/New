package ifs;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers N : ");
        int n = scanner.nextInt();
         if ( n > 0 ){
             n += 1;
         } else if ( n < 0) {
             n -= 2;
        }else {
             n = 10;
         }
        System.out.println(" N = " + n);
    }
}
