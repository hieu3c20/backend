package j25_multiThreading.joinningThread;

import java.util.concurrent.*;

public class Main {
    static double[] targets = new double[]{0.5, 0.8, 0.3};
    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {
        int numThread = Runtime.getRuntime().availableProcessors();
        System.out.println(numThread);

        // RUNNABLE OVERRIDE RUN METHOD: VOID
        // Runnable runnable = () -> result = generateNumber();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // FUTURE task: interface. THE RESULT RETURN FORM CALLABLE WILL BE STORE IN FUTURE
        Future<Double> future = executor.submit(() -> generateNumber(0));
        Future<Double> future2 = executor.submit(() -> generateNumber(1));
        Future<Double> future3 = executor.submit(() -> generateNumber(2));

        /**
         * USE THREAD POOL INSTEAD OF NORMAL THREAD
         *
         Callable<Double> callable = () -> generateNumber(0);
         FutureTask<Double> future = new FutureTask<>(callable);
         Thread thread = new Thread(future);

         Callable<Double> callable2 = () -> generateNumber(0);
         FutureTask<Double> future2 = new FutureTask<>(callable2);
         Thread thread2 = new Thread(future2);

         Callable<Double> callable3 = () -> generateNumber(0);
         FutureTask<Double> future3 = new FutureTask<>(callable3);
         Thread thread3 = new Thread(future3);

         thread.start();
         thread2.start();
         thread3.start();
         */

        // double precision = difference(result);

        /**
         * USER INTERACT WITH THE SYSTEM AND THREAD STILL IMPLICITLY RUNNING
         *
         Scanner scan = new Scanner(System.in);
         System.out.println("please enter a name to generate a number: ");
         scan.nextLine();
         scan.close();
         */
        try {
            //  thread.join() => THIS ONE USE RUNNABLE INTERFACE
            //  thread.join();
            //  future.get() => THIS ONE USE CALLABLE INTERFACE
            //  result = future.get();

            future.get();
            future2.get();
            future3.get();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {

            // FUTURE GET METHOD THROW AN UNCHECK EXCEPTION
            System.out.println(e.getMessage());
        }
        System.out.println("finished running background operations");
        //  System.out.println("The computer returned a value of: " + result);
        //  System.out.println("The value was generated to a precision of : " + precision);
    }

    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);
        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }
        return number;
    }

    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }
}
