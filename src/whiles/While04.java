package whiles;

import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        while ( n >=3){
            n-=3;
        }

        if (n == 0){
            System.out.println(" 3 ning darajasi");
        }else {
            System.out.println(" 3 ning darajasi emas!!!");
        }

    }
}
