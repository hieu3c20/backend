package Jv_Excercise.SortDescending;

import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        ;
        try {
            int num = 0, i = 0, j = 0, temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of element of array: ");
            num = sc.nextInt();

            int array[] = new int[num];
            System.out.println("Enter number of array: ");

                for (i = 0; i < num; i++)
                    array[i] = sc.nextInt();

            for (i = 0; i < (num - 1); i++) {
                for (j = 0; i < num - i -1; j++) {
                    if (array[j] > array[j +1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Result after sort ascending is: ");
            for (i = 0; i < num; i++) {
                System.out.println(array[i] + "\t");
            }
            System.out.println();
            System.out.println("========finish========");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
