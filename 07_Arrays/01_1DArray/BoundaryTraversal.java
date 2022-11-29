import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class BoundaryTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] arr = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            if (rows == 1) {
                for (int i = 0; i < cols; i++) {
                    System.out.print(arr[0][i] + " ");
                }
            } else if (cols == 1) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(arr[j][0] + " ");
                }
            } else {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[0][j] + " ");
                }
                for (int i = 1; i < rows - 1; i++) {
                    System.out.print(arr[i][cols - 1] + " ");
                }
                for (int j = cols - 1; j > 0; j--) {
                    System.out.print(arr[rows - 1][j] + " ");
                }
                for (int i = rows - 1; i > 0; i--) {
                    System.out.print(arr[i][0] + " ");
                }
            }
            System.out.println();
        }
    }
}
