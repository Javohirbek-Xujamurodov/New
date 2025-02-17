package Ifs;

import java.util.Scanner;

public class If05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Integers n1 : ");
        int n1 = scanner.nextInt();
        System.out.print(" Integers n2 : ");
        int n2 = scanner.nextInt();
        System.out.print(" Integers n3 : ");
        int n3 = scanner.nextInt();
        byte musbatSanoq = 0;
        byte manfiySanoq = 0;
        if (n1 > 0){
            musbatSanoq++;
        }else {
            manfiySanoq++;
        }
        if ( n2 > 0){
            musbatSanoq++;
        }else {
            manfiySanoq++;
        }
        if ( n3 > 0 ){
            musbatSanoq++;
        }else {
            manfiySanoq++;
        }
        System.out.println(" musbat sonlar : " + musbatSanoq);
        System.out.println(" manfiy sonlar : " + manfiySanoq);
    }
}
