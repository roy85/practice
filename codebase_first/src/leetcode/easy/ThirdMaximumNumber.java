package leetcode.easy;

public class ThirdMaximumNumber {

	public static void main(String[] args) {

	}

	public static int thirdMax(int[] nums) {
		int n1=Integer.MIN_VALUE,n2=Integer.MIN_VALUE,n3=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>n1){
				n1 = nums[i];
			}			
			
			
			
		}
		
		return n3==Integer.MIN_VALUE? n1 : n3;
	}
}
