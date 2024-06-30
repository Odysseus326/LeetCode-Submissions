// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Creates a HashMap to store the value and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array.
        for (int i = 0; i < nums.length; i++) {
            //Calculate the complement that when added to nums[i] equals the target
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the indices of the two numbers
                return new int[] {map.get(complement), i};
            }
            // If it doesnt't exist, add the current number and its index to the map
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }
}

class TwoSum
{
    public static void main(String args[])
    {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        Solution solutions = new Solution();
        int result[] = solutions.twoSum(nums, target);
        

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]); // Prints the index of results.
        }
    }
}