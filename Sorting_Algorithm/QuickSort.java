package Sorting_Algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 35, 24, 12, 39, 2, 0, 55, 154, -2 };

        printArray(arr, "Before Sorting: ");
        QuickSort(arr, 0, arr.length - 1);
        printArray(arr, "After Sorting: ");
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int[] arr, int low, int high) {

        // base case
        if (low > high) {
            return;
        }

        // faith and work
        int partition = partition(arr, low, high);

        QuickSort(arr, low, partition - 1);
        QuickSort(arr, partition + 1, high);

    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
            }

        }

        int temp1 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp1;

        return i + 1;

    }
}
