package Jv_Excercise.AdditionalExercise.Jv_coreExercise;

public class StringWithinAnotherString {
    public static void main(String[] args) {
//        count all spaces
        java.lang.String s1 = "Welcome to FIT";
        int pos = s1.indexOf("come");
        System.out.println(pos);
        System.out.println(s1.indexOf("greeting"));
        System.out.println(s1.indexOf("FIT"));
//        yellow: hint
        System.out.println(s1.indexOf("Wel"));
    }
}
