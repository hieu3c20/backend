package Jv_Excercise.AdditionalExercise.Jv_coreExercise;

import java.util.Scanner;

public class GetPositiveInteger {
    public static int getPositiveInteger() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            try{
                input = sc.nextInt();
            } catch (Exception e) {
                System.out.println("input again: " + sc.nextLine());
            }
        } while (input <= 0);
            return input;
    }

    public static void main(String[] args) {
        int getInput = getPositiveInteger();
        System.out.println(getInput);
    }
}
