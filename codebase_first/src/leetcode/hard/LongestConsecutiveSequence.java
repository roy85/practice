package leetcode.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] {1,3,8,14,4,10,2,11}));
	}

	public static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int len = 0;
				
		for(int i : nums)
		{
			set.add(i);
		}
		
		for(int x : nums){
			if(!set.contains(x-1))
			{
				int temp = x;
				while(set.contains(temp))
				{
					temp++;
				}
				
				if(len < (temp-x))
				{
					len = temp-x;
				}
			}
		}
		
		return len;
	}
	
	//TLE
//	public static int longestConsecutive(int[] nums) {
//		
//		List<Integer> list = new ArrayList<>();
//		List<List<Integer>> finalSets = new ArrayList<>();
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		//add all entries to map
//		for(int i : nums){
//			map.put(i, i);
//		}
//		//for each entry in array
//		for(int i=0;i<nums.length;i++){
//			int x = nums[i];
//			List<Integer> newSeq = new ArrayList<>();
//			if(!list.contains(x))//if the number exists already in list->means is part of another sequence
//			{
//				list.add(x);//add to list to indicate the number is now part of another sequence
//				newSeq.add(x);//begin the sequence
//			}
//			else
//				continue;//then move onto next number.
//			
//			//loop to check preceding numbers in map
//			while(true){
//				if(map.containsKey(x-1))//if x-1 is in map, add it to list and newSeq - at the start.
//				{
//					x=x-1;//new x = x-1;
//					list.add(x);
//					newSeq.add(0, x);
//				}
//				else
//					break;
//			}
//			
//			//loop to check successive numbers in map
//			while(true){
//				if(list.contains(x+1))//x is already part of current sequence
//					x=x+1;//new x
//				else if(map.containsKey(x+1)){//if map contains x+1, add it to list and newSeq.
//					x=x+1;
//					list.add(x);
//					newSeq.add(x);
//				}
//				else
//					break;
//			}
//			finalSets.add(newSeq);//add the sequence in this iteration to finalSeq.
//		}
//		
//		int maxLength=0;
//		for(List<Integer> l : finalSets){
//			if(l.size()>maxLength)
//				maxLength = l.size();
//		}
//		
//		return maxLength;
//	}
}
