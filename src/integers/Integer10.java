package integers;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" UCH xonali son kiriting : ");
        short n = sc.nextShort();

        int r10 = n / 10 % 10;
        int r1 = n % 10;
        if (n > 99 && n < 1000) {
            System.out.println(" r10 ==> " + r10);
            System.out.println(" r1 ==> " + r1);
        } else {
            System.out.println(" uch xonali son emas");
        }
    }
}
