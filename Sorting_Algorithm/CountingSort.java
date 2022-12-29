package Sorting_Algorithm;

public class CountingSort {
    // TC => O(n)
    // SC=> O(n)
    public static void main(String[] args) {
        int[] arrCountingSort = { 4, 2, 6, 2, 1, 3, 7, 3 };
        // countingSort(arrCountingSort);
        countingSortAnotherMethod(arrCountingSort);
    }

    public static void printArray(int[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int[] arr) {

        // assume the values inside array to be 0 to 9

        int[] freqArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            freqArr[item] += 1;
        }
        printArray(freqArr, "Frequency Array: ");

        int[] ansArr = new int[arr.length];
        int iter = 0;

        for (int i = 0; i < freqArr.length; i++) {
            int value = freqArr[i];

            while (value-- != 0) {
                ansArr[iter] = i;
                iter++;
            }
        }

        printArray(ansArr, "Answer Array: ");
    }

    public static void countingSortAnotherMethod(int[] arr) {
        // TC => O(n)
        // SC => O(n) to be precise it is O(range)

        int[] freqArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];
            freqArr[item] += 1;
        }
        // prefix sum
        int[] prefixSumArr = prefixSumArray(freqArr);

        printArray(prefixSumArr, "PrefixSumArray:");

        int[] ansArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int index = prefixSumArr[val] - 1;
            ansArr[index] = val;
            prefixSumArr[val]--;
        }

        printArray(ansArr, "AnsArray:");
    }

    public static int[] prefixSumArray(int[] arr) {
        int[] prefixSumArr = new int[arr.length];
        prefixSumArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
        }

        return prefixSumArr;
    }
}
