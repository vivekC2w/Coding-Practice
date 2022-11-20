import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int res = input % 2;
        switch (res) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                break;
        }
    }

}
