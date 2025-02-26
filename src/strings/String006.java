package strings;

import java.util.Scanner;

public class String006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        char n = scanner.next().charAt(0);

        if (Character.isDigit(n)){
            System.out.println(" digit ");
        }else if ( Character.isUpperCase(n)){
            System.out.println(" Upper ");
        }else if ( Character.isLowerCase(n)){
            System.out.println(" lower ");
        } else {
            System.out.println("Noto‘g‘ri belgi!");
        }



    }
}
