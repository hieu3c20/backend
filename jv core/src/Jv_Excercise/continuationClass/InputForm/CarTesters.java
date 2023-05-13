package pra.continuationClass.InputForm;

import java.io.*;
import java.util.Scanner;

public class CarTesters {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        String path = "C:\\Users\\ASUS\\Documents\\Project 1\\src\\pra\\continuationClass\\text.txt";
        File data = new File(path);
        if (data.exists()) {
            System.out.println("There is a car");
            Object obj = deserialize(path);
            Car myCar = (Car) obj;
            myCar.drive();
        } else {
            System.out.println("How many gases ?");
            int gas = scan.nextInt();
            System.out.println("How fast it can run?");
            int speed = scan.nextInt();
            Car myCar = new Car(gas, speed);

            System.out.println("Successfully saved");
        }
    }

//    write
    public static void saveData(Object car, String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(car);
        oos.close();
    }

//    read
    public static Object deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis =  new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Object car = ois.readObject();
        ois.close();
        return car;
    }
}
