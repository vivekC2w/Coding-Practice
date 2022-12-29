package 11_ GeneralMath;

public class DecimalToOctal {
    // TC => O(log(N))
    // SC => O(2)
    public static void main(String[] args) {

        int decNum = 11;
        String octalNum = decToOctal(decNum);
        System.out.println(octalNum);
    }

    public static String decToOctal(int decimalNum) {
        StringBuilder sb = new StringBuilder();
        while (decimalNum > 0) {
            int rem = decimalNum % 8;
            decimalNum /= 8;
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
}
