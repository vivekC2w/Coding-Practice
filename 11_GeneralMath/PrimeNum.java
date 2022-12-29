
//package 11_ GeneralMath;
//TC => O(sqrt(N))
//SC => O(1)
import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        // int num = 18;
        // boolean ans = isPrime(num);
        // if (ans)
        // System.out.println(num + " is Prime");
        // else
        // System.out.println(num + " is not Prime number");

        sieveOferatosthenes(50);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void printArrayBoolean(boolean[] arr, String str) {

        System.out.print(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /*
     * Question: we need to print the prime numbers from 2-n
     * Input: 10
     * Output: 2, 3, 5, 7, 11, 13, 15, 17
     */
    public static ArrayList<Integer> sieveOferatosthenes(int n) {
        ArrayList<Integer> primeNosAns = new ArrayList<>();
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;

        // this is filling the array
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == true) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (j % i == 0)
                        arr[j] = false;
                }
            }
        }
        printArrayBoolean(arr, "ans");
        return primeNosAns;
    }

}
