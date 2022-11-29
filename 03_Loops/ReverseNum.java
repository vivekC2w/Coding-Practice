public class ReverseNum {
    public static void main(String[] args) {
        int num = 23597;
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }
        System.out.println(revNum);
    }
}

/*
 * 79532
 */