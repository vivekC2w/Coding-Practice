import java.util.Scanner;

public class XorStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String str1 = sc.next();
        String str2 = sc.next();

        for (int i = 0; i < N; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            boolean b1 = ch1 == '0';
            boolean b2 = ch2 == '0';

            System.out.print(b1 ^ b2 ? '1' : '0');

        }
    }
}

/*
 * 5
 * 10110
 * 01101
 * 11011
 */