
public class printDecreasing {
    public static void main(String[] args) {
        PrintDecreasing(5);
    }

    static void PrintDecreasing(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");

        PrintDecreasing(n - 1);
    }
}
