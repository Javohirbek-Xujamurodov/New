package whiles;

import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 0): ");
        int N = scanner.nextInt();

        if (N > 0) {
            int K = 0;

            while ((K + 1) * (K + 1) <= N) {
                K++;
            }

            System.out.println("K = " + K + ", chunki K^2 ≤ N");
        } else {
            System.out.println("N musbat bo'lishi kerak!");
        }

    }
}
