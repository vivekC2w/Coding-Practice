/*
Problem Statement
Write a program to print day of week name using switch case.
Input
The first line of the input contains week number

Constraints
1 <= weekNumber <= 7
Output
Print Week day Name.

Note Intitals must be capitals
Example
Sample Input :
3

Sample Output :
Wednesday
*/

import java.util.Scanner;

public class WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 7) {
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    break;
            }
        }
    }
}
