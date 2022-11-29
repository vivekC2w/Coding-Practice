/*Problem Statement
Given a 2d matrix of size M*N, print the zig traversal of the matrix as shown:-

Consider a matrix of size 5*4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20

ZigZag traversal:-

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
Input
First line of input contains two integers M and N. Next M lines contains N space- separated integers each.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[i][j] <= 100000
Output
Print the zig- zag traversal of the matrix as shown.
Example
Sample Input:-
4 3
1 2 3
4 5 6
7 8 9
10 11 12

Sample Output:-
1
4 2
7 5 3
10 8 6
11 9
12 */

import java.util.Scanner;

public class ZigZagTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printDiagonal(arr);
    }

    public static void printDiagonal(int[][] arr) {
        // lets print 1st half

        for (int row = 0; row < arr.length; row++) {
            int i = row;
            int j = 0;

            while (isValid(i, j, arr)) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }

        // lets print second half
        for (int col = 1; col < arr[0].length; col++) {
            int i = arr.length - 1;
            int j = col;

            while (isValid(i, j, arr)) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }

    }

    public static boolean isValid(int row, int col, int[][] arr) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length) {
            return false;
        } else {
            return true;
        }
    }
}

/*
 * 4 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 10 11 12
 * 1
 * 4 2
 * 7 5 3
 * 10 8 6
 * 11 9
 * 12
 */