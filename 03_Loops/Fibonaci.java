import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fibUpTo = in.nextInt();
        int prev = 0;
        int curr = 1;
        int count = 2;
        System.out.print(prev + " ");

        while (count <= fibUpTo) {
            int temp = curr;
            curr = curr + prev;
            System.out.print(curr + " ");
            prev = temp;
            count++;
        }
    }
}

/*
 * 7
 * 0 1 2 3 5 8 13
 */