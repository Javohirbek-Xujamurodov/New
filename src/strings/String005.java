package strings;

import java.util.Scanner;

public class String005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print((char) ('z' - i) +  " ");
        }



    }
}
