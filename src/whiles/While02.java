package whiles;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A = ");
        double a = scanner.nextDouble();
        System.out.print("B = ");
        double b = scanner.nextDouble();
        int sanoq =0;
        while ( a >= b){
            a -= b;
            sanoq++;
        }
        System.out.println(sanoq);
    }
}
