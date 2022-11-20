
/*
 * Problem Statement
Write a program to check whether a number is positive, negative or zero using switch case.
Input
The first line of the input contains the number

Constraints
-1e9 <= n <= 1e9
Output
Print the single line wether it's "Positive", "Negative" or "Zero"
Example
Sample Input :
13

Sample Output :
Positive

Sample Input :
-13

Sample Output :
Negative
 */
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int ip = sc.nextInt();
        if (ip < 0) {
            ip = 0;
        } else if (ip == 0) {
            ip = 1;
        } else {
            ip = 2;
        }

        switch (ip) {
            case 0:
                System.out.print("Negative");
                break;
            case 1:
                System.out.print("Zero");
                break;
            case 2:
                System.out.print("Positive");
                break;
            default:
                System.out.print("Invalid Input");
                break;

        }
    }
}
