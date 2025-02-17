package ifs;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers n1 : ");
        int n1 = scanner.nextInt();
        System.out.print(" Integers n2 : ");
        int n2 = scanner.nextInt();
        System.out.print(" Integers n3 : ");
        int n3 = scanner.nextInt();
        byte sanoq = 0;
        if (n1 > 0){
            sanoq++;
        }
        if ( n2 > 0){
            sanoq++;
        }
        if ( n3 > 0 ){
            sanoq++;
        }
        System.out.println(sanoq);
    }
}
