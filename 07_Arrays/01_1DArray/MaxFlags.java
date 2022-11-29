/*
 * Problem Statement
You are given N flags, initially set to 0. Now you have to perform two operations on them:

1. Increase(F) by 1: flag F is increased by 1.
2. max_flag: all flags are set to maximum value of any flag.

A non-empty array arr[] will be given of size M. This array represents consecutive operations:

a) If arr[K] = F, such that 1 <= F <= N then operation K is Increase(F).
b) If arr[K] = N+1 then operation K is max_flag.

For example, given integer N = 5 and array arr of size 7 such that:
arr[0] = 3
arr[1] = 4
arr[2] = 4
arr[3] = 6
arr[4] = 1
arr[5] = 4
arr[6] = 4

the values of the flags after each consecutive operation will be:
(0, 0, 1, 0, 0)
(0, 0, 1, 1, 0)
(0, 0, 1, 2, 0)
(2, 2, 2, 2, 2)
(3, 2, 2, 2, 2)
(3, 2, 2, 3, 2)
(3, 2, 2, 4, 2)

The goal is to calculate the value of every flags after all operations.
Input
The input line contains T, denoting the number of testcases.
Each testcase contains two lines.
First line contains an integer N, the number of flags and an integer M, size of array 'arr'. S
econd line contains elements of array 'arr' separated by space.

Constraints:
1 <= T <= 100
1 <= N, M <= 10^5
1 <= arr[i] <= N+1

Sum of N and M for each test case is less than or equal to 10^5
Output
For each testcase you need to print the updated array after all operations in new line.
Example
Sample Input:
1
5 7
3 4 4 6 1 4 4

Sample Output:
3 2 2 4 2

Explanation:
Testcase 1:
the values of the flags after each consecutive operation will be:
(0, 0, 1, 0, 0)
(0, 0, 1, 1, 0)
(0, 0, 1, 2, 0)
(2, 2, 2, 2, 2)
(3, 2, 2, 2, 2)
(3, 2, 2, 3, 2)
(3, 2, 2, 4, 2)
 */

import java.util.Scanner;

public class MaxFlags {

    // This function will increment flag at position
    public static void incrementAt(int[] arr, int i) {
        arr[i]++;
    }

    // This fun finds the max flag in flags
    public static int findMax(int[] arr) {
        int currentMax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }

    // this fun will replace all values with max flag
    public static void replaceAllValues(int[] arr, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = replacement;
        }
    }

    // This fun will print flags
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // ! new line
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int flagsLength = sc.nextInt();
            int[] flagsArr = new int[flagsLength];
            int noOfOperationsM = sc.nextInt();
            int[] operationsArr = new int[noOfOperationsM];

            for (int i = 0; i < noOfOperationsM; i++) {
                operationsArr[i] = sc.nextInt();
            }

            for (int i = 0; i < noOfOperationsM; i++) {
                int operationValueF = operationsArr[i];

                if (operationValueF >= 1 && operationValueF <= flagsLength) {
                    incrementAt(flagsArr, operationValueF - 1);
                } else {
                    int maxVal = findMax(flagsArr);
                    replaceAllValues(flagsArr, maxVal);
                }
            }
            print(flagsArr);
        }
    }
}

/*
 * 1
 * 5 7
 * 3 4 4 6 1 4 4
 * 3 2 2 4 2
 */