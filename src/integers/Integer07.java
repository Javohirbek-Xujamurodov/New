package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ikki xonali son kiriting : ");
        int n = sc.nextInt();
        int r10 = n / 10;
        int r1 = n % 10;
        int RnSumma = r1 + r10;
        if (n > 9 && n < 100) {
            System.out.println(n + " ning raqamlar yig'indisi " + RnSumma);
        } else {
            System.out.println(" Ikki xonali son emas");
        }
    }
}
