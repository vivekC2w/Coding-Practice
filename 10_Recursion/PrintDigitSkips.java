public class PrintDigitSkips {
    public static void main(String[] args) {
        printDigitSkipsOdd(5);
    }

    public static void printDigitSkipsOdd(int n) {
        if (n == 0)
            return;

        if (n % 2 == 0)
            System.out.print(n + " ");

        printDigitSkipsOdd(n - 1);

        if (n % 2 == 0)
            System.out.print(n + " ");

    }
}

// 4 2 2 4