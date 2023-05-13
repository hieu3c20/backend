package j5_variable_chatbotSimple;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name ?");
        String name = scanner.nextLine();
        System.out.println("\nHi " + name + "!, I'm Javabot. Where are you from ?");
        String home = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at " + home + "!, i'm from a place called oracle");
        System.out.println("how old are you ?");
        int age = scanner.nextInt();

        System.out.println("\nso you're " + age + ", cool! i'm 400 years old.");
        System.out.println("this mean i'm " + (400 / age) + " times older than you");
        System.out.println("enough about me. What's your favourite language? (just dont say Python)");
        scanner.nextLine();

        String language = scanner.nextLine();
        System.out.println("\n" + language + " that's great! nice to chatting with you " + name + ". I have to log off now. See ya!");
        scanner.nextLine();
        System.out.println("learn the next part");

    }
}
