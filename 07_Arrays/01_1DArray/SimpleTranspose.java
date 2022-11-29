import java.util.Scanner;

public class SimpleTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] twoDArr = new int[N][N];
        int[][] resArr = new int[N][N];

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                twoDArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                if (i == j)
                    resArr[i][j] = twoDArr[i][j];
                else
                    resArr[i][j] = twoDArr[j][i];
            }
        }

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                System.out.print(resArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 */