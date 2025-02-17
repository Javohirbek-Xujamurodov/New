package Ifs;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the value of A: ");
                int A = scanner.nextInt();

                System.out.print("Enter the value of B: ");
                int B = scanner.nextInt();

                if (A != B) {
                    int sum = A + B;
                    A = sum;
                    B = sum;
                } else {
                    A = 0;
                    B = 0;
                }

                System.out.println("New value of A: " + A);
                System.out.println("New value of B: " + B);
            }
        }

