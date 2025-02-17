package integers;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" sekund kiriting : ");
        int sekund = sc.nextInt();

        System.out.println(" Kun boshidan " + sekund / 60 + " minut " + sekund % 60 + " sekund utdi");
    }
}
