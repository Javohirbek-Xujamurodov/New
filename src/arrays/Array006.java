package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter N : ");
                int N = scanner.nextInt();

                System.out.print("Enter A : ");
                double A = scanner.nextDouble();

                System.out.print("Enter D : ");
                double D = scanner.nextDouble();

                double[] sequence = new double[N];

                for (int i = 0; i < N; i++) {
                    sequence[i] = A + i * D;
                }

                System.out.println("Arithmetic sequence:");
                for (double num : sequence) {
                    System.out.print(num + " ");
                }
            }
        }



