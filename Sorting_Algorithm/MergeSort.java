package Sorting_Algorithm;

//Time Complexity => O(nlogn)
//Space Complexity => O()

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 35, 24, 12, 39, 2, 0, 55, 154, -2 };

        printArray(arr, "Before Sorting: ");
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr, "After Sorting: ");
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int left, int right) {
        // base condition
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        mergeArray(arr, left, mid, right);
    }

    public static void mergeArray(int[] arr, int left, int mid, int right) {
        int p1 = left;
        int p2 = mid + 1;
        int[] ansArray = new int[(right - left) + 1];
        int i = 0;
        while (p1 <= mid && p2 <= right) {
            if (arr[p1] < arr[p2]) {
                ansArray[i] = arr[p1];
                i++;
                p1++;
            } else {
                ansArray[i] = arr[p2];
                i++;
                p2++;
            }
        }

        while (p1 <= mid) {
            ansArray[i] = arr[p1];
            i++;
            p1++;
        }

        while (p2 <= right) {
            ansArray[i] = arr[p2];
            i++;
            p2++;
        }

        for (int j = left; j <= right; j++) {
            arr[j] = ansArray[j - left];
        }
    }
}
