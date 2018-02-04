package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ArrayContainsDuplicate {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,2,3,4,5,6}));
		System.out.println(containsDuplicate(new int[] {1,2,3,4,5,6}));
		System.out.println(containsDuplicate(new int[] {}));
		System.out.println(containsDuplicate(new int[] {1}));
		System.out.println(containsDuplicate(new int[] {1,2}));
		System.out.println(containsDuplicate(new int[] {1,1}));
		System.out.println(containsDuplicate(new int[] {1,1,2,2,1,2}));
	}

	//68.9%
	public static boolean containsDuplicate(int[] nums) {
		boolean hasDupe = false;
		Set<Integer> set = new HashSet<>();
		
		for(int n: nums){
			if(!set.add(n))
				return true;
		}
		
		return hasDupe;
	}
	
	//TLE
//	public static boolean containsDuplicate(int[] nums) {
//		boolean hasDupe = false;
//		
//		for(int i=0;i<nums.length;i++){
//			for(int j=i+1;j<nums.length;j++){
//				if(nums[i]==nums[j]){
//					return true;
//				}
//			}
//		}
//		
//		return hasDupe;
//	}
}
