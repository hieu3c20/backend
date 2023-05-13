package j16_theWorldOfObject;

public class Dealership {
    private Car[] cars;

    /*
    this constructor only initiate the number of car. I want to add car instance to car in the class
    public Dealership() {
        this.cars = new Car[3];
    }
    */

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCars(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        // trap 4: getter returns an object directly
        return new Car(this.cars[index]);
    }

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

    /*
    public String search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) && this.cars[i].getPrice() <= budget) {
                return "\nwe found one in spot " + i + "\n" + this.cars[i].toString() + "are you interested?";
            }
        }
        return "\nsorry, we could not find any car.";
    }
    */

    public int search(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget) {
                System.out.println("\nwe found a car in spot " + i + "\n" + cars[i].toString());
                System.out.println("if you are interested, type 'yes': ");
                return i;
            }
        }
        System.out.println("\nyour search did not match any results.\n");
        return 404;
    }


    public String toString() {
        String temp = "";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "parking spot: " + i + "\n";
            if (this.cars[i] == null) temp += "oops! this spot is empty";
            else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
    }
}
