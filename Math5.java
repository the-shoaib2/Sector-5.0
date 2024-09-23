import java.util.*;

public class Math5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }
}
