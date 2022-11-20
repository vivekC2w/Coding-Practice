/*
 * Problem Statement
Given a string S, your task is to take input of the given string and print the same string.
Input
You don't have to worry about taking input, you just have to complete the function printString
Output
Print the string S.
Example

Sample Input:-
Hello

Sample Output:-
Hello
 */

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printString(str);
    }

    static void printString(String stringVariable) {
        System.out.println(stringVariable);
    }

}

/*
 * Hello
 * Hello
 */
