package Jv_Excercise.AdditionalExercise.Jv_coreExercise;

public class SwitchStatement {
    public static void main(String[] args) {
        int expression = 1;

        switch (expression) {
            case 1:
                System.out.println("Small Size");
                break;
            case 2:
                System.out.println("large size");
                break;
            default:
                System.out.println(expression + "\bunknown size");
        }
    }
}
