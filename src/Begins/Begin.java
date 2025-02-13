/*Xujamurodov Javohirbek*/
package Begins;

import java.util.Scanner;

public class Begin {
    public static void main(String[] args) {
        System.out.println("This is Abramyan's book");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Qaysi misolni ishlatib ko'rmoqchisiz?");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("You are exiting the loop!");
                break;
            }
            switch (choice) {
                case 2 -> {
                    System.out.println("Enter the value of a:");
                    int a = sc.nextInt();
                    System.out.println("S = " + Begin2(a));
                }
                case 1 -> {
                    System.out.println("Enter the value of a:");
                    int a = sc.nextInt();
                    System.out.println("P = " + Begin1(a));
                }
                case 3 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();

                    Begin3(a, b);
                }
                case 4 -> {
                    System.out.println("Enter D:");
                    int d = sc.nextInt();
                    System.out.println("L = " + Begin4(d));
                }
                case 5 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    Begin5(a);
                }
                case 6 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter c:");
                    int c = sc.nextInt();
                    Begin6(a, b, c);
                }
                case 7 -> {
                    System.out.println("Enter R:");
                    int r = sc.nextInt();
                    Begin7(r);

                }
                case 8 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();

                    System.out.println(Begin8(a, b));
                }
                case 9 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();

                    System.out.println(Begin9(a, b));
                }
                case 10 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();
                    Begin10(a, b);
                }
                case 11 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();
                    Begin10(a, b);
                }
                case 12 -> {
                    System.out.println("Enter A:");
                    int a = sc.nextInt();
                    System.out.println("Enter B:");
                    int b = sc.nextInt();
                    Begin12(a, b);
                }
                case 14 -> {
                    System.out.println("Enter L:");
                    int l = sc.nextInt();

                    Begin14(l);
                }
                case 15 -> {
                    System.out.println("Enter S:");
                    int S = sc.nextInt();

                    Begin15(S);
                }
                case 16 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();

                    System.out.println(Begin16(x1, x2));
                }
                case 17 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter b:");
                    int c = sc.nextInt();

                    System.out.println(Begin17(a, b, c));
                }
                case 18 -> {
                    System.out.println("Enter a:");
                    int a = sc.nextInt();
                    System.out.println("Enter b:");
                    int b = sc.nextInt();
                    System.out.println("Enter b:");
                    int c = sc.nextInt();

                    System.out.println(Begin18(a, b, c));
                }
                case 20 -> {
                    System.out.println("Enter x1:");
                    int x1 = sc.nextInt();
                    System.out.println("Enter y1:");
                    int y1 = sc.nextInt();
                    System.out.println("Enter x2:");
                    int x2 = sc.nextInt();
                    System.out.println("Enter y2:");
                    int y2 = sc.nextInt();


                    System.out.println(Begin20(x1, x2, y1, y2));
                }
                case 22 -> {
                    System.out.println("Enter A :");
                    int a = sc.nextInt();
                    System.out.println("Enter B :");
                    int b = sc.nextInt();
                    Begin22(a, b);
                }
                case 23 -> {
                    System.out.println("Enter A :");
                    int a = sc.nextInt();
                    System.out.println("Enter B :");
                    int b = sc.nextInt();
                    System.out.println("Enter C :");
                    int c = sc.nextInt();
                    Begin23(a, b, c);
                }
                case 25 -> {
                    System.out.println("Enter X :");
                    int x = sc.nextInt();
                    System.out.println(" y = " + Begin25(x));

                }
                case 26 -> {
                    System.out.println("Enter X :");
                    int x = sc.nextInt();
                    System.out.println(" y = " + Begin26(x));

                }
                case 27 -> {
                    System.out.println("Enter A :");
                    int A = sc.nextInt();
                    Begin27(A);

                }
                case 28 -> {
                    System.out.println("Enter A :");
                    int A = sc.nextInt();
                    Begin28(A);

                }
                case 29 -> {
                    System.out.println("Enter a :");
                    int a = sc.nextInt();
                    System.out.println(" Radian = " + Begin29(a));

                }
                case 30 -> {
                    System.out.println("Enter :");
                    int a = sc.nextInt();
                    System.out.println(" degree = " + Begin30(a));

                }
                case 31 -> {
                    System.out.println("Enter :");
                    int TC = sc.nextInt();
                    System.out.println(" TC = " + Begin31(TC));

                }
                case 33 -> {
                    System.out.print("X (kg shirinlik) ni kiriting: ");
                    double x = sc.nextDouble();

                    System.out.print("A (X kg uchun narx) ni kiriting: ");
                    double a = sc.nextDouble();

                    System.out.print("Y (kg shirinlik) ni kiriting: ");
                    double y = sc.nextDouble();
                    Begin33(x, a, y);
                }

                case 34 -> {
                    System.out.print("Shokoladning og'irligi (X kg): ");
                    double X = sc.nextDouble();

                    System.out.print("Shokoladning umumiy narxi (A evro): ");
                    double A = sc.nextDouble();

                    System.out.print("Shakar konfetining og'irligi (Y kg): ");
                    double Y = sc.nextDouble();

                    System.out.print("Shakar konfetining umumiy narxi (B evro): ");
                    double B = sc.nextDouble();
                    Begin34(X, A, Y, B);
                }

                case 35 -> {
                    System.out.println("V, U, T1 va T2 qiymatlarini kiriting: ");
                    double V = sc.nextDouble();
                    double U = sc.nextDouble();
                    double T1 = sc.nextDouble();
                    double T2 = sc.nextDouble();

                    if (U >= V) {
                        System.out.println("U qiymati V dan kichik bo'lishi kerak.");
                    } else {
                        double S = (T1 * V) + (T2 * (V - U));
                        System.out.println("Qayiq bosib o'tgan masofa: " + S + " km");
                    }
                }

                case 36 -> {
                    System.out.println("V1, V2, S va T qiymatlarini kiriting: ");
                    double V1 = sc.nextDouble();
                    double V2 = sc.nextDouble();
                    double S36 = sc.nextDouble();
                    double T36 = sc.nextDouble();

                    double masofa36 = S36 + T36 * (V1 + V2);
                    System.out.println("Mashinalar orasidagi masofa: " + masofa36 + " km");
                }

                case 37 -> {
                    System.out.println("V1, V2, S va T qiymatlarini kiriting: ");
                    double V1 = sc.nextDouble();
                    double V2 = sc.nextDouble();
                    double S37 = sc.nextDouble();
                    double T37 = sc.nextDouble();

                    double masofa37 = Math.abs(S37 - T37 * (V1 + V2));
                    System.out.println("Mashinalar orasidagi masofa: " + masofa37 + " km");
                }

                case 38 -> {
                    System.out.println("A va B qiymatlarini kiriting: ");
                    double A = sc.nextDouble();
                    double B = sc.nextDouble();

                    if (A == 0) {
                        System.out.println("A qiymati 0 ga teng bo'lmasligi kerak.");
                    } else {
                        double x = -B / A;
                        System.out.println("Tenglama yechimi: x = " + x);
                    }
                }

                case 39 -> {
                    System.out.println("A, B va C qiymatlarini kiriting: ");
                    double A = sc.nextDouble();
                    double B = sc.nextDouble();
                    double C = sc.nextDouble();

                    double D = B * B - 4 * A * C;
                    if (A == 0 || D < 0) {
                        System.out.println("Tenglama uchun shartlar bajarilmaydi.");
                    } else {
                        double x1 = (-B - Math.sqrt(D)) / (2 * A);
                        double x2 = (-B + Math.sqrt(D)) / (2 * A);
                        System.out.println("Kvadrat tenglama ildizlari: x1 = " + x1 + ", x2 = " + x2);
                    }
                }

                case 40 -> {
                    System.out.println("A1, B1, C1, A2, B2 va C2 qiymatlarini kiriting: ");
                    double A1 = sc.nextDouble();
                    double B1 = sc.nextDouble();
                    double C1 = sc.nextDouble();
                    double A2 = sc.nextDouble();
                    double B2 = sc.nextDouble();
                    double C2 = sc.nextDouble();

                    double D40 = A1 * B2 - A2 * B1;
                    if (D40 == 0) {
                        System.out.println("Tizimning yagona yechimi yo'q.");
                    } else {
                        double x = (C1 * B2 - C2 * B1) / D40;
                        double y = (A1 * C2 - A2 * C1) / D40;
                        System.out.println("Tizimning yechimi: x = " + x + ", y = " + y);
                    }
                }


                default -> {
                    System.out.println("Input must be around 1 - 40");
                }
            }
        }
    }


    public static int Begin2(int a) {
        return a * a;
    }

    public static int Begin1(int a) {
        return 4 * a;
    }

    public static void Begin3(int a, int b) {
        System.out.println(" S = " + a * b);
        System.out.println(" P = " + 2 * (a * b));

    }

    public static double Begin4(int d) {
        return Math.PI * d * Math.PI;
    }

    public static void Begin5(int a) {
        System.out.println(" V = " + a * a * a);
        System.out.println(" P = " + 6 * a * a);

    }

    public static void Begin6(int a, int b, int c) {
        System.out.println(" V = " + a * b * c);
        System.out.println(" S = " + 2 * (a * b + b * c + a * c));

    }

    public static void Begin7(int r) {
        System.out.println(" L = " + 2 * Math.PI * r);
        System.out.println(" S = " + Math.PI * (r * r));

    }

    public static float Begin8(int a, int b) {
        return (a + b) / 2;
    }

    public static double Begin9(int a, int b) {
        return Math.sqrt(a * b);
    }

    public static void Begin10(int a, int b) {
        System.out.println(" a + b " + (a + b));
        System.out.println(" a - b " + (a - b));
        System.out.println(" a * b " + (a * b));

    }

    public static void Begin12(int a, int b) {
        System.out.println(" C " + Math.sqrt((a * a + b * b)));
        System.out.println(" P " + a + b + Math.sqrt((a * a + b * b)));


    }

    public static void Begin14(int l) {
        double R = 2 * Math.PI / l;
        System.out.println(" S = " + Math.PI * (R * R));

    }

    public static void Begin15(int S) {
        double D = Math.sqrt(4 * S / Math.PI);
        System.out.println(" L = " + Math.PI * D);
        System.out.println(" D = " + D);

    }

    public static int Begin16(int x1, int x2) {
        return Math.abs(x2 - x1);
    }

    public static int Begin17(int a, int b, int c) {
        return c - a + c - b;
    }

    public static int Begin18(int a, int b, int c) {
        return (c - a) * (c - b);
    }

    public static double Begin20(int x1, int x2, int y1, int y2) {
        return Math.sqrt(x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }

    public static void Begin22(int a, int b) {
        System.out.println(" A = " + b);
        System.out.println(" B = " + a);

    }

    public static void Begin23(int a, int b, int c) {
        System.out.println(" A = " + b);
        System.out.println(" B = " + a);
        System.out.println(" C = " + a);

    }

    public static double Begin25(int x) {

        return 3 * Math.pow(x, 6) - 6 * (x * x) - 7;
    }

    public static double Begin26(int x) {

        return 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;
    }

    public static void Begin27(int A) {

        int A2 = A * A;
        int A4 = A2 * A2;
        int A8 = A4 * A4;

        System.out.println("A^2 = " + A2);
        System.out.println("A^4 = " + A4);
        System.out.println("A^8 = " + A8);
    }

    public static void Begin28(int A) {

        int A2 = A * A;
        int A3 = A2 * A;
        int A5 = A3 * A2;
        int A10 = A5 * A5;
        int A15 = A10 * A5;

        System.out.println("A^2 = " + A2);
        System.out.println("A^3 = " + A3);
        System.out.println("A^5 = " + A5);
        System.out.println("A^10 = " + A10);
        System.out.println("A^15 = " + A15);
    }

    public static double Begin29(int a) {
        double Radian = (a * Math.PI) / 180;
        return Radian;
    }

    public static double Begin30(int a) {
        double Radian = (a * 180) / Math.PI;
        return Radian;
    }

    public static double Begin31(int TF) {
        double Tc = (TF - 32) * (5 / 9);
        return Tc;
    }

    public static void Begin33(double x, double a, double y) {
        double pricePerKg = a / x;
        double priceForYKg = pricePerKg * y;
        System.out.println("1 kg shirinlikning narxi: " + pricePerKg + " yevro");
        System.out.println(y + " kg shirinlikning narxi: " + priceForYKg + " yevro");
    }

    public static void Begin34(double X, double A, double Y, double B) {
        double chocolatePricePerKg = A / X;
        double candyPricePerKg = B / Y;
        double priceRatio = chocolatePricePerKg / candyPricePerKg;
        System.out.println("1 kg shokoladning narxi: " + chocolatePricePerKg + " evro");
        System.out.println("1 kg shakar konfetining narxi: " + candyPricePerKg + " evro");
        System.out.println("Shokolad shakar konfetidan " + priceRatio + " marta qimmatroq.");
    }


}

