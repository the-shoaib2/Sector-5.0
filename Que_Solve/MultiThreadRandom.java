package Que_Solve;

import java.util.*;

//Spring-2025 ( 5.c)
class implementing implements Runnable { // Interface Use thats why we use implements

    // 1. pirvate ;
    private int n, min, max;

    // 2. constructor
    public implementing(int n, int min, int max) {
        this.n = n;
        this.min = min;
        this.max = max;
    }

    // 3. run method override
    @Override
    public void run() {
        Random r = new Random();
        System.out.println("Thread " + Thread.currentThread().getName() + " getting " + n + " random numbers between "
                + min + " and " + max);
        for (int i = 0; i < n; i++) {
            int randomNum = r.nextInt(max - min + 1) + min;
            System.out.print(randomNum + " ");
        }

        System.out.println("\nThread " + Thread.currentThread().getName() + " finished.");
    }
}

public class MultiThreadRandom {
    public static void main(String[] args) {
        // 1. create thread
        Thread t1 = new Thread(new implementing(10, 1, 100), "Thread 1");
        Thread t2 = new Thread(new implementing(5, 101, 200), "Thread 2");
        Thread t3 = new Thread(new implementing(8, 201, 300), "Thread 3");

        // 2. start thread
        t1.start();
        t2.start();
        t3.start();

        // // 3. join thread
        // try {
        //     t1.join();
        //     t2.join();
        //     t3.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();

        // }
    }

}
