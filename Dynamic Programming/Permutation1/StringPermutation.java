import java.io.*;
import java.util.*;

package Dynamic

Programming.Permutation1;

public class StringPermutation {

    static List<String> resultList = new ArrayList<>();

    private static void swap(char inputArr[], int index1, int index2) {
        char temp = inputArr[index1];
        inputArr[index1] = inputArr[index2];
        inputArr[index2] = temp;
    }

    private static void permute(char inputArr[], int left, int right) {
        if (left == right) {
            String result = new String(inputArr);
            resultList.add(result);
            return;
        }

        for (int i = left; i <= right; i++) {
            swap(inputArr, left, i);
            permute(inputArr, left + 1, right);
            swap(inputArr, left, i);
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char inputArr[] = input.toCharArray();

        permute(inputArr, 0, inputArr.length - 1);

        Collections.sort(resultList);

        for (String result : resultList) {
            System.out.print(result + " ");
        }
    }
}
