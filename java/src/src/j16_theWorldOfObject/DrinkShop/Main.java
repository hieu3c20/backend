package j16_theWorldOfObject.DrinkShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("   WELCOME TO JAVA DRINK    ");
        System.out.println("****************************");

        Item[][] items = new Item[3][3];

        items[0][0] = new Item("Pepsi", 1.99, 5);
        items[0][1] = new Item("Fresca", 1.49, 3);
        items[0][2] = new Item("Brisk", 2.99, 5);
        items[1][0] = new Item("Fanta", 1.99, 2);
        items[1][1] = new Item("Braq's", 1.49, 3);
        items[1][2] = new Item("A & W", 1.29, 3);
        items[2][0] = new Item("Crush", 1.29, 3);
        items[2][1] = new Item("C-Cola", 1.29, 3);
        items[2][2] = new Item("Berry", 1.29, 3);

        Machine machine = new Machine(items);

        // test Item class: create instance of Item class
        Item item1 = new Item("Pepsi", 3.99, 3);
        System.out.println("\nAdd an instance to a class\n" + item1);

        // test Machine class: test getter and setter
        Item item2 = machine.getItem(2, 1);
        item2.setPrice(2.56);
        System.out.println("\nTest getter setter Machine class\n" + machine.getItem(1, 1));

        // test function dispense
        machine.dispense(0, 0);
        machine.dispense(0, 0);
        System.out.println("\nTest dispense\n" + machine.getItem(0, 0));

        // test function toString
        System.out.println(machine);

        while (true) {
            System.out.print("pick a row: ");
            int row = scanner.nextInt();
            System.out.print("pick a spot in the row: ");
            int spot = scanner.nextInt();

            boolean dispensed = machine.dispense(row, spot);
            System.out.println("\n" + machine);
            if (dispensed == true) {
                System.out.print("Enjoy your drink! Press 1 to purchase another: ");
            } else {
                System.out.print("\nSorry, we are out of this item . Press 1 to purchase another: ");
            }

            if (scanner.nextInt() != 1) {
                break;
            }
        }
    }
}
