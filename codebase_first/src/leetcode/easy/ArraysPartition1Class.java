package leetcode.easy;

import java.util.Arrays;

public class ArraysPartition1Class {

	public static void main(String[] args) {
		Solution20 sol = new Solution20();
		System.out.println("results = "+sol.arrayPairSum(new int[] {1,4,2,3}));

	}

}

class Solution20{
	public int arrayPairSum(int[] nums) {
        
		int sumOfMin = 0;
		if(nums.length>0){
			Arrays.sort(nums);
			
			for(int i=0;i<nums.length;i=i+2){
				sumOfMin += nums[i];
			}
		}
		
		return sumOfMin;		
    }
}
