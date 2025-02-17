package integers;

import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
        int K = sc.nextInt();

        if (K >= 1 && K <= 365) {
            int startingDay = 4;
            int weekDay = ((K + 2 - startingDay) % 7) + 1;

            System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
            switch (weekDay) {
                case 0 -> System.out.println("Yakshanba");
                case 1 -> System.out.println("Dushanba");
                case 2 -> System.out.println("Seshanba");
                case 3 -> System.out.println("Chorshanba");
                case 4 -> System.out.println("Payshanba");
                case 5 -> System.out.println("Juma");
                case 6 -> System.out.println("Shanba");
            }
        } else {
            System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
        }

    }
        }


