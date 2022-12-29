package Searching_Algorithms.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 30;
        int startIdx = 0;
        int endIdx = arr.length - 1;
        int index = binarySearch(arr, target, startIdx, endIdx);
        System.out.println(index);
    }

    static int binarySearch(int[] nums, int target, int s, int e) {

        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < mid) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

}
