package fors;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("N ni kiriting (N > 0): ");
                int N = scanner.nextInt();

                if (N > 0) {
                    double sum = 0.0;

                    for (int i = 1; i <= N; i++) {
                        sum += 1.0 / i;
                    }

                    System.out.println("Summa: " + sum);
                } else {
                    System.out.println("N musbat bo'lishi kerak!");
                }

                scanner.close();
            }
        }



