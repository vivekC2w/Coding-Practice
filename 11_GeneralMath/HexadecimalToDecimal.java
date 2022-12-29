package 11_ GeneralMath;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        /*
         * Convert Hexadecimal value to decimal
         * Input: 394FF
         * Output: 234751
         */
        String hexadec = "394FF";
        int ans = hexadecimalToDecimal(hexadec);
        System.out.println(ans);

    }

    public static int hexadecimalToDecimal(String hexadec) {

        int power = 0;
        int ans = 0;

        for (int i = hexadec.length() - 1; i >= 0; i++) {
            char ch = hexadec.charAt(i);

            if (ch >= '0' && ch <= '9') {
                int noRepresenting = ch - '0';
                ans += noRepresenting * Math.pow(16, power);
                power++;
            } else if (ch >= 'A' && ch <= 'F') {
                int noRepresenting = ch - 'A' + 10;
                ans += noRepresenting * Math.pow(16, power);
                power++;
            }
        }

        return ans;
    }
}
