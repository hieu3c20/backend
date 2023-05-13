package Jv_Collection.Jv_MultiDimensionalArray;

import java.util.Scanner;

public class Jv_EnterAndPrintArray {

    public static void main(String[] args) {
        int line, column;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of line of array: ");
        line = scan.nextInt();
        System.out.print("Enter the number of column of array: ");
        column = scan.nextInt();
        int[][] array = new int[line][column];

//      in order to enter value for array, we use 2 for loop, outside loop
//      run from i to line - 1, inside loop will run j from 0 to column - 1
//      each time will enter element at position of i, j
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter n th element [" + i + ", " + j + "]: ");
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array just entered: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
