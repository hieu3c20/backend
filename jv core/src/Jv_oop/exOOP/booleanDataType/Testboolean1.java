package Jv_oop.exOOP.booleanDataType;

public class Testboolean1 {
    public static void main(String[] args) {
        TestBoolean ts = new TestBoolean(2, 3);
        if(ts.testBoolean() == false) {
            System.out.println("cannot compare");
        } else {
            System.out.println("it is equal");
        }
    }

    private static class Ex_TestBoolean {
    }
}
