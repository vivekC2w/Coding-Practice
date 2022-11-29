
/*Problem Statement
Given a boolean matrix of size N*M in which each row is sorted your task is to print the index of the row containing maximum 1's. If multiple answer exist print the smallest one.
Input
First line contains two space separated integers denoting values of N and M. Next N lines contains M space separated integers depicting the values of the matrix.

Constraints:-
1 < = M, N < = 1000
0 < = Matrix[][] < = 1
Output
Print the smallest index (0 indexing) of a row containing the maximum number of 1's.
Example
Sample Input:-
3 5
0 1 1 1 1
0 0 0 1 1
0 0 0 1 1

Sample Output:-
0

Sample Input:-
4 4
0 1 1 1
1 1 1 1
0 0 1 1
1 1 1 1

Sample Output:-
1 */
import java.util.Scanner;

public class RowWithMaxOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] boolArr = new int[rows][cols];
        int maxCnt, maxIndex = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                boolArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            maxCnt = 0;
            for (int j = 0; j < cols; j++) {
                if (boolArr[i][j] == 1)
                    maxCnt++;
            }
            if (maxCnt > max) {
                max = maxCnt;
                maxIndex = i;
            }

        }
        System.out.println(maxIndex);
    }
}

/*
 * 3 5
 * 0 1 1 1 1
 * 0 0 0 1 1
 * 0 0 0 1 1
 * 0
 * 
 * 
 * 4 4
 * 0 1 1 1
 * 1 1 1 1
 * 0 0 1 1
 * 1 1 1 1
 * 1
 */