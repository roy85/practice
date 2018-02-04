package leetcode.medium;

import java.util.Arrays;

public class SearchForARange {

	public static void main(String[] args) {
		int[] arr = searchRange(new int[] {7,8,8,8,9,10},8);
		System.out.println(arr.length);
//		Arrays.toString(searchRange(new int[] {7,8,8,8,9,10},8));
	}

	public static int[] searchRange(int[] nums, int target) {
		int x=-1, y=-1;
		
		int start =0;
		int end = nums.length-1;
		
		while(x<0 && start<end){
			int mid = start+(end-start)/2;
			if(end-mid==1)
			{
				x=end;break;
			}
			
			if(nums[mid]<target){
				start=mid+1;
			}
			else if(nums[mid]>=target)
				end = mid;
		}
		
		start=0;
		end = nums.length-1;
		
		while(y<0 && start<end)
		{
			int mid = start+(end-start)/2;
			if(end-mid==1)
			{
				y=end;break;
			}
			
			if(nums[mid]>target){
				end = mid;
			}
			else
				start=mid+1;
		}
		return new int[] {x,y};
	}
}
