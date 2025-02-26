    package strings;

import java.util.Scanner;

public class String012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str1 = ");
        String str1 = scanner.next();
        String yangiStr = "";
        for (int i = 0; i < str1.length(); i++) {
            yangiStr+= " " + str1.charAt(i);
        }
        System.out.println(" Natija : " +yangiStr);

    }
}
