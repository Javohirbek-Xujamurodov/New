    package whiles;

import java.util.Scanner;

    public class While06 {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("N ni kiriting (N > 0): ");
                    int N = scanner.nextInt();

                    if (N > 0) {
                        int doubleFactorial = 1;

                        while (N > 0) {
                            doubleFactorial *= N;
                            N -= 2;
                        }

                        System.out.println("N!! = " + doubleFactorial);
                    } else {
                        System.out.println("N musbat bo'lishi kerak!");
                    }

                }
            }



