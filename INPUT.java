// import java.util.Scanner;
import java.util.*;

public class INPUT {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Read a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Read a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Read a long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();

        // Read a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Read a string (single word)
        System.out.print("Enter a single word string: ");
        String singleWordString = scanner.next();

        // Read a string (entire line)
        scanner.nextLine(); // Clear the buffer before reading the line
        System.out.print("Enter a full line of text: ");
        String fullLineString = scanner.nextLine();

        // Output the values entered
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Single Word String: " + singleWordString);
        System.out.println("Full Line String: " + fullLineString);

        // Close the scanner
        scanner.close();
    }
}
