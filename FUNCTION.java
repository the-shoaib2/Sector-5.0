public class FUNCTION {

    // Method to calculate the sum of two numbers
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        FUNCTION obj = new FUNCTION();
        int a = 5;
        int b = 10;
        int result = obj.calculateSum(a,b); 
        System.out.println("The sum is: " + result);
    }
}
