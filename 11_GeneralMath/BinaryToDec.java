package 11_ GeneralMath;

public class BinaryToDec {
    public static void main(String[] args) {
        int binNum = 101;
        String binNumber = "10110010101001111010";
        int ans = binaryToDecimalSec(binNumber);
        System.out.println(ans);
    }

    public static int binaryToDecimal(int binNum) {
        int decimalNum = 0, pow = 0;
        while (binNum > 0) {
            int rem = binNum / 10;
            binNum /= 10;
            decimalNum += rem * (int) Math.pow(2, pow);
            pow++;
        }
        return decimalNum;
    }

    public static int binaryToDecimalSec(String binNumber) {
        int decimalNum = 0, pow = 0;
        char[] cArr = binNumber.toCharArray();
        for (int i = cArr.length - 1; i >= 0; i--) {
            int rem = cArr[i];
            decimalNum += rem * (int) Math.pow(2, pow);
            pow++;
        }
        return decimalNum;
    }
}
