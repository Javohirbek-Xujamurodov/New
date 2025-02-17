package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" sekund kiriting : ");
        int sekund = sc.nextInt();

        System.out.println(" Kun boshidan " + sekund / 3600 + " soat " + sekund % 60 + " minut " + sekund % 60 + " sekund utdi");

    }
}
