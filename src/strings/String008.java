package strings;

import java.util.Scanner;

public class String008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.print("C = ");
        char c = scanner.next().charAt(0);

        String natija = "";

        for (int i = 0; i < n; i++) {
            natija +=c;
        }
        System.out.println(natija);




    }
}
