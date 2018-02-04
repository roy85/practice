package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterSum {

	public static void main(String[] args) {
		Solution17 sol = new Solution17();
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] nums = sol.nextGreaterElement(nums1, nums2);
		System.out.println("Returned array = "+Arrays.toString(nums));
	}

}

class Solution17{
	public int[] nextGreaterElement(int[] nums1, int[] nums2){
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums2.length;i++){
			map.put(nums2[i], i);
		}
				
		int[] nums3 = new int[nums1.length];
		
		for(int j=0;j<nums1.length;j++){
			int number = nums1[j];
			for(int i=map.get(number)+1;i<nums2.length;i++){
			
				nums3[j] = nums2[i]>number ? nums2[i] : -1;
			
			}
		}
		
		return nums3;
	}
}