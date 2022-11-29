package Searching_Algorithms;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };

        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr) {
        if (arr.length == 0)
            return -1;

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
