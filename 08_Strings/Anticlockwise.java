import java.util.Scanner;

public class Anticlockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int rowTop = 0;
        int rowBottom = N - 1;
        int colLeft = 0;
        int colRight = N - 1;
        while (colLeft <= colRight && rowTop <= rowBottom) {
            for (int i = rowTop; i <= rowBottom; i++) {
                System.out.print(arr[i][colLeft] + " ");
            }
            colLeft++;
            for (int j = colLeft; j <= colRight; j++) {
                System.out.print(arr[rowBottom][j] + " ");
            }
            rowBottom--;
            for (int i = rowBottom; i >= rowTop; i--) {
                System.out.print(arr[i][colRight] + " ");
            }
            colRight--;
            for (int j = colRight; j >= colLeft; j--) {
                System.out.print(arr[rowTop][j] + " ");
            }
            rowTop++;
        }
    }
}
