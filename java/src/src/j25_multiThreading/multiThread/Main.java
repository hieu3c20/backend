package j25_multiThreading.multiThread;

public class Main {
    /**
     * public static class LongTask implements Runnable {
     *
     * @Override public void run() {
     * longTask();
     * }
     * }
     */

    public static void main(String[] args) {
        /**
         *
         Runnable runnable = new Runnable() {
        @Override public void run() {
        longTask();
        }
        };
         */
        Thread thread = new Thread(() -> longTask());
        thread.start();

        System.out.println("oh no, a big error occurred in the main thread. let's interrupt the background thread");
//        thread.interrupt();
        System.out.println("the system work on main thread");
    }

    public static void longTask() {
        try {
            Thread.sleep(3000);
            System.out.println("done sleeping");
        } catch (InterruptedException e) {
            System.out.println("done sleeping");
        }

//        long t = System.currentTimeMillis();
//        long end = t + 3000;
//
//        while (true) {
//
//            if (System.currentTimeMillis() == end) {
//                System.out.println("Finish the long task");
//                break;
//            } else if (Thread.currentThread().isInterrupted()) {
//                System.out.println("this task has been interrupted prematurely");
//                break;
//            }
//        }
    }
}
