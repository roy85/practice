package leetcode.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://discuss.leetcode.com/topic/8125/concise-o-n-2-java-solution
/*
 * The idea is to sort an input array and then run through all indices of a possible first element of a triplet. 
 * For each possible first element we make a standard bi-directional 2Sum sweep of the remaining part of the array. 
 * Also we want to skip equal elements to avoid duplicates in the answer without making a set or smth like that.
 */
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution4{
	
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>(); 
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
               }
            }
        }
        return res;
    }
	
//	public List<List<Integer>> threeSum(int[] nums) {
//		int v1, v2, v3=0;
//		List<List<Integer>> results = new ArrayList<>();
//		
//		List<Integer> res = new ArrayList<>();
//		
//		Set<Integer> resSet = new HashSet<>();
//		//Map<Integer, Integer> mapAll = new HashMap<>();
//		
//		int difference = 0;
//		
//		for(int i=0;i<nums.length;i++){
//			v1=nums[i];
//			res.add(v1);
//			
//			for(int j=i+1;j<nums.length;j++){
//				v2 = nums[j];
//				if(resSet.contains(v1) && resSet.contains(v2)){
//					//move on to the next v1,v2 combo since unique requirement
//					continue;
//				}
//				
//				difference = 0- (v1+v2);
//				
//				if()
//			}
//		}
//		
//		throw new IllegalArgumentException("No 3Sum solution found");
//    }
}