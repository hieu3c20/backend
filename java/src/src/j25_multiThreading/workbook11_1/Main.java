package j25_multiThreading.workbook11_1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    static final String SALES = "data/sales.csv";

    static double furniture = 0;
    static double technology = 0;
    static double supplies = 0;
    static double average = 0;

    public static void main(String[] args) {
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());

            int numberOfThread = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(numberOfThread);
            Future<Double> future2 = executor.submit(() -> average(path, "furniture"));
            Future<Double> future3 = executor.submit(() -> average(path, "technology"));
            Future<Double> future4 = executor.submit(() -> average(path, "office supplies"));
            Future<Double> future5 = executor.submit(() -> totalAverage(path));
            /**
             *
             FutureTask<Double> future2 = new FutureTask<>(() -> average(path, "furniture"));
             Thread thread2 = new Thread(future2);
             FutureTask<Double> future3 = new FutureTask<>(() -> average(path, "technology"));
             Thread thread3 = new Thread(future3);
             FutureTask<Double> future4 = new FutureTask<>(() -> average(path, "office supplies"));
             Thread thread4 = new Thread(future4);
             FutureTask<Double> future5 = new FutureTask<>(() -> totalAverage(path));
             Thread thread5 = new Thread(future5);
             */

            /**
             *
             Thread thread2 = new Thread(() -> furniture = average(path, "furniture"));
             Thread thread3 = new Thread(() -> technology = average(path, "technology"));
             Thread thread4 = new Thread(() -> supplies = average(path, "office supplies"));
             Thread thread5 = new Thread(() -> average = totalAverage(path));
             */

            /*
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
             */

            /**
             *
             */
            Scanner scan = new Scanner(System.in);
            System.out.print("please enter your name to access the global superstore dataset: ");
            String name = scan.nextLine();
            try {
                /**
                 *
                 thread2.join();
                 thread3.join();
                 thread4.join();
                 thread5.join();
                 */
                furniture = future2.get();
                technology = future3.get();
                supplies = future4.get();
                average = future5.get();

                System.out.println("\nthank you " + name + ". The average sales for Global Superstore");
                System.out.println("average furniture sales: " + furniture);
                System.out.println("average technology sales: " + technology);
                System.out.println("average office supplies sales: " + supplies);
                System.out.println("total average: " + average);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                executor.shutdown();
            }
            //System.out.println("access denied. we apologize for the inconvenience. have a good day.");
            scan.close();
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Double average(Path path, String category) {
        try {
            return Files.lines(path)
                    .skip(1).map((line) -> line.split(","))
                    .filter((values) -> values[0].equalsIgnoreCase(category))
                    .mapToDouble((values) -> Double.parseDouble(values[1]) * Double.valueOf(values[2]))
                    .average()
                    .getAsDouble();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static Double totalAverage(Path path) {
        try {
            return Files.lines(path)
                    .skip(1)
                    .map((line) -> line.split(","))
                    .mapToDouble((values) -> Double.parseDouble(values[1]) * Double.parseDouble(values[2]))
                    .average()
                    .getAsDouble();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
}
