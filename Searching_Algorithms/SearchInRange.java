package Searching_Algorithms;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 18, 12, -7, 3, 14, 28 };
        int target = -7;
        System.out.println(searchInRange(nums, target, 1, 4));

    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}
