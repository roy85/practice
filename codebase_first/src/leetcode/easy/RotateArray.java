package leetcode.easy;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		rotate(new int[]{-1}, 2);
		rotate(new int[]{1,2,3,4,5,6,7}, 3);
	}

	public static void rotate(int[] nums, int k) {
		if(k<0)
			return;
		
		k = k%nums.length;
		
		int n[] = Arrays.copyOfRange(nums, nums.length-k, nums.length);
		int n2[] = Arrays.copyOfRange(nums, 0, nums.length-k);

		for(int i=0;i<nums.length;i++){
			if(i<n.length)
				nums[i] = n[i];
			else
				nums[i] = n2[i-n.length];
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
