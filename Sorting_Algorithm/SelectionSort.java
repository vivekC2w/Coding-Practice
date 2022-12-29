package Sorting_Algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 35, 24, 12, 39, 2, 0, 55, 154, -2 };

        printArray(arr, "Before Sorting: ");
        selectionSort(arr);
        printArray(arr, "After Sorting: ");
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) {
                    lowest = j;
                }
            }
            // swap lowest to i
            int temp = arr[lowest];
            arr[lowest] = arr[i];
            arr[i] = temp;
        }
    }
}
