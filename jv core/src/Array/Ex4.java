package Array;
/*
4. Write a Java program to calculate the average value of array elements.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] number = new int[]{10, 20, 30, 40, 50, 60};
        int sum = 0;
        for(int i =0; i < number.length; i++) {
            sum += number[i];

        }
        double average = sum / number.length;

        System.out.println("Average value of the array element is: " + average);
    }
}
