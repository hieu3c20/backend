package j11_arrays.priceAndTax;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[price.length];

        for (int i=0; i<price.length; i++) {
            afterTax[i] = price[i]*1.12;
        }

        System.out.println("the original price is: " + (Arrays.toString(price)));
        System.out.println("the after tax price is: " + (Arrays.toString(afterTax)));
    }
}
