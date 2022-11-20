/*
 * Problem Statement
Given an integer N, your task is to take input of the given integer and print it.
Input
You don't have to worry about the input, you just have to complete the function printIntger()

Constraints:-
1 <= N <= 100
Output
Print the integer N.
Example
Sample Input:-
3

Sample Output:
3

Sample Input:
56

Sample Output:
56
 */

import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printInteger(num);
    }

    static void printInteger(int intVariable) {
        System.out.println(intVariable);
    }
}

/*
 * 3
 * 3
 * PS C:\Users\vivek.deepak.hiray\Desktop\01_Java_Coding\
 * 01_Varaibles_operators_Datatypes> & 'C:\Program
 * Files\Java\jdk-19\bin\java.exe' '--enable-preview'
 * '-XX:+ShowCodeDetailsInExceptionMessages' '-cp'
 * 'C:\Users\vivek.deepak.hiray\AppData\Roaming\Code\User\workspaceStorage\
 * 91ef1d01d2ae80e13a813729be8aad63\redhat.java\jdt_ws\
 * 01_Varaibles_operators_Datatypes_f54fc162\bin' 'InputInteger'
 * 56
 * 56
 */