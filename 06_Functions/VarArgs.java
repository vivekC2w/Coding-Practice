import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 8, 7, 9);
        multiple(2, 3, "Vivek", "Omkar", "Jayesh");
    }

    // oredering is important in mix args
    static void multiple(int a, int b, String... v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

// [2, 3, 4, 5, 8, 7, 9]
// 2 3 [Vivek, Omkar, Jayesh]