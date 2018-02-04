package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortestWordDistance2 {

	public static void main(String[] args) {

	}

}

//93.93%
class WordDistance {
	String[] words;
	Map<String, List<Integer>> map = new HashMap<>();
	
    public WordDistance(String[] words) {
        this.words = words;
        
        for(int i=0;i<words.length;i++){
        	if(map.containsKey(words[i])){
        		List<Integer> list = map.get(words[i]);
        		list.add(i);
        		map.put(words[i], list);
        	}
        	else{
        		List<Integer> list = new ArrayList<>();
        		list.add(i);
        		map.put(words[i], list);
        	}
        }
    }
    
    public int shortest(String word1, String word2) {
        int distance = Integer.MAX_VALUE;
        
        List<Integer> list1 = map.get(word1);
        List<Integer> list2 = map.get(word2);
        
        
        for(int i1 : list1){
        	for(int i2: list2){
        		if(distance>Math.abs(i1-i2)){
        			distance = Math.abs(i1-i2);
        		}
        	}
        }
        
        return distance;
    }
}