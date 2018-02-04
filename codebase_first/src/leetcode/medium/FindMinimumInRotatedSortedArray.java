package leetcode.medium;
/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(findMin(new int[]{1,2,3,4,5}));
		System.out.println(findMin(new int[]{2,3,4,5,1}));
		System.out.println(findMin(new int[]{3,4,5,2}));
		System.out.println(findMin(new int[]{1,1,1}));
	}

	public static int findMin(int[] nums){
		int n = nums.length;
		if(nums==null || nums.length==0) return Integer.MIN_VALUE;
		
		int min = nums[0];
		
		
		for(int i=1;i<n;i++){
			if(nums[i]<min)
				min = nums[i];
		}
		
		return min;
	}
}
