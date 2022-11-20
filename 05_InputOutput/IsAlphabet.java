/*
 * Problem Statement
Write a program to check whether character is an alphabet or not using conditional operator.
Input
The first line of the input contains a character ch.

Constraints
'a', 'A' <= ch <= 'z', 'Z'
Output
Print "YES" if it's alphabet otherwise "NO".
Example
Sample Input :
a

Sample Output
YES
 */

import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String res;
        res = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? "YES" : "NO";

        System.out.println(res);

    }
}
