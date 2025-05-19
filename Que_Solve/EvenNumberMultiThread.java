package Que_Solve;


class ThreadEven extends Thread {
    // 1. private
    int start;
    int end;
    int[] Arr;
    int index;

    // 2. constructor
    ThreadEven(int start, int end, int[] Arr, int index) {
        this.start = start;
        this.end = end;
        this.Arr = Arr;
        this.index = index;
    }

    @Override
    // 3. run method override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                Arr[index] = i;
                index++;
            }
        }
    }
}

public class EvenNumberMultiThread {
    public static void main(String[] args) {
        int[] evenNumbers = new int[24]; 

        ThreadEven t1 = new ThreadEven(20, 30, evenNumbers, 0);
        ThreadEven t2 = new ThreadEven(40, 50, evenNumbers, 6);
        ThreadEven t3 = new ThreadEven(60, 70, evenNumbers, 12);
        ThreadEven t4 = new ThreadEven(80, 90, evenNumbers, 18);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // Print the final array
        System.out.println("Even numbers added by threads:");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
