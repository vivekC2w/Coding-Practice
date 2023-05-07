package Arena_codes.MathsProblems;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        CountBoxes(n, m);
        sc.close();
    }

    public static void CountBoxes(int n, int m) {
        long mod = 1000000007;
        long[] dp = new long[n + 1];
        long[] pre = new long[n + 1];
        dp[0] = 1;
        pre[1] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - m >= 0) {
                dp[i] = (pre[i - 1] - pre[i - m - 1] + mod) % mod;
            } else {
                dp[i] = 1;
            }
            pre[i] = (pre[i - 1] + dp[i]) % mod;
        }
        System.out.println(dp[n]);
    }
}
