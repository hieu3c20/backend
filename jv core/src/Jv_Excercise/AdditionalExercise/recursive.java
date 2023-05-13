package Jv_Excercise.AdditionalExercise;

public class recursive {
    public static int recursive(int x, int y) {
        if(x == 0) {
            return (y +1);
        } else {
            if (y == 0) {
                return recursive(x -1, 1);
            } else {
                return recursive(x -1, recursive(x, y-1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("recursive(3,2) ="+ recursive(3,2));
    }
}
