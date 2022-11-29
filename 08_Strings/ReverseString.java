import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String res = reverseString(str);
        System.out.println("Reverse String is :" + res);
    }

    public static String reverseString(String str) {
        String ansStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(str.length() - 1 - i);
            ansStr += ch;
        }
        return ansStr;
    }

}
