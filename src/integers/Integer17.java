package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" UCH xonali son kiriting : ");
        int n = sc.nextInt();

        if (n > 999) {
            int r100 = n / 100 % 10;
            System.out.println(" r100 ==> " + r100);
        } else {
            System.out.println(" 999 dan katta son emas");
        }
    }
}
