/*
Problem Statement
In this task you have to print 5 stars ('*') vertically and 5 horizontally.
You are given functions to complete. Don't worry about the ins and outs of functions just print 5 vertical stars in vertical5 and 5 horizontal stars in horizontal5
Input
User Task:
Your task is to complete the functions vertical5() and horizontal5() given below to print the stars.
Output
Print 5 vertical stars in vertical5 and 5 horizontal stars(separated by a whitespace) in horizontal5 function.
Example
Sample Output:-
*
*
*
*
*

* * * * *
 */

public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("*");
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
    }
}
