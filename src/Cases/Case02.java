package Cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (1-5): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Yomon");
            case 2 -> System.out.println("qoniqarsiz");
            case 3 -> System.out.println("qoniqarli");
            case 4 -> System.out.println("yaxchi ");
            case 5 -> System.out.println("a'lo");
            default -> System.out.println("Invalid input! Please enter a number between 1 and 5.");
        }
    }
}
