package strings;

import java.util.Scanner;

public class String003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Belgi kiriting : ");
        char a = scanner.next().charAt(0);
        int oldingiBelgi = (int) a-1;
        int keyingiBelgi = (int) a+1;
        System.out.println("oldingi Belgi" + (char) oldingiBelgi);
        System.out.println("keyingi Belgi" + (char) keyingiBelgi);

    }
}
