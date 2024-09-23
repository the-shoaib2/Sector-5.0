import java.util.*;

public class Marge {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>();
        for (int num : arr1)
            mergedList.add(num);
        for (int num : arr2)
            mergedList.add(num);
        return mergedList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N1 = ");

        int N1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[N1];
        System.out.println("Enter" + N1 + "array elements");
        for (int i = 0; i < N1; i++) {
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("N1 = ");
        int N2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[N2];
        System.out.println("Enter"+ N2 +"array elements");
        for (int i = 0; i < N2; i++) {
            arr2[i] = Integer.parseInt(sc.nextLine());
        }

        int[] result = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
