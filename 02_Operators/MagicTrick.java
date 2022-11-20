
/*
Problem Statement
Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
1. Think of a number X(don't tell Sara)
2. Add A(Given by Sara) to it.
3. Double the sum in your mind.
4. Add an even number B(Given by Sara) to it.
5. Half the amount
6. Subtract the initial number which you had taken from the sum
After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?
Input
You don't have to worry about the input, you just have to complete the function magicTrick()

Constraints:-
1 <= A, B <= 1000
Output
Print the resulting amount
Example
Sample Input:-
3 4

Sample Output:-
5

Sample Input:-
8 4

Sample Output:-
10
 */
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int X = a + b;

        // ADD a to it
        X = X + a;
        // double the sum in your mind
        X *= 2;
        // add even number b to it.
        X += b;
        // Half the amount
        X /= 2;
        // subtract the initial number which you had taken from the sum
        X -= (a + b);

        System.out.println(X);
    }
}
