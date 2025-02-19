package whiles;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("k = ");
        double k = scanner.nextDouble();
        System.out.print("n = ");
        double n = scanner.nextDouble();
        int sanoq =0;
        while ( k >= n){
            k -= n;
            sanoq++;
        }
        System.out.println(" Butun Qism : " + sanoq);
        System.out.println(" Qoldiq Qism : " + k);
    }
}
