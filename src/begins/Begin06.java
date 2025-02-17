
package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println(" V = " + a * b * c);
        System.out.println(" S = " + 2 * (a * b + b * c + a * c));

    }


}

