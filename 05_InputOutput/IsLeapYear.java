import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String res = "";

        res = (year % 4 == 0 && year % 100 != 0) ? "YES" : ((year % 400 == 0) ? "YES" : "NO");

        System.out.println(res);
    }
}
