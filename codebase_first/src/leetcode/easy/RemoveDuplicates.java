package leetcode.easy;

import java.util.Arrays;

/*
 * Repeat.
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
//		System.out.println(removeDuplicates(new int[] {0,0,0,1,2,3,4}));
//		System.out.println(removeDuplicates(new int[] {}));
//		System.out.println(removeDuplicates(new int[] {0}));
//		System.out.println(removeDuplicates(new int[] {0,0}));
		System.out.println(removeDuplicates(new int[] {0,0,0,0,0,0}));
//		System.out.println(removeDuplicates(new int[] {0,0,0,1,0,2,0,3,0,4,0}));
//		System.out.println(removeDuplicates(new int[] {0,0,0,1,0,2,0,3,0,4,0}));
//		System.out.println(removeDuplicates(new int[] {0,0,0,1,0,2,0,3,0,4,0}));
//		System.out.println(removeDuplicates(new int[] {1,2,3}));
//		System.out.println(removeDuplicates(new int[] {1,2,1,2,1,2,3,3}));
	}

	//Copied from articles.
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) return 0;
		
		int i=0;
		for(int j=i+1;j<nums.length;j++){
			if(nums[i]!=nums[j]){
				i++;
				nums[i] = nums[j];
			}
		}
				
		System.out.println(Arrays.toString(nums));
		return i+1;
	}


	
//	public static int removeDuplicates(int[] nums) {
//		int newLength=nums.length;
//
//		for(int i=0;i<newLength;i++){
//			for(int j=0;j<newLength;j++){
//				if(nums[i]==nums[j] && i!=j){
//					int x=j;
//					for(int k=x+1;k<newLength;k++, x++){
//						int temp = nums[k];
//						nums[k] = nums[x];
//						nums[x] = temp;
//					}
//					newLength--;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(nums));
//		return newLength;
//	}
	
//	public static int removeDuplicates(int[] nums) {
//		int newLength=nums.length-1;
////		int k=0;
//		for(int i=0;i<=newLength;i++){
//			for(int j=0;j<=newLength;j++){
//				if(nums[i]==nums[j] && i!=j){
//					int k=j;
//					for(int x=k+1;x<nums.length;x++,k++){						
//						nums[k]=nums[x];						
//					}
//					newLength--;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(nums));
//		return newLength;
//	}
}
