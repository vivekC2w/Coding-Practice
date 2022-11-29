/*
 * Problem Statement
Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.
Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Constraints:-
1 < = N < = 1000
1 < = elements < = N
Output
Print the missing element
Example
Sample Input:-
3
3 1

Sample Output:
2

Sample Input:-
5
1 4 5 2

Sample Output:-
3
 */

import java.util.Scanner;

public class MissingEleFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += sc.nextInt();
        }

        int totalSum = N * (N + 1) / 2;
        System.out.println(totalSum - sum);
    }
}

/*
 * 5
 * 1 4 5 2
 * 3
 */