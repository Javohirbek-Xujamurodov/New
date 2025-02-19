    package whiles;

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();
int sanoq = 0;
        while ( n >=2){
            n/=2;
            sanoq++;
        }

        if (n == 1){
            System.out.println(" 2 ning " + sanoq + " darajasi");
        }else {
            System.out.println(" 2 ning darajasi emas!!!");
        }

    }
}

