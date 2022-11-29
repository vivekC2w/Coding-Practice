import java.util.Scanner;

//Time complexity => O(n) and Space Complexity => O(n)
public class LastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lastWord = PrintLastWord(str);
        System.out.println(lastWord);
    }

    public static String PrintLastWord(String str) {
        String[] arr = str.split(" ");
        return arr[arr.length - 1];
    }

}

/*
 * Hey there Samantha
 * Samantha
 */