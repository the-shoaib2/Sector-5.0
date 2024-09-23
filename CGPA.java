import java.util.*;

public class CGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many student's CGPAs you want to insert?: ");
        int n = scanner.nextInt();

        float[] cgpas = new float[n];

        System.out.println("Enter the CGPA:");
        for (int i = 0; i < n; i++) {
            cgpas[i] = scanner.nextFloat();
        }

        float max = cgpas[0], min = cgpas[0];
        for (float cgpa : cgpas) {
            if (cgpa > max) max = cgpa;
            if (cgpa < min) min = cgpa;
        }

        System.out.println("Largest CGPA: " + max);
        System.out.println("Smallest CGPA: " + min);
    }
}
