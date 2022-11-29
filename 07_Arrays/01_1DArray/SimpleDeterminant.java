/*Problem Statement
You are given a 2X2 square matrix. You need to find the determinant of the matrix.
Input
The input contains two-line, each line contain two integers separated by spaces.

Each element of the matrix is from 1 to 100.
Output
Output a single integer, the determinant of the matrix.
Example
Sample Input
4 5
2 3

Sample Output
2

Sample Input
2 10
10 40

Sample Output
-20 */

import java.util.Scanner;

public class SimpleDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1]);

    }
}

/*
 * 4 5
 * 2 3
 * 2
 * 
 * 2 10
 * 10 40
 * -20
 */