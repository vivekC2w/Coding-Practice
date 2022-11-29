package Searching_Algorithms;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        // System.out.println(findNumbers(nums));
        System.out.println(digits2(-345678)); // 6
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num))
                count++;
        }

        return count;

    }

    // function to check number contains even no of digits
    static boolean even(int num) {

        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;

    }

    static int digits2(int num) {

        // for negative number
        if (num < 0)
            num *= -1;

        return (int) (Math.log10(num)) + 1;
    }

    static int digits(int num) {
        // for negative number
        if (num < 0)
            num *= -1;

        if (num == 0) {
            return 1;
        }

        int cnt = 0;
        while (num > 0) {
            num = num / 10;
            cnt++;
        }

        return cnt;
    }
}
