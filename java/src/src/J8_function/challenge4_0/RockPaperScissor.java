package J8_function.challenge4_0;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("let's play rock paper or scissors.\n");
        System.out.println("When i say 'shoot', choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? write 'yes' if you are");
        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice = scan.next();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        } else {
            System.out.println("Darn, some other times...");
        }
        scan.close();
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        System.out.println(randomNumber);
        int integer = (int) randomNumber;
        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }
}
