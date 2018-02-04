package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 1. Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1
 * 
 * Soln:
 * public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
 */

/*
 * Improve
 */
public class TwoSum {

	public static void main(String[] args) {
//		int result[] = twoSum(new int[] {2,7,11,15}, 9);
//		int result[] = twoSum(new int[] {0,4,3,0}, 0);
		int result[] = twoSum(new int[] {-1,-2,-3,-4,-5}, -8);
		if(result!=null)
			System.out.println(Arrays.toString(result));
		else
			System.out.println("result is null");
	}

	
	public static int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i + 1);
	    }
	    return result;
	}
	
	
//	//2.68%
//	public static int[] twoSum(int[] nums, int target) {
//		
//		for(int i=0;i<nums.length;i++){
//				int rem = target-nums[i];
//				for(int j=0;j<nums.length;j++){
//					if(i!=j && nums[j]==rem){
//						return new int[] {i,j};
//					}
//				}
//		}
//		
//		return null;
//	}
}
