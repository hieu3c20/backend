package j18_exceptionHandlingAndDebugging.Ex10Debug;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {3, 9, 7},
                {0, 2, 5},
        };

        int[][] transposeMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        printArray(matrix);
        printArray(transposeMatrix);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
