package j25_multiThreading.workbook11_6.Main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static String[] files = new String[]{"j25_multiThreading/workbook11_6/data/sales1.csv", "j25_multiThreading/workbook11_6/data/sales2.csv", "j25_multiThreading/workbook11_6/data/sales3.csv"};
    static AtomicInteger sampleSize = new AtomicInteger(0);
    static AtomicInteger quantitySold = new AtomicInteger(0);

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (String string : files) {
            executor.submit(() -> increment(string, latch));
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter your name to access the global superstore data: ");
        String name = scan.nextLine();
        System.out.println("\nthank you " + name + ".\n");
        scan.close();

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
            System.out.println("sample size: " + sampleSize);
            System.out.println("quantity sold: " + quantitySold);
        }
    }

    public static void increment(String file, CountDownLatch latch) {
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(file).toURI());
            Files.lines(path)
                    .skip(1)
                    .mapToInt((line) -> Integer.parseInt(line.split(",")[2]))
                    .forEach((quantity) -> {
                        sampleSize.addAndGet(1);
                        quantitySold.addAndGet(quantity);
                    });
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        latch.countDown();
    }
}
