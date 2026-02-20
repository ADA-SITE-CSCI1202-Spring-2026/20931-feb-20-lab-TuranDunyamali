import java.util.*;

public class MinMaxArray {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr)
            if (num < min) min = num;
        return min;
}

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            if (num > max) max = num;
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        int[] result = findMinMax(arr);
        System.out.println("Min = " + result[0]);
        System.out.println("Max = " + result[1]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();

        System.out.println("Min = " + findMin(arr2));
        System.out.println("Max = " + findMax(arr2));
        }
    }
}