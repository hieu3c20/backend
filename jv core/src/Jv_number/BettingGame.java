package Jv_number;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BettingGame {
    public static void main(String[] args) {
        double userAccount = 4000000;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi", "VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

        int choice = 0;

        try {
            do {
                System.out.println("\n______________________GETTING STARTED______________");
                System.out.println("__________Select (1) to begin play");
                System.out.println("__________Select any button to exist");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("********** Start **********");
//              Betting

                    double betting = 0;
                    System.out.println("***** Your balance: " + nf.format(userAccount) + "\n***** Enter betting money");
                    do {
                        System.out.print("***** Bet (0 < Amount of betting money <= " + nf.format(userAccount) + "): ");
                        betting = sc.nextDouble();
                    } while (betting <= 0 || betting > userAccount);

//              Sic bo - under or over
                    int betUnderOrOver = 0;
                    do {
                        System.out.print("***** Choose 1(Over) or Choose 2(Under): ");
                        betUnderOrOver = sc.nextInt();
                    } while (betUnderOrOver != 1 && betUnderOrOver != 2);

//              toss dice
                    Random dice1 = new Random();
                    Random dice2 = new Random();
                    Random dice3 = new Random();

                    int value1 = dice1.nextInt(5) + 1;
                    int value2 = dice2.nextInt(5) + 1;
                    int value3 = dice3.nextInt(5) + 1;
                    int sum = value1 + value2 + value3;

                    System.out.println("\n***** Result: " + value1 + " _ " + value2 + " _ " + value3);
                    if (sum == 3 || sum == 18) {
                        userAccount = userAccount - betting;
                        System.out.println("***** Result: " + sum + "=====> Bookie take all money, you have been loosen");
                        System.out.println("***** Your current balance: " + nf.format(userAccount));

                    } else if (sum >= 4 && sum <= 10) {
                        System.out.println("***** Result: " + sum + " == > Under");
                        if (betUnderOrOver == 2) {
                            System.out.println("***** You are win");
                            userAccount += betting;
                            System.out.println("Your current value: " + nf.format(userAccount));
                        } else {
                            System.out.println("***** Your have been loosen");
                            userAccount -= betting;
                            System.out.println("Your current value: " + nf.format(userAccount));
                        }

                    } else {
                        System.out.println("***** Result: " + sum + " == > Over");
                        if (betUnderOrOver == 1) {
                            System.out.println("***** You are win");
                            userAccount += betting;
                            System.out.println("Your current value: " + nf.format(userAccount));
                        } else {
                            System.out.println("***** Your have been loosen");
                            userAccount -= betting;
                            System.out.println("Your current value: " + nf.format(userAccount));
                        }
                    }
                }
            }while (choice == 1);
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}