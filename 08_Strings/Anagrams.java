import java.net.SocketPermission;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char[] arr1 = str1.toCharArray();
        String str2 = sc.next();
        char[] arr2 = str2.toCharArray();

        boolean res = isAnagram(arr1, arr2);

        if (res)
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Strings are not Anagrams");
    }

    public static boolean isAnagram(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[arr2.length - i - 1]) {
                    return false;
                }
            }

            return true;

        }
    }
}
