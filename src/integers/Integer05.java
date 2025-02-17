package integers;

import java.util.Scanner;

public class Integer05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A ni kiriting (A > B): ");
        int A = sc.nextInt();

        System.out.print("B ni kiriting (B > 0): ");
        int B = sc.nextInt();

        if (A > B) {
            int segmentCount = A % B;
            System.out.println("A segmentida joylashmagan B qismi: " + segmentCount);
        } else {
            System.out.println("A soni B sonidan katta bo'lishi kerak.");
        }

    }
}
