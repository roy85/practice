package leetcode.easy;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(Solution33.missingNumber(new int[]{0,1,3}));
//		System.out.println(Solution33.missingNumber(new int[]{51,52,53,59}));
		System.out.println(Solution33.missingNumber(new int[]{0}));
		System.out.println(Solution33.missingNumber(new int[]{1}));
		System.out.println(Solution33.missingNumber(new int[]{2}));
		System.out.println(Solution33.missingNumber(new int[]{0,1,2,3,4,5,6}));
	}

}

class Solution33{
    
    //13ms. Slow.
    public static int missingNumber(int[] nums) {
        int ret =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
        	if(i!=nums[i]){
        		return i;
        	}
        }        
        if(ret==0){
        	ret = nums[nums.length-1]+1;
        }
        return ret;
    }
}