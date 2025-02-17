package integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("To'rtburchakning uzunligini kiriting (A): ");
        int A = sc.nextInt();

        System.out.print("To'rtburchakning kengligini kiriting (B): ");
        int B = sc.nextInt();

        System.out.print("Kvadratning tomon uzunligini kiriting (C): ");
        int C = sc.nextInt();
        if (C > A || C > B) {
            System.out.println("Kvadratning tomon uzunligi to'rtburchakning o'lchamidan katta bo'lishi mumkin emas!");
            return;
        }


        int m = A / C;
        int n = B / C;
        int totalSquares = m * n;


        int rectangleArea = A * B;
        int squaresArea = totalSquares * (C * C);
        int unusedArea = rectangleArea - squaresArea;

        System.out.println("To'rtburchakda joylashgan kvadratlar soni: " + totalSquares);
        System.out.println("Foydalanilmagan to'rtburchakning maydoni: " + unusedArea);

    }
}


