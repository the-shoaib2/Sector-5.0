
// import java.util.Scanner;
import java.util.*;

public class Input_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Numbers you want to insert? ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + "array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int num : array) {
            System.out.print("\t"+ num );
        }

        scanner.close();
    }
}
