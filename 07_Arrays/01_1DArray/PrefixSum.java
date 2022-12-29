/*
 * Question: Prefix sum
 * Input: {1, 2, 3, 4, 5, 6}
 * Output: {1, 3, 6, 10, 15, 21}
 * Explanation: will take sum of arr[i] + arr[i-1];
 */

public class PrefixSum {
    public static void main(String[] args) {

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
