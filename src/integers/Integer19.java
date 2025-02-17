package integers;

import java.util.Scanner;

public class Integer19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" sekund kiriting : ");
        int sekund = sc.nextInt();

        int minut = sekund / 60;
        System.out.println(" Kun boshidan " + minut + " minut Utdi");
    }
}
