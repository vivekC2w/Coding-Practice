/*
 * Killing Monsters
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
N+1 towns are going to be attacked by monsters. The i-th town will be attacked by Ai monsters. Saloni has got N of her friends for rescue. The i-th friend has the capability to kill Bi monsters. The only constraint is that the i-th friend can kill monsters from town i and i+1 only.
Find the maximum number of monsters the friends can kill.
Input
The first line of input contains an integer N.
The next line contains N+1 integers Ai.
The next line contains N integers Bi.

Constraints
1 <= N <= 100000
1 <= Ai, Bi <= 1000000000
Output
Output a single integer, the maximum number of monsters that can be killed.
Example
Sample Input
2
3 5 2
4 5

Sample Output
9

Explanation
The first friend will kill 2 monsters from town 1 and 2 monsters from town 2.
The second friend will kill 3 monsters from town 2 and 3 monsters from town 3.

Sample Input:
2
100 1 1
1 100

Sample Output:
3
 */

import java.util.*;

public class KillingMonsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfFrnds = sc.nextInt();
        int[] Towns = new int[noOfFrnds + 1];
        int[] Frnds = new int[noOfFrnds];

        for (int i = 0; i < Towns.length; i++) {
            Towns[i] = sc.nextInt();
        }

        for (int i = 0; i < Frnds.length; i++) {
            Frnds[i] = sc.nextInt();
        }

        int totalKilled = 0;
        for (int i = 0; i < Frnds.length; i++) {
            int killCapacity = Frnds[i];
            int numberOfMonsters = Towns[i];

            int actualKilled = Math.min(killCapacity, numberOfMonsters);
            totalKilled += actualKilled;

            killCapacity -= actualKilled;
            if (killCapacity > 0) {
                int nextTownMonsters = Towns[i + 1];
                actualKilled = Math.min(killCapacity, nextTownMonsters);
                totalKilled += actualKilled;
                killCapacity -= actualKilled;
                Towns[i + 1] -= actualKilled;
            }
        }
        System.out.println(totalKilled);
    }
}

/*
 * 2
 * Towns[] => 3 5 2
 * Frnds=> 4 5
 * TotalMonstersKilled=> 9
 * 
 * 
 * 2
 * Towns[] => 100 1 1
 * Frnds=> 1 100
 * TotalMonstersKilled=> 3
 */