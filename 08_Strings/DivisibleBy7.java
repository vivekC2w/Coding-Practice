import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int rem = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0'; // uses ASCII values
            int d = rem * 10 + num;
            rem = d % 7;
        }
        System.out.println(rem == '0' ? '1' : '0');
    }
}

/*
 * 8955795758
 * 0
 */