package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		System.out.println(findDuplicate(new int[]{1}));
		System.out.println(findDuplicate(new int[]{2,2}));
		System.out.println(findDuplicate(new int[]{1,2,3}));
		System.out.println(findDuplicate(new int[]{1,2,3,3,4}));
		System.out.println(findDuplicate(new int[]{}));
	}

	public static int findDuplicate(int[] nums){
		Set<Integer> set = new HashSet<>();
		if(nums==null || nums.length==0)
			return Integer.MIN_VALUE;
		if(nums.length==1)
			return nums[0];
		if(nums.length>1){
			for(int n : nums){
				if(set.contains(n))
					return n;
				set.add(n);
			}
		}
		return Integer.MIN_VALUE;
	}
}
