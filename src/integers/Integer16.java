package integers;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" UCH xonali son kiriting : ");
        short n = sc.nextShort();

        int r100 = n / 100 % 10;
        int r10 = n / 10 % 10;
        int r1 = n % 10;
        int newRaqam = r100 * 100 + r1 * 10 + r10;
        if (n > 99 && n < 1000) {
            System.out.println(" yangi raqam ==> " + newRaqam);
        } else {
            System.out.println(" uch xonali son emas");
        }
    }
}
