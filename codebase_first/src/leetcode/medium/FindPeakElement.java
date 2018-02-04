package leetcode.medium;

public class FindPeakElement {

	public static void main(String[] args) {
		System.out.println(findPeakElement(new int[]{1,2,3,1}));
		System.out.println(findPeakElement(new int[]{1,2}));
		System.out.println(findPeakElement(new int[]{2,2}));
		System.out.println(findPeakElement(new int[]{1,2,3,45,5}));
		System.out.println(findPeakElement(new int[]{1,22,3,45,5}));
		System.out.println(findPeakElement(new int[]{1,2,3}));
	}

	public static int findPeakElement(int[] nums){
		if(nums==null || nums.length==0) return Integer.MIN_VALUE;
		
		if(nums.length==1) return 0;
		if(nums.length==2) return nums[0]>nums[1]? 0 : 1;
		
		boolean flag = true;
		for(int i=0;i<nums.length-1;i++){
			if(flag && nums[i]>nums[i+1])
				return i;
			else if (flag && i==nums.length-2)
				return i+1;
			if(nums[i]>nums[i+1]){
				flag=false;
			}
			else if (!flag && nums[i]<nums[i+1]){
				flag=true;
			}
		}
		return Integer.MIN_VALUE;
	}
}
