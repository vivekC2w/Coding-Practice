/*
Problem Statement
Given an integer N. Print the value of PI with precision upto N decimal places.
Input
The only input line contains an integer N.

Constraints:
1 <= N <= 10
Output
Print the value of PI.
Example
Sample Input 1:
4

Output:
3.1416

Sample Input 2:
10

Output:
3.1415926536
 */

import java.io.*;

public class PIValue {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int input = Integer.parseInt(br.readLine());
        double PI = 3.141592653589793;
        PI = Math.round(PI * Math.pow(10, input)) / Math.pow(10, input);
        System.out.println(PI);
    }
}
