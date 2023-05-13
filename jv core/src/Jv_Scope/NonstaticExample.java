package Jv_Scope;

public class NonstaticExample {
    int sum(int a, int b) {
        return a + b;
    }
}
class Test2 {
    public static void main2(String[] args) {
        int n = 3, m = 6;
        NonstaticExample ne = new NonstaticExample();
        int s = ne.sum(n, m);
        System.out.println("Sum is: " + s);
    }
}
