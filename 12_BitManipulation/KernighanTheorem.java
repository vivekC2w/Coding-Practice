// package 12_BitManipulation;

/*
 * Que: Count the set Bit kernighan algo.
 * Input: 7 = 1110
 * Output: 3
 * 
 */

public class KernighanTheorem {
    public static void main(String[] args) {
        int n = 7;
        int ans = countSetBits(n);
        System.out.println(ans);
    }

    public static int countSetBits(int num1) {
        int cnt = 0;
        while (num1 != 0) {
            int rightMostSetBitNum = rightMostSetBit(num1);
            if (rightMostSetBitNum != 0)
                cnt++;
            num1 -= rightMostSetBitNum;
            cnt++;
        }
        return cnt;
    }

    public static int rightMostSetBit(int num) {
        int numComplement = ~num;
        int twosComplementNum = numComplement + 1;

        return num & twosComplementNum;
    }
}
