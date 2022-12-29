public class Factorial {
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        int fact = n * factorial(n - 1);

        return fact;
    }
}
