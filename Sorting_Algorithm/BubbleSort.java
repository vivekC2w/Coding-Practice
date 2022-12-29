package Sorting_Algorithm;

public class BubbleSort {

    // Time Complexity => O(n^2)
    // Space Complexity => O(1)
    public static void main(String[] args) {
        int[] arr = { 35, 24, 12, 39, 2, 0, 55, 154, -2 };

        printArray(arr, "Before Sorting: ");
        // bubbleSortIterative(arr);
        bubbleSortRecursive(arr, arr.length);
        printArray(arr, "After Sorting: ");
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSortIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortRecursive(int[] arr, int N) {
        // base condition
        if (N == 0)
            return;

        for (int j = 0; j < N - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        bubbleSortRecursive(arr, N - 1);
    }
}

/*
 * Before Sorting: 35 24 12 39 2 0 55 154 -2
 * After Sorting: -2 0 2 12 24 35 39 55 154
 */