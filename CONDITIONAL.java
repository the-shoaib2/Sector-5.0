import java.util.*;

public class CONDITIONAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // 1. if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // 2. if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // // 3. if-else if-else statement
        // if (number < 0) {
        //     System.out.println("The number is negative.");
        // } else if (number == 0) {
        //     System.out.println("The number is zero.");
        // } else {
        //     System.out.println("The number is positive.");
        // }

        // // Taking a string input for switch case
        // System.out.print("Enter a day of the week (e.g., Monday): ");
        // scanner.nextLine();  // Clear the buffer
        // String day = scanner.nextLine();

        // // 4. switch statement
        // switch (day.toLowerCase()) {
        //     case "monday":
        //         System.out.println("Start of the work week!");
        //         break;
        //     case "friday":
        //         System.out.println("Almost weekend!");
        //         break;
        //     case "saturday":
        //     case "sunday":
        //         System.out.println("It's weekend!");
        //         break;
        //     default:
        //         System.out.println("Midweek day.");
        //         break;
        // }

        // // 5. Ternary operator
        // String result = (number > 0) ? "Positive number" : "Non-positive number";
        // System.out.println("Ternary result: " + result);

        // Close the scanner
        scanner.close();
    }
}






// public class TernaryOPE {
//     public static void main(String[] args) {
//         // Initialize three numbers directly
//         int num1 = 10;
//         int num2 = 25;
//         int num3 = 18;

//         // Finding the maximum of three numbers using nested ternary operators
//         int max = (num1 > num2) 
//                     ? (num1 > num3 ? num1 : num3) 
//                     : (num2 > num3 ? num2 : num3);

//         // Printing the maximum number
//         System.out.println("The maximum of the three numbers is: " + max);
//     }
// }
