package j18_exceptionHandlingAndDebugging.Ex8Debug;

public class TicTacToeStupid {
    public static void main(String[] args) {
        char[][] array = {
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'},
        };

        for (int i = 0; i < array.length; i++) {
            array[2 - i][2 - i] = 'X';
            array[i][2 - i] = 'O';
        }
        printArray(array);
        System.out.println("O wins");
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
