// public class FUNCTION {

//     // Method to calculate the sum of two numbers
//     public int calculateSum(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         FUNCTION obj = new FUNCTION();
//         int a = 5;
//         int b = 10;
//         int result = obj.calculateSum(a,b); 
//         System.out.println("The sum is: " + result);
//     }
// }





public class FUNCTION {

    // Method to calculate the sum of two numbers
    public int calculateSum(int a, int b) {
        return a + b;
    }

    // Overloaded method to calculate the sum of three numbers
    public int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        FUNCTION obj = new FUNCTION();
        
        // Call the method with two arguments
        int result1 = obj.calculateSum(5, 10);
        System.out.println("The sum of two numbers is: " + result1);
        
        // Call the overloaded method with three arguments
        int result2 = obj.calculateSum(5, 10, 15);
        System.out.println("The sum of three numbers is: " + result2);
    }
}
