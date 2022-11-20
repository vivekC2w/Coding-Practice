/*
Consonants
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s. Print the string after removing all vowels.
Input
The only line of input contains a string of lowercase characters.

1 <= |S| <= 100000
Output
Print the string after removing all vowels.
Example
Sample Input 1:
dtcpt

Output:
dtcpt

Explanation:
There are no vowels in this string.

Sample Input 2:
ehoqggi

Output:
hqgg
 */

import java.util.Scanner;

public class Consonant {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }
}
