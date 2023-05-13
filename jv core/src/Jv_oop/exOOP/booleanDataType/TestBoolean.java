package Jv_oop.exOOP.booleanDataType;

public class TestBoolean {
    int number;
    int day;

    public TestBoolean(int number, int day) {
        this.number = number;
        this.day = day;
    }

    public boolean testBoolean() {
        if (this.day == this.number) {
            return true;
        }else {
            return false;
        }
    }
}
