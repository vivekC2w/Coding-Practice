package 11_ GeneralMath;

public class OctalToDecimal {
    // TC => O(log(N))
    // SC => O(1)
    public static void main(String[] args) {
        int octalNum = 13;
        int decimalNum = octalToDecimal(octalNum);
        System.out.println(decimalNum);
    }

    public static int octalToDecimal(int octalNum) {
        int power = 0;
        int decimalNum = 0;

        while (octalNum > 0) {
            int rem = octalNum % 10;
            octalNum /= 10;
            decimalNum += rem * Math.pow(8, power);
            power++;
        }

        return decimalNum;
    }
}
