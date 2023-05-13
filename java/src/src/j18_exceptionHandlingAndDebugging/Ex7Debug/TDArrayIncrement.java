package j18_exceptionHandlingAndDebugging.Ex7Debug;

public class TDArrayIncrement {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = i;
            }
        }
        printArray(matrix);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
