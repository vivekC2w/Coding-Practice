//BIT Manipulation
//[2 2 2 3]
//Ones = 0 this keep ele's which are present only once
//Twos = 0 this keep ele's which reapeating twice

// for 1st ele => 2 XOR with 0(Twos)
//(00) XOR (10) = 10
//Bitwise AND with complement of Ones value(initially 00)
//10 AND (Twos complement which is intially declared 00) 11
//10 & 11 = 10 = 2

//Ones = 2
//Twos = 0

// for 2nd ele => 2 XOR with 0(Twos)
//(00) XOR (10) = 10
//Bitwise AND with complement of Ones value(which is now 2 => 10)
//10 AND (One complement 10) 01
//10 & 01 = 00 = 0

package Single-Number-II;

public class Solution3 {
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
