import java.io.*;

public class MaxNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int[] arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            int[] ansArr = new int[3];
            for (int i = 0; i < 3; i++) {
                int max = Integer.MIN_VALUE;
                int indexMax = -1;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        indexMax = j;
                    }
                }
                ansArr[i] = max;
                arr[indexMax] = Integer.MIN_VALUE;
            }
            for (int i = 0; i < 3; i++) {
                System.out.print(ansArr[i] + " ");
            }
            System.out.println();
        }
    }
}
/*
 * 3
 * 5
 * 1 4 2 4 5
 * >>>>>5 4 4
 * 6
 * 1 3 5 7 9 8
 * >>>>>9 8 7
 * 7
 * 11 22 33 44 55 66 77
 * >>>>>>77 66 55
 */