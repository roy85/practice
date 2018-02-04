package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.
 */
public class GroupAnagrams {

	public static void main(String[] args) {
		List<List<String>> ret = groupAnagrams(new String[]{"tae","tan","ate","nat","eat"});
		System.out.println("ret="+ret);
		for(List<String> list : ret){
			System.out.println(list.toString());
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs){
		List<List<String>> retList = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();	
		
		for(String s : strs){
			char[] sArr = s.toCharArray();
			Arrays.sort(sArr);
			String temp = new String(sArr);
			if(map.containsKey(temp)){
				map.get(temp).add(s);
			}
			else{
				List<String> newList = new ArrayList<>();
				newList.add(s);
				map.put(temp, newList);
			}
		}
		
		for(String key : map.keySet()){
			retList.add(map.get(key));
		}
		
		return retList;
	}
}
