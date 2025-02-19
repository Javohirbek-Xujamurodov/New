package whiles;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        double a = scanner.nextDouble();
        System.out.print("B = ");
        double b = scanner.nextDouble();
        while ( a >= b){
            a -= b;
        }
        System.out.println(a);
    }
}
