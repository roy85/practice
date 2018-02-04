package leetcode.easy;

import java.util.Arrays;

/*
 * 8.38% Repeat.
 */
public class MoveZeroes {

	public static void main(String[] args) {
		moveZeroes(new int[] {0,1,0,2,3,4});
		moveZeroes(new int[] {});
		moveZeroes(new int[] {1});
		moveZeroes(new int[] {0});
		moveZeroes(new int[] {0,0,0});
		moveZeroes(new int[] {1,2,3});
		moveZeroes(new int[] {1,2,3,0});
		moveZeroes(new int[] {0,0,0,1,2,3,4});
		moveZeroes(new int[] {0,0,0,1,0,2,0,3,0,4,0});
	}

	
	//{0,0,0,1,2,3,4}
	public static void moveZeroes(int[] nums) {
		for(int i=0;i<nums.length;i++){
			
			if(nums[i]==0){
			
				
				for(int k=i+1;k<nums.length;k++){
					if(nums[k]!=0){
						nums[i]=nums[k];
						nums[k]=0;
						break;
					}
				}
			}			
		}
		System.out.println(Arrays.toString(nums));
	}
}