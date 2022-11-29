import java.util.Scanner;

public class RotateMatrix {

    // this function will gives the transpose of matrix
    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // this function will give reverseColumns
    public static void reverseColumns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0;
            int rightIndex = arr[0].length - 1;
            while (leftIndex < rightIndex) {
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
    }

    // Print the array
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Rotate array by 90
        transpose(arr);
        reverseColumns(arr);
        display(arr);

        System.out.println();

        // Rotate array by 180
        transpose(arr);
        reverseColumns(arr);
        display(arr);
    }
}

/*
 * 2
 * 3 4
 * 7 6
 * Rotate By 90->>>
 * 7 3
 * 6 4
 * Rotate By 180->>>
 * 6 7
 * 4 3
 */