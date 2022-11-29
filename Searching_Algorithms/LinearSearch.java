package Searching_Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 3, 4, 5, 58, 36, 46 };
        int target = 4;
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
