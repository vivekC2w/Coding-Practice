package Sorting_Algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 35, 24, 12, 39, 2, 0, 55, 154, -2 };

        printArray(arr, "Before Sorting: ");
        insertionSortIterative(arr);
        // insertionSortRecursive(arr, arr.length);
        printArray(arr, "After Sorting: ");
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSortIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}

/*
 * Before Sorting: 35 24 12 39 2 0 55 154 -2
 * After Sorting: -2 0 2 12 24 35 39 55 154
 */