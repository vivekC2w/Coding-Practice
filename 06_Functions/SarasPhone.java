
/*Problem Statement
Sara's Phone has N apps and each app takes K unit of memory. Now Sara wants to release M units of memory. Your task is to tell the minimum apps Sara needs to delete or say it is not possible.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Phone() that takes integers N, K, and M as arguments.

Constraints:-
1 <= N <= 1000
1 <= K <= 100
0 <= M <= 10000
Output
Return minimum apps to delete and if it is not possible return -1.
Example
Sample Input:-
10 3 10

Sample Output:-
4

Sample Input:-
10 3 40

Sample Output:-
-1 */
import java.util.Scanner;

public class SarasPhone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalApps = sc.nextInt();
        int memoryPerApp = sc.nextInt();
        int memTobeDeleted = sc.nextInt();

        int appsTobeDeleted = Phone(totalApps, memoryPerApp, memTobeDeleted);

        System.out.println(appsTobeDeleted);

    }

    static int Phone(int N, int K, int M) {

        if (N * K > M) {
            if (M % K == 0)
                return M / K;
            else
                return (M / K) + 1;
        } else {
            return -1;
        }
    }
}
