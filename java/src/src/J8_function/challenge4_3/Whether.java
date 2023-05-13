package J8_function.challenge4_3;

public class Whether {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;

        printTemparature(noon);
        printTemparature(evening);
        printTemparature(midnight);
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void printTemparature(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelcius(fahrenheit) + "\n");
    }
}
