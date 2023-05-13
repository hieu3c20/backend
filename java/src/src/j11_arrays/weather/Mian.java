package j11_arrays.weather;

public class Mian {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit = celsiusToFahrenheit(celsius);

        printTemparature(celsius, "Celsius");
        printTemparature(fahrenheit, "Fahrenheit");
    }

    private static double[] celsiusToFahrenheit(double[] celsius) {
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < celsius.length; i++) {
            fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
        }
        return fahrenheit;
    }

    public static void printTemparature(double[] temp, String type) {
        System.out.println(type + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " ");
        }
        System.out.println("\n");
    }
}
