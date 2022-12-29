package Searching_Algorithms;

import java.util.*;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] nums = { 7, 5, 1, 8, 3, 6, 0, 9, 4, 2 };
        double median = findMedian(nums);
        System.out.println(median);
    }

    static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int mid1 = arr.length / 2;
        int mid2 = (arr.length / 2) - 1;
        if (arr.length % 2 != 0)
            return arr[mid1];
        else
            return ((arr[mid2] + arr[mid1]) / 2.0);
    }
}
