package leetcode.easy;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{1,0,1}));
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{1}));
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{0}));
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{1,0}));
		System.out.println(Solution44.findMaxConsecutiveOnes(new int[]{0,1}));
	}

}

class Solution44{
	public static int findMaxConsecutiveOnes(int[] nums) {
		int ret=0;
		int temp=0;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				if(temp>0 && temp>ret){
					ret=temp;
				}
				temp=0;
				continue;
			}
			if(nums[i]==1){
				temp++;
			}
		}
		if(temp>ret){
			ret=temp;
		}
		
		return ret;
	}
}