//package 11_ GeneralMath;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }

    public static void permutations(String str, String ans) {
        // base condition
        if (str.length() == 0)
            System.out.println(ans);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftSubstring = str.substring(0, i);
            String rightSubstring = str.substring(i + 1);
            String restOfTheString = leftSubstring + rightSubstring;

            permutations(restOfTheString, ans + ch);
        }

    }
}
