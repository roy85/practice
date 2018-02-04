package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Incomplete
 */
public class ContainsDuplicate2 {

	public static void main(String[] args) {
//		System.out.println(containsNearbyDuplicate(new int[] {1,2,3,1,4,5,6}, 1));
//		System.out.println(containsNearbyDuplicate(new int[] {2,5,3,2,4,5,6}, 3));
//		System.out.println(containsNearbyDuplicate(new int[] {2,5,3,2,4,5,2}, 6));
//		System.out.println(containsNearbyDuplicate(new int[] {2,5,3,2,4,5,2}, 7));
//		System.out.println(containsNearbyDuplicate(new int[] {99,99}, 2));
		System.out.println(containsNearbyDuplicate(new int[] {99,99}, 3));
//		System.out.println(containsNearbyDuplicate(new int[] {2,3,2,2,4,5,6}, 2));
//		System.out.println(containsNearbyDuplicate(new int[] {2,3,2,4,5,6}, 2));
	}

	//26.85% - https://leetcode.com/problems/contains-duplicate-ii/#/solution
	//https://discuss.leetcode.com/topic/15305/simple-java-solution
//	public boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (set.contains(nums[i])) return true;
//            set.add(nums[i]);
//            if (set.size() > k) {
//                set.remove(nums[i - k]);
//            }
//        }
//        return false;
//    }
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		
		
		int left=0,right=0;
		
		for(int j=0;j<nums.length;j++){
			left = j;
			for(int i=1;i<=k && j+i<nums.length;i++){
				right = left+i;
				int diff = Math.abs(nums[left]-nums[right]);
				if(diff==0)
					return true;
			}
		}
		
		return false;
	}
	
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		List<Integer> list = new ArrayList<>();
//		for(int i=0;i<nums.length;i++){
//			for(int j=0;j<nums.length;j++){
//				if(i!=j && nums[i]==nums[j]){
//					
//				}
//			}
//		}
//		
//		for(int i=0;i<list.size();i++){
//			for(int j=0;j<list.size();j++){
//				if(i!=j && Math.abs(list.get(i)-list.get(j))<=k){
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}

	
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		List<Integer> list = new ArrayList<>();
//		for(int i=0;i<nums.length;i++){
//			if(nums[i]==k)
//				list.add(i);
//		}
//		
//		for(int i=0;i<list.size();i++){
//			for(int j=0;j<list.size();j++){
//				if(i!=j && Math.abs(list.get(i)-list.get(j))<=k){
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}

	
//	public static boolean containsNearbyDuplicate(int[] nums, int k) {
//		
//		int x=-1,y=-1;
//		for(int i=0;i<nums.length;i++){
//			if(nums[i]==k){
//				if(x==-1)
//					x=i;
//				else
//					y=i;
//			}
//		}
//		
//		if(y-x<=k)
//			return true;
//		
//		return false;
//	}
}
