package j16_theWorldOfObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] parts = {"tires", "keys"};
        Car[] cars = new Car[]{
                new Car("Hieu", 5000, 2021, "red", parts),
                new Car("Hai", 2000, 2020, "red", parts),
                new Car("Lam", 4000, 2022, "red", parts),
                new Car("Hoang", 8000, 2022, "red", parts),
                new Car("Dat", 6000, 2022, "red", parts),
                new Car("Tung", 8000, 2022, "red", parts),
        };

        Dealership dealership = new Dealership(cars);

        for (int i = 0; i < cars.length; i++) {
            dealership.setCars(cars[i], i);
        }

        // create instance based on constructor of attribute
        Car hieu = new Car("Hieu", 5000, 2021, "red", parts);
        // create instance based on constructor of object
        Car truong = new Car(hieu);
        truong.setMake("Truong");
        truong.setParts(new String[]{"tires", "filter"});

        Car newCar = dealership.getCar(1);
        newCar.setMake("Hi! i just have created based on index 1 (object hai) and no name");
        System.out.println("get car\n" + newCar);

        System.out.println("sell car:");
        dealership.sell(2);

        System.out.println("\nsearch car: " + dealership.search("Hieu", 5500));

        System.out.println("\nprint stock of car\n" + dealership);

        // an application have interact with user
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n********** JAVA DEALERSHIP *********");
        System.out.println("Welcome to my garage! Enter type of car you are looking for: ");
        String make = scanner.nextLine();
        System.out.println("Enter your budget: ");
        int budget = scanner.nextInt();
        System.out.println("********** looking **********");
        int index = dealership.search(make, budget);

        switch (index) {
            case 404:
                System.out.println("feel free to browse through our collection of cars.\n");
                System.out.println(dealership);
                break;
            default:
                scanner.nextLine();
                String decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("yes")) {
                    dealership.sell(index);
                }
        }
        scanner.close();
    }
}
