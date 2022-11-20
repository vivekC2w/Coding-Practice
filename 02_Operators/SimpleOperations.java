/*
Problem Statement
Given two integers a and b, your task is to calculate and print the following four values:-
a+b
a-b
a*b
a/b

Note:- See example for more clarity.
Input
The input contains two integers a and b separated by spaces.

Constraints:
1 <= b <= a <= 1000

Note: It is guaranteed that a will be divisible by b.
Output
Print the mentioned operations each in a new line.
 */

import java.util.Scanner;

public class SimpleOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

    }
}