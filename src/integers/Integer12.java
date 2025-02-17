package integers;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" UCH xonali son kiriting : ");
        short n = sc.nextShort();

        int r100 = n / 100 % 10;
        int r10 = n / 10 % 10;
        int r1 = n % 10;
        int teskariRaqam = r1 * 100 + r10 * 10 + r100;
        if (n > 99 && n < 1000) {
            System.out.println(" yangi raqam ==> " + teskariRaqam);
        } else {
            System.out.println(" uch xonali son emas");
        }
    }
}
