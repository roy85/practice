package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
//		int[] result = intersection(new int[] {1,2,2,1,3}, new int[] {3,2,2});
//		int[] result = intersection(new int[] {1,2,2,1}, new int[] {2,2});
//		int[] result = intersection(new int[] {1,2,2,1,3}, new int[] {4});
//		int[] result = intersection(new int[] {1,2,2,1,3}, new int[] {});
		int[] result = intersection(new int[] {}, new int[] {});
		
		if(result ==null || result.length==0)
			System.out.println("result is null");
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"\t");
		}
	}
	
	//6.64%
	public static int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<nums1.length;i++){
			for(int j=0;j<nums2.length;j++){
				if(nums1[i]==nums2[j] && !list.contains(nums2[j])){
					list.add(nums2[j]);
				}
			}
		}
		
		int retArr[] = new int[list.size()];
		for(int i=0;i<list.size();i++){
			retArr[i] = list.get(i);			
		}
		
		return retArr;
	}
}
