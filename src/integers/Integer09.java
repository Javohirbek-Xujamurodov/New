package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" UCH xonali son kiriting : ");
        int n = sc.nextInt();
        int r100 = n / 100 % 10;
        if (n > 99 && n < 1000) {
            System.out.println(" r100 ==> " + r100);
        } else {
            System.out.println(" uch xonali son emas");
        }
    }
}
