
// This is a simple Java program that demonstrates the use of threads.
class  Test_Threads extends Thread {
  
  
    public void run() {
        System.out.println("Thread is running");
    }

        public static void main(String[] args) 
        {

            Test_Threads t1 = new Test_Threads();
            t1.start();
            System.out.println("Thread is started");    

        }

}
