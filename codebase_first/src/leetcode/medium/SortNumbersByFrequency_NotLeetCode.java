package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortNumbersByFrequency_NotLeetCode {

	public static void main(String[] args) {

	}

	public static List<Integer> sortNumbersByFreq(List<Integer> listIn){
		List<Integer> retList = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : retList){
			if(!map.containsKey(num)){
				map.put(num, 0);
			}
			map.put(num, map.get(num)+num);
		}
		
		
		return retList;
	}
}
