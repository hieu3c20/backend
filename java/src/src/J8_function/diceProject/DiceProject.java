package J8_function.diceProject;

import java.util.Scanner;

public class DiceProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three number between 1 and 6");

        int num1 = scan.nextInt();
        scan.nextLine();
        int num2 = scan.nextInt();
        scan.nextLine();
        int num3 = scan.nextInt();
        scan.nextLine();
        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;


        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("number cannot less than 1. shutting the game down");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("number cannot greater than 6, shutting the game down");
            System.exit(0);
        }


        System.out.println("dice sum = " + sumDiceRolls + ", number sum = " + sumOfNumbers);
        if (checkWin(sumDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry! you lose (number sum is only greater than dice sum is 3).\n" +
                    (sumOfNumbers - sumDiceRolls));
        }

        scan.close();
    }

    public static int rollDice() {
        double ramdomDice = Math.random() * 6 + 1;
        return (int) ramdomDice;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
        return (sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3);
    }
}
