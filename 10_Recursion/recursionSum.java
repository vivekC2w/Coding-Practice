package 10_ Recursion;

public class recursionSum {
    public static void main(String[] args) {
        sum(10);
        recursiveSum(10);
    }

    // Sum of numbers upto n using basic function
    public static void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Sum of numbers upto n using recursion
    public static int recursiveSum(int n) {
        // 5 + 4 + 3 + 2 + 1
        // stopping condition
        if (n == 0)
            return 0;

        int sum = n + recursiveSum(n - 1);

        return sum;
    }
}
