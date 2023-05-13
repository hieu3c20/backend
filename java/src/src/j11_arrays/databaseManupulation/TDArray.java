package j11_arrays.databaseManupulation;

import java.util.Scanner;

public class TDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int numberOfFigure = scanner.nextInt();

        String[][] database = new String[numberOfFigure][3];

        scanner.nextLine();

        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tfigure: " + (i + 1));
            System.out.print("\t -name: ");
            database[i][0] = scanner.nextLine();
            System.out.print("\t -date of birth: ");
            database[i][1] = scanner.nextLine();
            System.out.print("\t -occupation: ");
            database[i][2] = scanner.nextLine();
            System.out.print("\n");
        }

        System.out.println("these are values that you stored: ");
        print2DArray(database);

        System.out.println("who do you want to search information on (enter name) ? ");

        String name = scanner.nextLine();

        for (int i =0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\t-name: " + database[i][0]);
                System.out.println("\t-date of birth: " + database[i][1]);
                System.out.println("\t-ocupation: " + database[i][2]);
            }
        }

        scanner.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
