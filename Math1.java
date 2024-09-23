
public class Math1 {
    public static double absolute(double number) {
        return Math.abs(number);
    }

    public static double floor(double number) {
        return Math.floor(number);
    }

    public static double ceil(double number) {
        return Math.ceil(number);
    }

    public static long round(double number) {
        return Math.round(number);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double logarithm(double number) {
        return Math.log(number);
    }

    public static void main(String[] args) {
        System.out.println("Absolute: " + absolute(-5.5));
        System.out.println("Floor: " + floor(5.7));
        System.out.println("Ceil: " + ceil(5.2));
        System.out.println("Round: " + round(5.5));
        System.out.println("Square Root: " + squareRoot(25));
        System.out.println("Power: " + power(2, 3));
        System.out.println("Logarithm: " + logarithm(10));
    }
}
