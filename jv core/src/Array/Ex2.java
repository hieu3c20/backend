package Array;
/*
2. Write a Java program to sum values of an array.
 */
public class Ex2 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
