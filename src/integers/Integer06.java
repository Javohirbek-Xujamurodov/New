package integers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ikki xonali son kiriting : ");
        int n = sc.nextInt();
        int r10 = n / 10;
        int r1 = n % 10;
        if (n > 9 && n < 100) {
            System.out.println(" r10 : " + r10);
            System.out.println(" r1 : " + r1);
        } else {
            System.out.println(" Ikki xonali son emas!!!");
        }
    }
}
