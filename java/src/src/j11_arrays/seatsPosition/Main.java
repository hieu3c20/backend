package j11_arrays.seatsPosition;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] seats = {"hieu", "hai", "lam", "cuong"};

        System.out.println("seat pool of your exam: " + Arrays.toString(seats));
        System.out.println("Its time to take your 5th years. Please take your seat.\n");

        for (int i=0; i< seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);
        }
    }
}
