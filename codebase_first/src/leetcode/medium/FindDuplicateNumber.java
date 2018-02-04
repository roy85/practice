package leetcode.medium;

/*
 * Incomplete
 */
public class FindDuplicateNumber {

	public static void main(String[] args) {
//		System.out.println(findDuplicate(new int[] {1,2,3,4,5,5,6,7,8,9,10}));
		System.out.println(findDuplicate(new int[] {1,2,3,4,5,7,6,7,8}));
//		System.out.println(findDuplicate(new int[] {1}));
//		System.out.println(findDuplicate2(new int[] {1,2,3}));
	}

	public static int findDuplicate2(int[] nums) {
		
		if(nums.length==1){
			return 0;
		}
		
		int x=0;
		
		
		
		return 0;
	}

	
	public static int findDuplicate(int[] nums) {
		
		if(nums.length==1){
			return 0;
		}
		
		int expected_sum = (nums.length-1)*(nums.length)/2;
		int actual_sum = 0;
		
		for(int i=0;i<nums.length;i++){
			actual_sum+=nums[i];
		}		
		
		return actual_sum-expected_sum;
	}
}
