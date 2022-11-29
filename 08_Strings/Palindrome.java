import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean res = isPalindrome(str);

        if (res)
            System.out.println(str + " is a Palindrome String");
        else
            System.out.println(str + " is not a Palindrome String");
    }

    public static boolean isPalindrome(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex))
                return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
