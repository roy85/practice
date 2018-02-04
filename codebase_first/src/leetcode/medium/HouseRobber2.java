package leetcode.medium;

public class HouseRobber2 {

	public static void main(String[] args) {
//		System.out.println(rob(new int[]{8,4,1,5,3,7}));
//		System.out.println(rob(new int[]{1}));
//		System.out.println(rob(new int[]{1,4,2}));
		System.out.println(rob(new int[]{1,2,3}));
//		System.out.println(rob(new int[]{1,1,1}));--fails for this one
	}

	//63.23% - 0ms!!
	public static int rob(int[] nums) {
		
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		if(nums.length==2)
			return Math.max(nums[0], nums[1]);
		
		int totalSum0=0, totalSum1=0;
		
		int excl=0;
		int incl = 0;
		
		for(int i=0;i<nums.length-1;i++){
			int temp = incl;
			incl = Math.max(incl, excl+nums[i]); 
			excl = temp;
		}		
		totalSum0 = Math.max(incl, excl);
		
		excl=0;
		incl = 0;
		
		for(int i=1;i<nums.length;i++){
			int temp = incl;
			incl = Math.max(incl, excl+nums[i]); 
			excl = temp;
		}
		totalSum1 = Math.max(incl, excl);
					
		return Math.max(totalSum0, totalSum1);
	}

}
