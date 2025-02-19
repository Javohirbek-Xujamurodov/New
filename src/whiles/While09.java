package whiles;

import java.util.Scanner;

public class While09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N ni kiriting (N > 1): ");
        int N = scanner.nextInt();

        if (N > 1) {
            int K = 0;
            int power = 1;

            while (power <= N) {
                power *= 3;
                K++;
            }

            System.out.println("K = " + K + ", chunki 3^K > N");
        } else {
            System.out.println("N 1 dan katta bo'lishi kerak!");
        }
    }
}
