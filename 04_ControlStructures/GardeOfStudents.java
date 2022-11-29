/*
 * Problem Statement
Given marks of a student in 5 subjects(any). You need to find the grade he/she would get on the basis of percentage obtained. Grades computed are as follows:

If the percentage of marks is >= 80 then print Grade ‘A’
If the percentage is <80 and >=60 then print Grade ‘B’
If the percentage is <60 and >=40 then print Grade ‘C’
else prints Grade ‘D’
Input
The input contains 5 integers separated by spaces.

Constraints:
1 <= marks <= 100
Output
You need to print the grade obtained by him/her.
Example
Sample Input:
75 70 80 90 100

Sample Output:
A
 */

import java.util.Scanner;

public class GardeOfStudents {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int avg, sum = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            // System.out.println(marks[i]);
            sum = sum + marks[i];
        }
        avg = sum / 5;
        // System.out.println(avg);
        if (avg >= 40 && avg < 60) {
            System.out.println('C');
        } else if (avg >= 60 && avg < 80) {
            System.out.println('B');
        } else if (avg >= 80) {
            System.out.println('A');
        } else {
            System.out.println('D');
        }

    }
}
