package strings;

import java.util.Scanner;

public class String010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str1 = ");
        String str1 = scanner.next();
        String yangiStr = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            yangiStr+=str1.charAt(i);
        }
        System.out.println(" Natija : " +yangiStr);

    }
}
