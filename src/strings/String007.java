package strings;

import java.util.Scanner;

public class String007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str : ");
        String n = scanner.next();
        char firstChar = n.charAt(0);
        char lastChar = n.charAt(n.length() - 1);

        System.out.println("Birinchi belgi ASCII: " + (int) firstChar);
        System.out.println("Oxirgi belgi ASCII: " + (int) lastChar);





    }
}
