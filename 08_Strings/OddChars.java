import java.util.Scanner;

public class OddChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0)
                sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

}
