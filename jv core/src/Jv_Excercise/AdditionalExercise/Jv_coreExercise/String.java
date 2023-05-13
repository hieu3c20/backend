package Jv_Excercise.AdditionalExercise.Jv_coreExercise;

import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String s = sc.nextLine();
//        System.out.println("=========");
//
//        System.out.println(s.length());
//        int length = s.length();
//
//        for (int i = 0; i < length; i++) {
//            System.out.println("POsition: " + i + " is: " + s.charAt(i));
//        }
//
//        char[] arrayChar = new char[100];
//        s.getChars(0, 4, arrayChar, 0);
//        for (int i = 0; i < arrayChar.length; i++) {
//            System.out.println("Value of array at " + i + " is: " + arrayChar[i]);
//        }
//
//        byte[] arrayByte = s.getBytes();
//        for (byte b : arrayByte) {
//            System.out.println(b);
//        }

//        equal function
        java.lang.String s1 = "Ho Van Hieu";
        java.lang.String s2 = "ho van hieu";

        if (s1.equalsIgnoreCase(s2) == true) {
            System.out.println("two string is equal");
        } else {
            System.out.println("two string is not equal");
        }
//      equalsIgnoreCase function
        if (s1.equals(s2) == true ) {
            System.out.println("Two string is equal");
        }else {
            System.out.println("two string is not equal");
        }
//      compareTo function
        System.out.println("String s1 compare to String s2: "  + s1.compareTo(s2));
//      compareToIgnoreCase function
        System.out.println("String s1 compare to String s2: " + s1.compareToIgnoreCase(s2));

//       regionMatches function
        System.out.println(s1.regionMatches(0, s2, 0, 6));
        System.out.println();
    }

//    startWith function

}
