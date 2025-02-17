package integers;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bayt kiriting : ");
        double Bayt = sc.nextDouble();
        double Kbayt = Bayt / 1024;
        System.out.println("Kbayt  = " + Kbayt);
    }
}
