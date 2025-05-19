package Que_Solve;

public class CheckSequence {

    public static boolean  cheakSequence(int a, int b, int c) {

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;
        return (min + mid == max) || (min + max == mid) || (mid + max == min);
       
    }




    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDecreasing = false;
            } else if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
            }
        }

        if (isIncreasing) {
            System.out.println("The array is in increasing order.");
        } else if (isDecreasing) {
            System.out.println("The array is in decreasing order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
    
}
