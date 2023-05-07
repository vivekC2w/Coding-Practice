package 12_ BitManipulation;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        int isPowOfTwo = 7;
        int isPowerOfTwoAns = isPowerOfTwo(isPowOfTwo);
        System.out.println(isPowerOfTwoAns);
    }

    public static int isPowerOfTwo(int n) {
        if (n == 0)
            return 0;
        return n & n - 1;

    }
}
