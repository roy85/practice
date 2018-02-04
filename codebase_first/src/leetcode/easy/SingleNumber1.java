package leetcode.easy;

import java.util.Arrays;

public class SingleNumber1 {

	public static void main(String[] args) {
//		int nums[] = {1,0,1};
//				int nums[] = {1,1,3,3,2,2,5,5,7,7};
//				int nums[] = {4,1,1,3,3,2,5,5,7,7};
//				int nums[] = {4,1,1,3,3,5,5,7,7};
//		int nums[] = {3};
//		int nums[] = {1,1,5,2,2};
		int nums[] = {1,1,5};
		System.out.println(Solution217.singleNumber(nums));
	}

}

class Solution217{
	
//    public static int singleNumber(int[] nums) {
//    	int ret=0;
//    	
//    	
//    	
//    	return ret;
//    }
	
	public static int singleNumber(int[] nums) {
		int x = 0;
		for (int a : nums) {
			x = x ^ a; System.out.println(x);
		}
		return x;
	}
	
//    public static int singleNumber(int[] nums) {
//        int ret=nums.length == 1? nums[0]:-1;
//        Arrays.sort(nums);
//        for(int i=1;i<nums.length;i++){
//        	if(i%2!=0){
//        		//compare
//        		if(nums[i]!=nums[i-1]){
//            		ret = nums[i-1];
//            		break;
//        		}
//        		
//        	}
//        	
//        	if((i == (nums.length-1)) && (i%2==0)){
//        		ret = nums[i];
//        	}
//        }        
//        return ret;
//    }
}


