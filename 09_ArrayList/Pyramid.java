import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.callback.PasswordCallback;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] lastRow = pascalTraingle(n);
        for (int ele : lastRow)
            System.out.print(ele + " ");

    }

    public static int[] pascalTraingle(int n) {
        int[] prevArr = new int[1];
        prevArr[0] = 1;

        while (n-- > 0) {
            int[] nextRowArray = new int[prevArr.length + 1];
            // first and last ele should be 1
            nextRowArray[0] = nextRowArray[nextRowArray.length - 1] = 1;
            // fill the middle elements
            for (int i = 1; i < prevArr.length; i++) {
                nextRowArray[i] = prevArr[i - 1] + prevArr[i];
            }

            // now all the work of the Row is done
            // now i should update the prev row
            prevArr = nextRowArray;

        }
        return prevArr;
    }
}
/*
 * pascal triangle
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 4 1
 * 
 * 5
 * 1 5 10 10 5 1
 */
