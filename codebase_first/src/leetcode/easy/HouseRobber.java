package leetcode.easy;

public class HouseRobber {

	public static void main(String[] args) {
//		System.out.println(rob(new int[]{8,4,1,5,3,7}));
//		System.out.println(rob(new int[]{1}));
//		System.out.println(rob(new int[]{1,4,2}));
//		System.out.println(rob(new int[]{1,2,3}));
		System.out.println(rob(new int[]{2,1,1,2}));
//		System.out.println(rob(new int[]{1,1,1}));//--fails for this one
	}

	public static int rob(int[] nums) {
		
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		if(nums.length==2)
			return Math.max(nums[0], nums[1]);

		int excl=0;
		int incl = 0;
		
		for(int i=0;i<nums.length;i++){
			int temp = incl;
			incl = Math.max(incl, excl+nums[i]); 
			excl = temp;
		}		
		
		return Math.max(incl, excl);
	}

}
