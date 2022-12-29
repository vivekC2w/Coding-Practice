
public class printIncreasing {
    public static void main(String[] args) {
        PrintIncreasing(5);
    }

    static void PrintIncreasing(int n) {
        if (n == 0)
            return;

        PrintIncreasing(n - 1);

        System.out.print(n + " ");
    }
}
