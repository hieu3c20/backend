package j11_arrays.grocer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ailse = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("Welcome to Java grocer");
        System.out.println("What can i help you you to find ?");

        String reply = scan.nextLine();

        for (int i=0; i< ailse.length; i++) {
            if (ailse[i].equals(reply)) {
                System.out.println("\nProvider: Of course. we have that in ailse: " + i + "\nI will take it for you");
            }
        }
    }
}
