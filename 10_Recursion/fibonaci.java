public class fibonaci {
    public static void main(String[] args) {

        // Time Complexity => O(2^n)
        int ans = fibbonaci(7);
        System.out.println(ans);
    }

    public static int fibbonaci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int faith1 = fibbonaci(n - 1);
        int faith2 = fibbonaci(n - 2);

        int ans = faith1 + faith2;

        return ans;
    }
}

/*
 * 0 1 1 2 3 5 8 13
 * 13
 */