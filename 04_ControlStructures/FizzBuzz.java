/*
 * Problem Statement
Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
Input
Input contains a single integer N.

Constraints:-
1 < = N < = 1000
Output
Print N space separated number or Fizz buzz according to the condition.
Example
Sample Input:-
3

Sample Output:-
1 2 Fizz

Sample Input:-
5

Sample Output:-
1 2 Fizz 4 Buzz
 */

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
