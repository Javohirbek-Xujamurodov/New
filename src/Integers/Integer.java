package Integers;
import java.util.Scanner;

public class Integer {
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

                case 1 -> {
                    System.out.println("L : (sm)");
                    int l = sc.nextInt();
                    int meters = l / 100;
                    System.out.println("meters  = " + meters);
                }
                case 2 -> {
                    System.out.println("M : (kg)");
                    int m = sc.nextInt();
                    int tonna = m / 1000;
                    System.out.println("tonna  = " + tonna);
                }
                case 3 -> {
                    System.out.println("Bayt kiriting : ");
                    double Bayt = sc.nextDouble();
                    double Kbayt = Bayt / 1024;
                    System.out.println("Kbayt  = " + Kbayt);
                }
                case 4 -> {
                    System.out.print("A ni kiriting (A > B): ");
                    int A = sc.nextInt();

                    System.out.print("B ni kiriting (B > 0): ");
                    int B = sc.nextInt();

                    if (A > B) {
                        int segmentCount = A / B;
                        System.out.println("A segmentida joylashgan B segmentlari soni: " + segmentCount);
                    } else {
                        System.out.println("A soni B sonidan katta bo'lishi kerak.");
                    }
                }
                case 5 -> {
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
                case 6 -> {
                    System.out.print(" Ikki xonali son kiriting : ");
                    int n = sc.nextInt();
                    int r10 = n / 10;
                    int r1 = n % 10;
                    if (n > 9 && n < 100) {
                        System.out.println(" r10 : " + r10);
                        System.out.println(" r1 : " + r1);
                    } else {
                        System.out.println(" Ikki xonali son emas!!!");
                    }

                }
                case 7 -> {
                    System.out.print(" Ikki xonali son kiriting : ");
                    int n = sc.nextInt();
                    int r10 = n / 10;
                    int r1 = n % 10;
                    int RnSumma = r1 + r10;
                    if (n > 9 && n < 100) {
                        System.out.println(n + " ning raqamlar yig'indisi " + RnSumma);
                    } else {
                        System.out.println(" Ikki xonali son emas");
                    }

                }
                case 8 -> {
                    System.out.print(" Ikki xonali son kiriting : ");
                    int n = sc.nextInt();
                    int r10 = n / 10;
                    int r1 = n % 10;
                    int NewRaqam = r1 * 10 + r10;
                    if (n > 9 && n < 100) {
                        System.out.println(n + " ning raqamlar almashgani " + NewRaqam);
                    } else {
                        System.out.println(" Ikki xonali son emas");
                    }

                }
                case 9 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    int n = sc.nextInt();
                    int r100 = n / 100 % 10;
                    if (n > 99 && n < 1000) {
                        System.out.println(" r100 ==> " + r100);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 10 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    if (n > 99 && n < 1000) {
                        System.out.println(" r10 ==> " + r10);
                        System.out.println(" r1 ==> " + r1);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 11 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int SummaRaqam = r1 + r10 + r100;
                    if (n > 99 && n < 1000) {
                        System.out.println(" Summa ==> " + SummaRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 12 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int TeskariRaqam = r1 * 100 + r10 * 10 + r100;
                    if (n > 99 && n < 1000) {
                        System.out.println(" yangi raqam ==> " + TeskariRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 13 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int NewRaqam = r10 * 100 + r1 * 10 + r100;
                    if (n > 99 && n < 1000) {
                        System.out.println(" yangi raqam ==> " + NewRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 14 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int NewRaqam = r1 * 100 + r100 * 10 + r10;
                    if (n > 99 && n < 1000) {
                        System.out.println(" yangi raqam ==> " + NewRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 15 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int NewRaqam = r10 * 100 + r100 * 10 + r1;
                    if (n > 99 && n < 1000) {
                        System.out.println(" yangi raqam ==> " + NewRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 16 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    short n = sc.nextShort();

                    int r100 = n / 100 % 10;
                    int r10 = n / 10 % 10;
                    int r1 = n % 10;
                    int NewRaqam = r100 * 100 + r1 * 10 + r10;
                    if (n > 99 && n < 1000) {
                        System.out.println(" yangi raqam ==> " + NewRaqam);
                    } else {
                        System.out.println(" uch xonali son emas");
                    }

                }
                case 17 -> {
                    System.out.print(" UCH xonali son kiriting : ");
                    int n = sc.nextInt();

                    if (n > 999) {
                        int r100 = n / 100 % 10;
                        System.out.println(" r100 ==> " + r100);
                    } else {
                        System.out.println(" 999 dan katta son emas");
                    }

                }
                case 18 -> {
                    System.out.print(" 999 dan katta son kiriting : ");
                    int n = sc.nextInt();

                    if (n > 999) {
                        int r100 = n / 1000 % 10;
                        System.out.println(" r100 ==> " + r100);
                    } else {
                        System.out.println(" 999 dan katta son emas");
                    }

                }
                case 19 -> {
                    System.out.print(" sekund kiriting : ");
                    int sekund = sc.nextInt();

                    int minut = sekund / 60;
                    System.out.println(" Kun boshidan " + minut + " minut Utdi");

                }
                case 20 -> {
                    System.out.print(" sekund kiriting : ");
                    int sekund = sc.nextInt();

                    int soat = sekund / 3600;
                    System.out.println(" Kun boshidan " + soat + " soat Utdi");

                }
                case 21 -> {
                    System.out.print(" sekund kiriting : ");
                    int sekund = sc.nextInt();

                    System.out.println(" Kun boshidan " + sekund / 60 + " minut " + sekund % 60 + " sekund utdi");

                }
                case 22 -> {
                    System.out.print(" sekund kiriting : ");
                    int sekund = sc.nextInt();

                    System.out.println(" Kun boshidan " + sekund / 3600 + " soat " + sekund % 60 + " sekund utdi");

                }
                case 23 -> {
                    System.out.print(" sekund kiriting : ");
                    int sekund = sc.nextInt();

                    System.out.println(" Kun boshidan " + sekund / 3600 + " soat " + sekund % 60 + " minut " + sekund % 60 + " sekund utdi");

                }
                case 24 -> {
                    System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
                    int K = sc.nextInt();

                    if (K >= 1 && K <= 365) {
                        int startingDay = 1;
                        int weekDay = (K + startingDay - 1) % 7;

                        System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
                        switch (weekDay) {
                            case 0 -> System.out.println("Yakshanba");
                            case 1 -> System.out.println("Dushanba");
                            case 2 -> System.out.println("Seshanba");
                            case 3 -> System.out.println("Chorshanba");
                            case 4 -> System.out.println("Payshanba");
                            case 5 -> System.out.println("Juma");
                            case 6 -> System.out.println("Shanba");
                        }
                    } else {
                        System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
                    }

                }
                case 25 -> {
                    System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
                    int K = sc.nextInt();

                    if (K >= 1 && K <= 365) {
                        int startingDay = 4;
                        int weekDay = (K + startingDay - 1) % 7;

                        System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
                        switch (weekDay) {
                            case 0 -> System.out.println("Yakshanba");
                            case 1 -> System.out.println("Dushanba");
                            case 2 -> System.out.println("Seshanba");
                            case 3 -> System.out.println("Chorshanba");
                            case 4 -> System.out.println("Payshanba");
                            case 5 -> System.out.println("Juma");
                            case 6 -> System.out.println("Shanba");
                        }
                    } else {
                        System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
                    }

                }
                case 26 -> {
                    System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
                    int K = sc.nextInt();

                    if (K >= 1 && K <= 365) {
                        int startingDay = 4;
                        int weekDay = ((K + 2 - startingDay) % 7) + 1;

                        System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
                        switch (weekDay) {
                            case 0 -> System.out.println("Yakshanba");
                            case 1 -> System.out.println("Dushanba");
                            case 2 -> System.out.println("Seshanba");
                            case 3 -> System.out.println("Chorshanba");
                            case 4 -> System.out.println("Payshanba");
                            case 5 -> System.out.println("Juma");
                            case 6 -> System.out.println("Shanba");
                        }
                    } else {
                        System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
                    }

                }
                case 27 -> {
                    System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
                    int K = sc.nextInt();

                    if (K >= 1 && K <= 365) {
                        int startingDay = 6;
                        int weekDay = ((K + startingDay - 2) % 7) + 1;

                        System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
                        switch (weekDay) {
                            case 0 -> System.out.println("Yakshanba");
                            case 1 -> System.out.println("Dushanba");
                            case 2 -> System.out.println("Seshanba");
                            case 3 -> System.out.println("Chorshanba");
                            case 4 -> System.out.println("Payshanba");
                            case 5 -> System.out.println("Juma");
                            case 6 -> System.out.println("Shanba");
                        }
                    } else {
                        System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
                    }

                }
                case 28 -> {
                    System.out.print("K (1 dan 365 gacha bo'lgan son) ni kiriting: ");
                    int K = sc.nextInt();

                    if (K >= 1 && K <= 365) {
                        int startingDay = 1;
                        int weekDay = ((K + startingDay - 2) % 7) + 1;

                        System.out.println("K - kun haftaning " + weekDay + " raqamiga to'g'ri keladi.");
                        switch (weekDay) {
                            case 0 -> System.out.println("Yakshanba");
                            case 1 -> System.out.println("Dushanba");
                            case 2 -> System.out.println("Seshanba");
                            case 3 -> System.out.println("Chorshanba");
                            case 4 -> System.out.println("Payshanba");
                            case 5 -> System.out.println("Juma");
                            case 6 -> System.out.println("Shanba");
                        }
                    } else {
                        System.out.println("K 1 dan 365 gacha bo'lgan oraliqda bo'lishi kerak.");
                    }

                }
                case 29 -> {

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

                }case 30 -> {

                    System.out.print("Yilni kiriting: ");
                    int year = sc.nextInt();
                    int century = (year - 1) / 100 + 1;

                    System.out.println(year + " yil " + century + "-asrga tegishli.");
                }



                default -> {
                    System.out.println("Input must be around 1 - 30");
                }
            }
        }
    }


}

