package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
//		System.out.println(wordPattern("abba", "dog cat cat dog"));
//		System.out.println(wordPattern("abba", "dog cat cat fish"));
//		System.out.println(wordPattern("aaaa", "dog cat cat dog"));
//		System.out.println(wordPattern("abba", "dog dog dog dog"));
//		System.out.println(wordPattern("abba", "dog cat cat"));
//		System.out.println(wordPattern("aba", "dog cat cat dog"));
//		System.out.println(wordPattern("aba", "dog cat cat"));
		System.out.println(wordPattern("", ""));
	}

	//38.45%
	public static boolean wordPattern(String pattern, String str) {
		
		if(pattern!=null && str!=null){
			if(pattern.length()==0 && str.length()==0){
				return true;
			}
			
			char pArr[] = pattern.toCharArray();
			String sArr[] = str.split(" ");
			
			if(pArr.length == sArr.length){
				Map<Character, String> mapP = new HashMap<>();
				Map<String, Character> mapS = new HashMap<>();
				
				for(int i=0;i<pArr.length;i++){
					if(mapP.containsKey(pArr[i])){
						if(!mapP.get(pArr[i]).equals(sArr[i])){
							return false;
						}
					}
					else if(mapS.containsKey(sArr[i])){
						if(mapS.get(sArr[i])!=pArr[i]){
							return false;
						}
					}
					else{
						mapS.put(sArr[i], pArr[i]);
						mapP.put(pArr[i], sArr[i]);
					}
				}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		return true;
	}
}
