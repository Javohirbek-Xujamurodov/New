package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kun (D): ");
        int d = scanner.nextInt();
        System.out.print("Oy (M): ");
        int m = scanner.nextInt();

        int daysInPrevMonth = 0;

        if (d > 1) {
            d--;
        } else {
            switch (m) {
                case 1:
                    m = 12;
                    daysInPrevMonth = 31;
                    break;
                case 2:
                    m = 1;
                    daysInPrevMonth = 31;
                    break;
                case 3:
                    m = 2;
                    daysInPrevMonth = 28;
                    break;
                case 4:
                    m = 3;
                    daysInPrevMonth = 31;
                    break;
                case 5:
                    m = 4;
                    daysInPrevMonth = 30;
                    break;
                case 6:
                    m = 5;
                    daysInPrevMonth = 31;
                    break;
                case 7:
                    m = 6;
                    daysInPrevMonth = 30;
                    break;
                case 8:
                    m = 7;
                    daysInPrevMonth = 31;
                    break;
                case 9:
                    m = 8;
                    daysInPrevMonth = 31;
                    break;
                case 10:
                    m = 9;
                    daysInPrevMonth = 30;
                    break;
                case 11:
                    m = 10;
                    daysInPrevMonth = 31;
                    break;
                case 12:
                    m = 11;
                    daysInPrevMonth = 30;
                    break;
                default:
                    System.out.println("Noto'g'ri sana.");
                    return;
            }
            d = daysInPrevMonth;
        }

        System.out.print("Oldingi sana: " + d + " " + m);
    }

}

