package Jv_LookUp;

import java.util.Scanner;

//  Program check element x in array
public class LoopUp {
    public static void main(String[] args) {
        int counter, num, item, array[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element of array: ");
        num = sc.nextInt();
        array = new int[num];
        System.out.print("Enter value for each position: ");
        for (counter = 0; counter < num; counter++)
            array[counter] = sc.nextInt();

        System.out.print("Enter position of number need to check in array: ");
        item = sc.nextInt();
        for (counter = 0; counter < num; counter++) {
            if (array[counter] == item) {
                System.out.println("value" + item + " present in " + (counter + 1));
                break;
            }
        }
        if (counter == num) {
            System.out.println(item + "does not exist in array.");
            System.out.println("------------------------");
        }
    }
}