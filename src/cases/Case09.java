package cases;

import java.util.Scanner;

public class Case09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kun (D): ");
        int d = scanner.nextInt();
        System.out.print("Oy (M): ");
        int m = scanner.nextInt();

        int daysInMonth = 0;

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("Noto'g'ri sana.");
                return;
        }

        if (d < daysInMonth) {
            d++;
        } else {
            d = 1;
            if (m < 12) {
                m++;
            } else {
                m = 1;
            }
        }

        System.out.printf("Keyingi sana: " + d + " " + m);
    }

}

