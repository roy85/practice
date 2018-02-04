package leetcode.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
		System.out.println(searchInsert(new int[] {1,3,5,6}, 7));
		System.out.println(searchInsert(new int[] {1,3,5,6}, 0));
		System.out.println(searchInsert(new int[] {}, 0));
		System.out.println(searchInsert(new int[] {0}, 0));
		System.out.println(searchInsert(new int[] {1}, 0));
		System.out.println(searchInsert(new int[] {0}, 1));
	}

	//32.16%
	public static int searchInsert(int[] nums, int target) {
		
		if(nums==null || nums.length==0) return 0;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==target){
				return i;
			}
			if(nums[i]<target && (i+1<nums.length) && nums[i+1]>target){
				return i+1;
			}
			if(nums[i]>target){
				return i;
			}
		}

		return nums.length;
	}
}
