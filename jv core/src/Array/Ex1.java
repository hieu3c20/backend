package Array;

import java.util.Arrays;

/*
1. Write a Java program to sort a numeric array and a string array.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458};
        String[] my_array2 = {"Java", "Python", "PHP"};

        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

        System.out.println("Original string array : "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
