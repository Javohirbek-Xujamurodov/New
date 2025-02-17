package integers;

import java.util.Scanner;

public class Integer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("L : (sm)");
        int l = sc.nextInt();
        int meters = l / 100;
        System.out.println("meters  = " + meters);
    }
}
