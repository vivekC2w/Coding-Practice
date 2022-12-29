import java.util.*;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = gcd2(n1, n2);
        System.out.println(res);
    }

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;
        else {
            int returnVal = gcd(b, Math.abs(a - b));
            return returnVal;
        }

    }

    public static int gcd2(int a, int b) {
        if (a == b) {
            return a;
        } else {
            int returnVal;
            if (a > b) {
                returnVal = gcd2(a - b, b);
            } else {
                returnVal = gcd2(a, b - a);
            }

            return returnVal;
        }
    }
}
