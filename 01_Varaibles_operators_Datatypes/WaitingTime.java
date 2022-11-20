
/*
 *Waiting Time

 Problem Statement
Sara is standing in a line for her turn to see the doctor. There are N people standing in front of Sara and for each person, the doctor takes exactly X minutes. Sara wants to know the time after which her number comes. Since Sara is weak in maths, your task is to calculate the time for her.
Input
You don't have to worry about the input, you just have to complete the function waitingTime()

Constraints:-
1 <= N <= 1000
1 <= X <= 1000
Output
Return the total time Sara needs to wait before her turn in minutes.
Example
Sample Input:-
5 3

Sample Output:-
15

Sample Input:-
3 2

Sample Output:-
6
 */
import java.io.*;

public class WaitingTime {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int NoOfPeoples = Integer.parseInt(br.readLine());
        int time = Integer.parseInt(br.readLine());

        WaitingTime(NoOfPeoples, time);
    }

    static void WaitingTime(int N, int X) {

        int totalTime = N * X;
        System.out.println(totalTime);

    }

}
/*
5
3
15
 */