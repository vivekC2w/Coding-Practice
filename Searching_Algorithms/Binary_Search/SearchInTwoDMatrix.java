package Searching_Algorithms.Binary_Search;

public class SearchInTwoDMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            int item = matrix[row][col];
            if (item == target) {
                return true;
            }
            if (item > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
