package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
		System.out.println(Arrays.toString(twoSum(nums,18)));
		System.out.println(Arrays.toString(twoSum(nums,22)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))
				return new int[] {map.get(nums[i]),i};
			map.put(target-nums[i], i);
		}
		return null;
	}
}
