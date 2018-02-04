package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
//		int arr[] = new int[] {3,2,2,3};
		int arr[] = new int[]{};
		System.out.println(removeElement(arr,3));
//		System.out.println(Arrays.toString(arr));
	}

	public static int removeElement(int[] nums, int val) {
		int x=0;
		if(nums==null || nums.length==0)
			return -1;
				
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				x++;
			}
			else if(x>0){
				nums[i-x]=nums[i];
			}
		}
		
		return nums.length-x;
	}
}
