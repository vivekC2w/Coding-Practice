package Searching_Algorithms;

public class LinearSearch {

    // Time Complexity => O(N)
    // Space Complexity => O(1)
    public static void main(String[] args) {
        int[] nums = { 1, 2, 8, 16, 25, 8, 9 };
        int target = 25;
        int index = linearSearch(nums, target);
        System.out.println(index);
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
