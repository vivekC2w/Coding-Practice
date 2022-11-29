import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char maxFreqChar = MaxFreq(str);
        System.out.println(maxFreqChar);
    }

    public static char MaxFreq(String str) {

        int[] freqArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqArr[ch - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] > max) {
                max = freqArr[i];
                maxIndex = i;
            }
            System.out.print(freqArr[i] + " ");
        }
        System.out.println();
        System.out.println(maxIndex);
        return (char) ('a' + maxIndex);

    }
}
