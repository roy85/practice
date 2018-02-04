package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
//		int[] arr = new int[]{0,1,0,3,12};
		int[] arr = new int[]{0,0,0,1};
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void moveZeroes(int[] nums){
		int numberOfZeroes=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				numberOfZeroes++;
			}
			else{
				nums[i-numberOfZeroes]=nums[i];
				if(numberOfZeroes>0)
					nums[i]=0;
			}
		}
	}
	
//	private static void moveZeroes(int[] nums){
//		int numberOfZeroes=0;
//		for(int i=nums.length-2;i>=0;i--){
//			if(nums[i]==0){
//				numberOfZeroes++;
//				for(int j=i;j<nums.length-numberOfZeroes;j++){
//					nums[j] = nums[j+1];
//				}
//				nums[nums.length-numberOfZeroes] = 0;
//			}
//		}
//	}
}
