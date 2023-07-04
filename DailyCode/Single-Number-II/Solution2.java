//Counting Set Bits
//[2 2 2 3 5 5 5]
//check for all 32 bits
//bit represetaion of 2 => 010
//bit represetaion of 3 => 011
//bit represetaion of 5 => 101
//Integer numbers are represented in 32 bits representation
//so in this case we will count set bits
//[2 2 2 3 5 5 5]
//2 => 010
//2 => 010
//2 => 010
//3 => 011
//3 => 011
//3 => 011
//5 => 101
// ---------
//       4 which is not multiple of 3
// 4 % 3 == if this is equal to 0 then its okay otherwise set bit belongs to number that we have to find
//this is bcz all our nos are repeating atleast 3 times if no having set bit lets say for 5
//set bits occurs 3 times but if our single ele also having set bit at the same pos then it
//wont allow cnt of set bit to multiple of 3
//weightage will be taken using shift operator we will take & with all elemets
//shift = 1
//so at that pos we will add that bit to ans
//ans = 1

//shift = 2
//take bitwise & with each of this number 

//check for 2nd bit
//[2 2 2 3 5 5 5]
//2 => 010
//2 => 010
//2 => 010
//3 => 011
//3 => 011
//3 => 011
//5 => 101
// ---------
//      4 again which is not multiple of 3
//shift = 1 * 2 = 2 (left shift the value which means multiply by 2)
//ans = 1 + 2 = 3

//we will check for 3rd bit
//[2 2 2 3 5 5 5]
//2 => 010
//2 => 010
//2 => 010
//3 => 011
//3 => 011
//3 => 011
//5 => 101
// ---------
//     3 again which is multiple of 3
//this will not included in our shift value as it is multiple of 3
//shift  = 2 * 2 = 4(left shift the value which means multiply by 2)
//return ansy

//Time Complexity => O(32 * N) sorting method is faster than this method
//In this counting set bits method
//worst case = average case = best case = 0(32*N) as we are traversing 32 times for all cases
package Single-Number-II;

public class Solution2 {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (final int num : nums)
                sum += num >> i & 1;
            sum %= 3;
            ans |= sum << i;
        }
        return ans;
    }
}
