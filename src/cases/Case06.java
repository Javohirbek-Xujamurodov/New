package cases;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzunlik birligining raqami (1-5): ");
        int n = scanner.nextInt();
        System.out.print("Uzunlik qiymati: ");
        double l = scanner.nextDouble();

        double lengthInMeters = 0;
        switch (n) {
            case 1:
                lengthInMeters = l / 10;
                break;
            case 2:
                lengthInMeters = l * 1000;
                break;
            case 3:
                lengthInMeters = l;
                break;
            case 4:
                lengthInMeters = l / 1000;
                break;
            case 5:
                lengthInMeters = l / 100;
                break;
            default:
                System.out.println("Noto'g'ri birlik raqami. Iltimos, 1 dan 5 gacha bo'lgan sonni kiriting.");
                return;
        }

        System.out.printf("Uzunlik metrda: %.2f m%n", lengthInMeters);
    }

    }

