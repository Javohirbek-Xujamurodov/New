package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy kiriting (1-12): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(" 31 kundan iborat");
            case 4, 6, 9, 11 -> System.out.println(" 30 kundan iborat");
            case 2 -> System.out.println(" 28 kundan iborat");
        }

    }
}
