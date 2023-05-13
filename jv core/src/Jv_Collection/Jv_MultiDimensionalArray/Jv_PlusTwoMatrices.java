package Jv_Collection.Jv_MultiDimensionalArray;

import java.util.Scanner;

public class Jv_PlusTwoMatrices {
    public static void main(String[] args) {
        int line;
        int column;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter the number of line of matrix: ");
            line = scan.nextInt();
            System.out.print("Enter the number of column of matrix: ");
            column = scan.nextInt();
        } while (line < 1 || column <1);
//      declare 2 matrices A and B with line and column
         int A[][] = new int[line][column];
         int B[][] = new int[line][column];
//       C is matrices that sum of A and B
         int C[][] = new int[line][column];

        System.out.println("Enter element for matrix A: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scan.nextInt();
            }
        }


        System.out.println("Enter element for matrix B: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("B[" + i + "," + j + "] = ");
                B[i][j] = scan.nextInt();
            }
        }

        System.out.println("Matrix A: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("Matrix B: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("\n");
        }
//      in order to calculate sum of the two matrices, use 2 for loop (run i from 0 to m and run j from 0 to n)
//      . After that, calculate sum of element at position of j,i equivalent
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
//      display matrix C
        System.out.println("Matrix of sum A and B: ");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
