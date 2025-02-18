package cases;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Og'irlik birligining raqami (1-5): ");
        int n = scanner.nextInt();
        System.out.print("Og'irlik qiymati: ");
        double m = scanner.nextDouble();

        double massInKilograms = 0;

        switch (n) {
            case 1:
                massInKilograms = m;
                break;
            case 2:
                massInKilograms = m / 1_000_000;
                break;
            case 3:
                massInKilograms = m / 1000;
                break;
            case 4:
                massInKilograms = m * 1000;
                break;
            case 5:
                massInKilograms = m * 100;
                break;
            default:
                System.out.println("Noto'g'ri birlik raqami. Iltimos, 1 dan 5 gacha bo'lgan sonni kiriting.");
                return;
        }

        System.out.printf("Mass kilogramlarda: %.2f kg%n", massInKilograms);
    }
}

