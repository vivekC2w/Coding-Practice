//Brute Force Approach
//HashMap + Linear Traversal 
//Traverse through given array and store key as array elemnts and their freq as value in HashMap
//Get the key having count 1
//Time Complexity will be O(NlogN)
//Space Complexity O(N)

public class Solution1 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
