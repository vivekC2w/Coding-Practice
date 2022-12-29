// package 11_GeneralMath;

//TC => O(log(N))
//SC => O(1)
public class DecimalToBin {
    public static void main(String[] args) {
        int decimalNum = 5;
        String binNum = decimalToBinary(decimalNum);
        System.out.println(binNum);
    }

    public static String decimalToBinary(int decimalNum) {

        StringBuilder sb = new StringBuilder();
        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            decimalNum /= 2;
            sb.append(rem);
        }

        return sb.reverse().toString();
    }
}
