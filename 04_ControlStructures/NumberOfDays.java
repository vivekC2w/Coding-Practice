/*
Number of days
easy
Problem Statement
Given the number of the month, your task is to calculate the number of days present in the particular month.

Note:- Consider non-leap year
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function numberofdays() which contains M as a parameter.

Constraints:-
1 <= M <= 12
Output
Print the number of days in the particular month.
Example
Sample Input:-
1

Sample Output:
31

Sample Input:-
2

Sample Output:-
28
 */

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        numberOfDays(input);
    }

    static void numberOfDays(int M) {
        // Enter your code here
        switch (M) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                break;
        }
    }
}
