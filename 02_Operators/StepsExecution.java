/*
 * Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input
You don't have to worry about the input, you just have to complete the function stepsExecute

Constraints
1000 <= number <= 9999
Output
Print the final result
Example
Sample Input :
2345

Sample Output :
20
 */

import java.util.Scanner;

// package 02_Operators;

public class StepsExecution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int addAndDivide = (N + 8) / 3;
        int modAndMultiply = (addAndDivide % 5) * 5;

        System.out.println(modAndMultiply);
    }
}
