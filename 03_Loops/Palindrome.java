import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, temp = num, rem = 0;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("True");
        else
            System.out.println("False");
    }

}
