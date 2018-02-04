package leetcode.medium;

/*
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

//https://discuss.leetcode.com/topic/2031/challenge-me-thx/17
//https://discuss.leetcode.com/topic/2031/challenge-me-thx/8
//https://discuss.leetcode.com/topic/2031/challenge-me-thx
public class SingleNumber2 {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{2,3,3,3,4,4,4,5,5,5}));
//		System.out.println(singleNumber(new int[]{2}));
	}	

	public static int singleNumber(int[] nums){
		int x = 0;
		for(int i=0;i<nums.length-2;){
			if(nums[i]!=nums[i+1] && nums[i]!=nums[i+2])
				return nums[i];
			i+=3;
		}
		
		return x;
	}
}
