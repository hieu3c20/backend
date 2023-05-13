package j11_arrays.randomNumber;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[100][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = printRandomNumber();
            }
        }

        print2DArray(array);
    }

    public static int printRandomNumber() {
        double randomNumber = Math.random() * 100;
        return (int) randomNumber;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
