import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(num3, Math.max(num1, num2));

        System.out.println("Maximum Among given 3 numbers: " + max);

    }
}

/*
 * 10 25 24
 * Maximum Among given 3 numbers: 25
 */