package leetcode.medium;

public class MaxProductSubArray {

	public static void main(String[] args) {
		System.out.println(maxProduct(new int[]{2,3,-2,4}));
		System.out.println(maxProduct(new int[]{-2,3,-4}));
		System.out.println(maxProduct(new int[]{9,0,8,-1,-2,-2,6}));
	}

	//Another solution using dp at: http://www.geeksforgeeks.org/maximum-product-subarray/
	
	//http://blog.akinyeleolubodun.com/leetcode-maximum-product-subarray.html
	//98.86% - copied
	public static int maxProduct(int[] nums) {
		if(nums==null || nums.length==0)
			return 0;
		
		int max = 1;
		int leftToRightMax = nums[0];
		int rightToLeftMax = nums[0];
		
		for(int i=0;i<nums.length;i++){
			max *= nums[i];
			if(max>leftToRightMax)
				leftToRightMax = max;
			
			if(max==0)
				max = 1;
		}
		max = 1;
		for(int i=nums.length-1;i>=0;i--){
			max *= nums[i];
			if(max>rightToLeftMax)
				rightToLeftMax=max;
			
			if(max==0)
				max=1;
		}
		
		return Math.max(leftToRightMax, rightToLeftMax);
	}
	
	//Solution for non-contiguous array max product
//	public static int maxProduct(int[] nums) {
//		if(nums==null || nums.length==0)
//			return 0;
//		
//		int product = nums[0];
//		int max = nums[0];
//		
//		for(int i=1;i<nums.length;i++)
//		{
//			product = Math.max(product, product*nums[i]);
//			max = Math.max(max, product);
//		}
//		
//		return max;
//	}
}
