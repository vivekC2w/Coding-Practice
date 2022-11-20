import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Print Even Number upto N using for loop
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
