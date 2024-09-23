import java.util.*;

public class LinierSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total Case : "); 
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Size must be positive.");
                continue;
            }
            int[] arr = new int[size];

            System.out.println("Enter elements of array:");
            for (int j = 0; j < size; j++) {
                arr[j] = scanner.nextInt();
            }

            System.out.print("Enter the target value to search: ");
            int target = scanner.nextInt();
            linearSearch(arr, target);
        }

        scanner.close();
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }
}
