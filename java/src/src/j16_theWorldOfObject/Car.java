package j16_theWorldOfObject;

import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        // misunderstanding: why this key word is not used for the parameter
        // trap 1: setting an array variable equal to another (both variables share a reference to the same array)
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // trap 2: setting an object variable equal to another (both variable share a reference to the same object)
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        // trap 3: getter returns an array directly
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("you bought the beautiful car in " + this.year + "-" + this.make + " for " + this.price + ".");
        System.out.println("please drive your car to the nearest exit!");
    }

    public String toString() {
        return "owner possession information:\nmake (driver): " + this.make + ".\n" +
                "price: " + this.price + ".\n" +
                "year: " + this.year + ".\n" +
                "color: " + this.color + ".\n" +
                "parts: " + Arrays.toString(this.parts) + "\n";
    }
}
