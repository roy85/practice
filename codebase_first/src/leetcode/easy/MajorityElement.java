package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Improve
 */
public class MajorityElement {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {1,2,3,3,2,2,5,5,5,3,3,3,5}));
	}

	/*
	 * Maybe merge the 2nd loop to get majValue and majIndex during first loop?
	 */
	//16.xx%
	public static int majorityElement(int[] nums) {
		int maj=Integer.MIN_VALUE;
		int majValue=Integer.MIN_VALUE;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))
			{
				int x = map.get(nums[i])+1;
				
				map.put(nums[i], x);				
			}
			else
				map.put(nums[i], 1);
		}
		
		for(int n : map.keySet()){
			if(maj<map.get(n)){
				
				maj = map.get(n);
				majValue = n;
				
				if(maj>Math.floor(nums.length/2))
					return majValue;
			}				
		}
		
		return majValue;
	}
	
	//25.51%
//	public static int majorityElement(int[] nums) {
//		int maj=Integer.MIN_VALUE;
//		int majValue=Integer.MIN_VALUE;
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++){
//			if(map.containsKey(nums[i]))
//				map.put(nums[i], map.get(nums[i])+1);
//			else
//				map.put(nums[i], 1);
//		}
//		
//		for(int n : map.keySet()){
//			if(maj<map.get(n)){
//				maj = map.get(n);
//				majValue = n;
//			}				
//		}
//		
//		return majValue;
//	}
}
