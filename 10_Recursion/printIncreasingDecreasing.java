
public class printIncreasingDecreasing {
    public static void main(String[] args) {
        printIncreasingDecreasing(5);
    }

    public static void printIncreasingDecreasing(int n) {

        if (n == 0)
            return;

        System.out.print(n + " ");
        printIncreasingDecreasing(n - 1);
        System.out.println(n + " ");
    }
}
