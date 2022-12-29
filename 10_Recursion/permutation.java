import java.util.*;

public class permutation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        int freq[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            freq[i] = 0;
        }

        ArrayList<Integer> li = new ArrayList<>();
        printpermute(li, arr, freq);

    }

    public static void printpermute(ArrayList<Integer> li, int arr[], int freq[]) {
        if (li.size() == arr.length) {
            System.out.println(li);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == 0) {
                freq[i] = 1;
                li.add(arr[i]);
                printpermute(li, arr, freq);
                freq[i] = 0;
                li.remove(li.size() - 1);
            }
        }
    }
}
