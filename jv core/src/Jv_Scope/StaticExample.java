package Jv_Scope;

public class StaticExample {
    public static int sum (int a, int b) {
        return a + b;
    }
}
class Test {
    public static void main(String[] args) {
        int n = 3, m = 6;
        int s = StaticExample.sum(n, m);
        System.out.println("Sum is: " + s);
    }
}