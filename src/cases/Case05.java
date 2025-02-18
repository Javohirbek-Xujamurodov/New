package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" A : ");
        int a = scanner.nextInt();
        System.out.print(" B : ");
        int b = scanner.nextInt();
        System.out.print(" Amal kiriting : ");
        int amal = scanner.nextInt();
        switch (amal) {
            case 1 -> System.out.println(" A " + " + " + " B " + " =  " + (a+b));
            case 2 -> System.out.println(" A " + " - " + " B " + " =  " + (a-b));
            case 3 -> System.out.println(" A " + " / " + " B " + " =  " + (a/b));
            case 4 -> System.out.println(" A " + " * " + " B " + " =  " + (a*b));
        }

    }
}
