package Jv_Collection.Jv_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Jv_Stack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stackChain = new Stack<>();
        System.out.print("Enter a string: ");
        String s = scan.nextLine();
        for(int i = 0; i < s.length(); i++) {
            stackChain.push(s.charAt(i) + "");
        }
        System.out.println("Reverse chain: ");
        for(int i = 0; i < s.length(); i++) {
            System.out.print(stackChain.pop());
        }
        System.out.println();

    Stack<String> remainingNumber = new Stack<>();
    System.out.println("Enter a positive integer from keyboard: ");
    int x = scan.nextInt();
    while(x > 0) {
        int remain = x % 2;
        System.out.println(remain);
        remainingNumber.push(remain+"");
        x = x/2;
        System.out.println("Binary number is: ");
        int n = remainingNumber.size();
        for(int i = 0; i < n; i++) {
            System.out.println(remainingNumber.pop());
    }
}
    }

}
