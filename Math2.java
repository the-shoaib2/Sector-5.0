public class Math2 {

    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        int max = findMax(a, b, c);
        int min = findMin(a, b, c);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}
