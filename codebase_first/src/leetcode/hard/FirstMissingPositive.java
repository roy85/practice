package leetcode.hard;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] {}));
		System.out.println(firstMissingPositive(new int[] {0}));
		System.out.println(firstMissingPositive(new int[] {1,2,0}));
		System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
		System.out.println(firstMissingPositive(new int[] {-1,1,-2,2,9}));
		System.out.println(firstMissingPositive(new int[] {5,6,7}));
		System.out.println(firstMissingPositive(new int[] {1,2,3,4}));
	}

	//18.38%
	public static int firstMissingPositive(int[] nums) {
		
		Map<Integer, Boolean> map = new HashMap<>();
		for(int i=1;i<=nums.length;i++){
			map.put(i,false);
		}
		
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]) && !map.get(nums[i]))
				map.put(nums[i], true);
		}
		
		for(int i=1;i<=nums.length;i++){
			if(!map.get(i))
				return i;
		}
		
		return nums.length+1;
	}
}
