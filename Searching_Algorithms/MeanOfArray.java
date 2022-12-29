package Searching_Algorithms;

public class MeanOfArray {
    public static void main(String[] args) {
        int[] nums = { 7, 5, 1, 8, 3, 6, 0, 9, 4, 2 };
        double mean = findMean(nums);
        System.out.println(mean);
    }

    static double findMean(int[] arr) {
        double sum = 0;
        double size = arr.length;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // System.out.println(sum);
        // System.out.println(size);
        return sum / size;
    }
}
