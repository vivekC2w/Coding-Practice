//Brute Force Approach
//HashMap + Linear Traversal 
//Traverse through given array and store key as array elemnts and their freq as value in HashMap
//Get the key having count 1
//Time Complexity will be O(NlogN)
//Space Complexity O(N)


//Second way is to sort array first in ascending order and then find ele with freq 1
//Here we have to boundary case if we have our elemnt at either 1st pos or last pos
//we will check 1st ele is with 2nd ele
//at 1st pos=>  [2 4 4 4 5 5 5]
//we will check last ele with sec last ele
//at last pos=> [4 4 4 5 5 5 6]
//Then only we start iteratioon after checking boundary conditions
//For that we will start i with index 1 and check if arr[i] == arr[i-1]
//[2 2 2 3 3 3 4 5 5 5]
//   |
//   i  if arr[i] == arr[i-1] then we will move 3 steps ahead   

//[2 2 2 3 3 3 4 5 5 5]
//         |
//         i  check if arr[i] == arr[i-1] => true then move 3 steps ahead

////[2 2 2 3 3 3 4 5 5 5]
//                 |
//                 i  check if arr[i] == arr[i-1] => false then return arr[i-1]



//Time Complexity => O(NlogN)(for sorting) + O(N) (for traversing)

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
