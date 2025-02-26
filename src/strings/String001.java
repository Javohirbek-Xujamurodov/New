package strings;

import java.util.Scanner;

public class String001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Belgi kiriting : ");
        char a = scanner.next().charAt(0);
        int ascii = (int) a;
        System.out.println(ascii);

    }
}
