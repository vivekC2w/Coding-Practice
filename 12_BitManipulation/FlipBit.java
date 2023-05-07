
//package 12_BitManipulation;
/*
   Question: X = 
   Input =  Position = 2, X = 1010101100 = decimal = 684
   Output = 0000000100 = decimal = 4
 * Explanation: 
 * Hint: Take 2's compliment and do AND operation
 */
public class FlipBit {
    public static void main(String[] args) {
        int rightMostSetBitNum = 684;
        int rightMostSetBitAns = rightMostSetBit(rightMostSetBitNum);
        System.out.println(rightMostSetBitAns);
    }

    public static int rightMostSetBit(int num) {
        int numComplement = ~num;
        int twosComplementNum = numComplement + 1;

        return num & twosComplementNum;
    }
}
