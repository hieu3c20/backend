package pra.continuationClass.InputForm;

import java.io.Serializable;

public class Car implements Serializable {
    int gas;
    int speed;

    public Car(int gas, int speed) {
        this.gas = gas;
        this.speed = speed;
    }

    public void drive () {
        System.out.println("I am driving");
    }
}
