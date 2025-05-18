import java.util.*;

class Threads extends Thread {

    private final String threadName;

    public Threads(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        Random random = new Random();

        System.out.println("Thread " + threadName + " started.");

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(100);
            if (n % 3 == 0 || n % 7 == 0) {
                System.out.println("Thread " + threadName + " generated number: " + n);
            }

        }
        System.out.println("Thread " + threadName + " finished.");
    }

    public class ThreadRandom {
        public static void main(String[] args) {
            Threads t1 = new Threads("Thread 1");
            Threads t2 = new Threads("Thread 2");
            Threads t3 = new Threads("Thread 3");

            t1.start();
            t2.start();
            t3.start();

            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
