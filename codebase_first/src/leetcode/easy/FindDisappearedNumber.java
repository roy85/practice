package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumber {

	public static void main(String[] args) {
		List<Integer> list = findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
		for(int n: list){
			System.out.println(n);
		}
	}
	
	/*
	 * TODO: init array 0....n-1
	 * loop thru nums. if arr[nums[i]]==1, set to 0.
	 * loop thru arr. if element ==1, thats the missing number.
	 */
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int n = nums.length;
		
		Arrays.sort(nums);
		
		
		for(int i=0;i<nums.length;i++){
			if(!list.contains(nums[i])){
				list.add(nums[i]);
			}
		}
		
		nums = new int[list.size()];
		for(int i=0;i<list.size();i++){
			nums[i]=list.get(i);
		}
		list.clear();
		
		for(int i=1;i<=n;){
			//to add all nums greater than the max number in nums, if the max of array is a disappeared number,
			//and hence not in the nums array.
			if(i>nums.length){
				list.add(i);
				i++;
			}
			else if(nums[i-1]==i){//if number matches.
				i++;
				if(list.contains(nums[i])){
					list.remove(new Integer(i));
				}
			}
			else if(nums[i-1]>i){
				int n1 = nums[i-1];
				for(int j=i;j<=n1;j++){
					list.add(i);
					i++;
				}
			}
			
		}
		
		
//		for(int i=1;i<=nums.length;){
//			if(nums[i-1]==i){
//				i++;
//			}
//			else if(nums[i-1]>i){//1,1,3,4
//				for(int j=i;j<=nums[i-1];j++){
//					list.add(j);
//				}
//			}
//			else if(nums[i-1]<i && !list.contains(i)){
//				list.add(i);
//			}
//			else if(nums[i-1]<i && list.contains(i)){
//				list.remove(new Integer(i));
//				i++;
//			}
//		}
		
		return list;
	}

}
