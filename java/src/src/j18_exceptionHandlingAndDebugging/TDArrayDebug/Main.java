package j18_exceptionHandlingAndDebugging.TDArrayDebug;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {8, 6, 4},
                {7, 9, 7},
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i) {
                    matrix[i][j] = 0;
                }
            }
        }
        printArray(matrix);
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
