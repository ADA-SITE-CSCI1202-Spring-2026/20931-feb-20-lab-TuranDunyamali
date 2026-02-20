import java.util.Scanner;

public class MinMaxArray {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return new int[]{min, max};
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        if (args.length > 0) {

            int[] arr = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Array from command line:");
            printArray(arr);

            int[] result = findMinMax(arr);

            System.out.println("Min = " + result[0]);
            System.out.println("Max = " + result[1]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Array from scanner:");
        printArray(arr2);

        int[] result2 = findMinMax(arr2);

        System.out.println("Min = " + result2[0]);
        System.out.println("Max = " + result2[1]);
    }
}