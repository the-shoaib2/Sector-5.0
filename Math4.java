import java.util.*;

public class Math4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        scanner.close();
        calculatePowersOfTwo(n);
    }

    public static void calculatePowersOfTwo(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + Math.pow(2, i));
        }
    }
}
