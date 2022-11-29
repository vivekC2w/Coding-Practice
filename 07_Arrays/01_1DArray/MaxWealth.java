public class MaxWealth {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(maximumWealth(nums));
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        // int personNo = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start new column start sum from 0
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > maxSum) {
                maxSum = sum;
                // personNo = person;
            }
        }
        return maxSum;
    }
}
