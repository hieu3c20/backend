package Jv_Collection.Jv_MultiDimensionalArray;

import java.util.InputMismatchException;
import java.util.Scanner;

// A sparse matrix that have element = 0 > element not equal 0
public class Jv_CheckSparseMatrix {
    public static void main(String[] args) {
        int line, column;
        int elementEqualZero = 0;
        int elementNotEqualsZero = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number of line of matrix: ");
            line = scan.nextInt();
            System.out.print("Enter number of column of matrix: ");
            column = scan.nextInt();
        } while (line < 1 || column < 1 );
        int A[][] = new int[line][column];

        System.out.println("Enter element for matrix A: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scan.nextInt();
            }
        }

//      print matrix A
        System.out.println("Matrix A: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }


//      Check is sparse or not
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
//          Check if element at i, j = 0, increase variable elementEqualZero up 1
//          Otherwise, increase elementNotEqualZero up 1
                if (A[i][j] == 0) {
                    elementEqualZero++;
                } else {
                    elementNotEqualsZero++;
                }
            }
        }

        if (elementEqualZero > elementNotEqualsZero) {
            System.out.println("This is sparse matrix !");
        } else {
            System.out.println("This is not a sparse matrix !");
        }
    }
}
