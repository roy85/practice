package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReverseVowels {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		System.out.println("reverse vowel of 'hello' = "+sol.reverseVowels("hello"));
		System.out.println("reverse vowel of 'vowel' = "+sol.reverseVowels("vowel"));
		System.out.println("reverse vowel of 'vowtel' = "+sol.reverseVowels("vowtel"));
		System.out.println("reverse vowel of 'voibbbbruuicadaraawel' = "+sol.reverseVowels("voibbbbruuicadaraawel"));
		System.out.println("reverse vowel of 'aA' = "+sol.reverseVowels("aA"));

	}

}

class Solution13{
	public String reverseVowels(String s) {
        
		StringBuilder SB = new StringBuilder(s);

		Set<Character> vowelSet = new HashSet<>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('E');
		vowelSet.add('I');
		vowelSet.add('O');
		vowelSet.add('U');
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++){
			if(vowelSet.contains(s.charAt(i))){
				list.add(i);
			}
		}
		
		for(int L=0, R=list.size()-1;L<list.size();L++,R--){
			SB.setCharAt(list.get(L), s.charAt(list.get(R)));
		}
		
		
		return new String(SB);		
    }
}


class Solution12{
	public String reverseVowels(String s) {
        
		StringBuilder SB = new StringBuilder(s);

		Set<Character> vowelSet = new HashSet(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++){
			if(vowelSet.contains(s.charAt(i))){
				list.add(i);
			}
		}
		
		for(int L=0, R=list.size()-1;L<list.size();L++,R--){
			SB.setCharAt(list.get(L), s.charAt(list.get(R)));
		}
		
		
		return new String(SB);		
    }
}


class Solution11{
	public String reverseVowels(String s) {
        
		StringBuilder returnSB = new StringBuilder(s);

		Set<Character> vowelSet = new HashSet(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
		List<Integer> vowelLocList = new ArrayList<>();
		
		for(int i=0;i<s.length();i++){
			if(vowelSet.contains(s.charAt(i))){
				vowelLocList.add(i);
			}
		}
		
		for(int L=0, R=vowelLocList.size()-1; L<R; L++,R--){
			returnSB = swap(returnSB, vowelLocList.get(L), vowelLocList.get(R));
		}
		
		return new String(returnSB);		
    }

	private StringBuilder swap(StringBuilder returnSB, int l, int r) {
		char temp = returnSB.charAt(r);
		returnSB.setCharAt(r, returnSB.charAt(l));
		returnSB.setCharAt(l, temp);
		return returnSB;
	}
}


class Solution10{
	public String reverseVowels(String s) {
        
		StringBuilder returnSB = new StringBuilder();
				
		Set<Character> vowelSet = new HashSet(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
		Set<Integer> vowelLocSet = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			if(vowelSet.contains(s.charAt(i))){
				vowelLocSet.add(i);
			}
		}
		
		Iterator<Integer> iter = vowelLocSet.iterator();//get iterator on LinkedHashSet - which is maintaining order of insertion
		
		for(int i=s.length()-1;i>=0;i--){
			if(vowelLocSet.contains(i)){
				returnSB = returnSB.append(s.charAt(iter.next()));
			}
			else{
				returnSB = returnSB.append(s.charAt(i));
			}
		}
		
		
		return new String(returnSB.reverse());		
    }
}

class Solution9{
	public String reverseVowels(String s) {
        
		StringBuilder returnSB = new StringBuilder();
		
		Map<Integer, Character> vowelMap = new HashMap<>();
		Set<Character> vowelSet = new HashSet(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
		
		for(int i=0;i<s.length();i++){
			if(vowelSet.contains(s.charAt(i))){
				vowelMap.put(i, s.charAt(i));
			}
		}
				
		List<Integer> indexList = new ArrayList<>(vowelMap.keySet());
		Collections.sort(indexList);//sorted in ascending order
		
		int listIndex=0;//index of vowel position to be retrieved from list.
		int vowelPosition=0;//index of char in map. Value of map's key
		
		for(int i=s.length()-1;i>=0;i--){
			if(vowelMap.containsKey(i)){
				vowelPosition = indexList.get(listIndex);
				returnSB = returnSB.append(vowelMap.get(vowelPosition));
				listIndex++;
			}
			else{
				returnSB = returnSB.append(s.charAt(i));
			}
		}
		
		
		return new String(returnSB.reverse());		
    }
}