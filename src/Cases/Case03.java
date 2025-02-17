package Cases;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (1-5): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Qish");
            case 2 -> System.out.println("Qish");
            case 3 -> System.out.println("Bahor ");
            case 4 -> System.out.println("Bahor ");
            case 5 -> System.out.println("Bahor ");
            case 6 -> System.out.println("Yoz ");
            case 7 -> System.out.println("Yoz ");
            case 8 -> System.out.println("Yoz ");
            case 9 -> System.out.println("Kuz ");
            case 10 -> System.out.println("Kuz ");
            case 11 -> System.out.println("Kuz ");
            case 12 -> System.out.println("Wish ");

            default -> System.out.println("Invalid input! Please enter a number between 1 and 5.");
        }
    }
}
