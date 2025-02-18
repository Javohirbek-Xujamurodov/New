package cases;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Robotning boshlang'ich yo'nalishi (N, W, S, E): ");
        char c = scanner.next().charAt(0);
        System.out.print("Ko'rsatma (0 - harakat qilish, 1 - chapga burilish, -1 - o'ngga burilish): ");
        int n = scanner.nextInt();

        char finalDirection = c;

        switch (n) {
            case 0:
                finalDirection = c;
                break;
            case 1:
                switch (c) {
                    case 'N':
                        finalDirection = 'W';
                        break;
                    case 'W':
                        finalDirection = 'S';
                        break;
                    case 'S':
                        finalDirection = 'E';
                        break;
                    case 'E':
                        finalDirection = 'N';
                        break;
                }
                break;
            case -1:
                switch (c) {
                    case 'N':
                        finalDirection = 'E';
                        break;
                    case 'E':
                        finalDirection = 'S';
                        break;
                    case 'S':
                        finalDirection = 'W';
                        break;
                    case 'W':
                        finalDirection = 'N';
                        break;
                }
                break;
            default:
                System.out.println("Noto'g'ri ko'rsatma. Faqat 0, 1 yoki -1 bo'lishi mumkin.");
                return;
        }
        System.out.println("Robotning yakuniy yo'nalishi: " + finalDirection);
    }

}

