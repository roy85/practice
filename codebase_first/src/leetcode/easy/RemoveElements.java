package leetcode.easy;

import java.util.Arrays;

public class RemoveElements {

	public static void main(String[] args) {
		System.out.println(removeElement(new int[]{3,2,2,3},3));
		System.out.println(removeElement(new int[]{},3));
		System.out.println(removeElement(new int[]{0},3));
		System.out.println(removeElement(new int[]{3},3));
		System.out.println(removeElement(new int[]{3,3},3));
		System.out.println(removeElement(new int[]{3,3,3,3,3,3},3));
		System.out.println(removeElement(new int[]{1,2,2,4},3));
		System.out.println(removeElement(new int[]{1,2,2,4,3,3,3,3},3));
	}
	
	//43.82%
	public static int removeElement(int[] nums, int val) {
		int newLength=nums.length;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				newLength--;
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				for(int j=nums.length-1;j>i;j--){
					if(nums[j]!= val){
						nums[i]=nums[j];
						nums[j] = val;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return newLength;
	}

}
