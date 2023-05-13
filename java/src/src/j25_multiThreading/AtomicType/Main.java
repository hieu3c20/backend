package j25_multiThreading.AtomicType;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(100);
        int numThread = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThread);
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> task(latch));
        }

        /**
         *
         executor.submit(() -> task(lock, latch));
         executor.submit(() -> task(lock, latch));
         executor.submit(() -> task(lock, latch));
         executor.submit(() -> task(lock, latch));
         Thread thread1 = new Thread(() -> task(lock, latch));
         Thread thread2 = new Thread(() -> task(lock, latch));
         Thread thread3 = new Thread(() -> task(lock, latch));
         Thread thread4 = new Thread(() -> task(lock, latch));

         thread1.start();
         thread2.start();
         thread3.start();
         thread4.start();
         */
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(counter);
    }

    public static void task(CountDownLatch latch) {
        for (int i = 0; i < 10000; i++) {
            counter.addAndGet(1);
        }
        latch.countDown();
    }
}
