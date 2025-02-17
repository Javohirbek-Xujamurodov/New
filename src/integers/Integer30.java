package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yilni kiriting: ");
        int year = sc.nextInt();
        int century = (year - 1) / 100 + 1;

        System.out.println(year + " yil " + century + "-asrga tegishli.");
    }

    }



