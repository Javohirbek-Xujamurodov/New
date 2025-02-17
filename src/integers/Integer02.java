package integers;

import java.util.Scanner;

public class Integer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("M : (kg)");
        int m = sc.nextInt();
        int tonna = m / 1000;
        System.out.println("tonna  = " + tonna);
    }
}
