
/*Problem Statement
You are given an n*m grid which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?

The phrase "saba" must look one of these shapes:

Input
First line: Two integer n and m, where n denotes (1 <= n, m <= 100) the number of rows and m denotes the number of columns in the grid.
Next n lines: Each line must contain a string of length m which contains lower- case English letters only.

Constraints
1 ≤ n, m ≤ 100
Output
Print the number of times the word “saba” appears in the grid.

Example
Sample Input 1:
5 5
s a f e r
a m j a d
b a b o l
a a r o n
s o n g s

Sample Output 1:
2 */
import java.util.Scanner;

public class GridAndPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        char[][] arr = new char[rows][cols];
        int ans = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 's') {
                    // check for horizontal direction
                    if (j + 3 < cols) {
                        if (arr[i][j] == 's' && arr[i][j + 1] == 'a' && arr[i][j + 2] == 'b' && arr[i][j + 3] == 'a') {
                            ans++;
                        }

                        // check for diagonally downward direction
                        if (i + 3 < rows) {
                            if (arr[i][j] == 's' && arr[i + 1][j + 1] == 'a' && arr[i + 2][j + 2] == 'b'
                                    && arr[i + 3][j + 3] == 'a') {
                                ans++;
                            }
                        }

                    }
                    // for checking in vertical direction
                    if (i + 3 < rows) {
                        if (arr[i][j] == 's' && arr[i + 1][j] == 'a' && arr[i + 2][j] == 'b' && arr[i + 3][j] == 'a') {
                            ans++;
                        }
                    }

                    // for checking in upward diagonal
                    if ((i - 3) >= 0 && (j + 3) < cols) {
                        if (arr[i][j] == 's' && arr[i - 1][j + 1] == 'a' && arr[i - 2][j + 2] == 'b'
                                && arr[i - 3][j + 3] == 'a')
                            ans++;
                    }

                }

            }
        }
        System.out.println(ans);
    }
}

/*
 * 5 5
 * s a f e r
 * a m j a d
 * b a b o l
 * a a r o n
 * s o n g s
 * 2
 */