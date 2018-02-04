package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "bab"));
		System.out.println(isIsomorphic("egg", "babe"));
		System.out.println(isIsomorphic("egg", "bac"));
		System.out.println(isIsomorphic("eggjactly", "rereabab"));
		System.out.println(isIsomorphic("egge", "nqqr"));
		System.out.println(isIsomorphic("egge", "nqqn"));
		System.out.println(isIsomorphic("", ""));
		System.out.println(isIsomorphic("paper", "title"));
		System.out.println(isIsomorphic("ab", "aa"));
		System.out.println(isIsomorphic("aa", "ab"));
	}

	//65.59%
	public static boolean isIsomorphic(String s, String t) {
		
		if(s!=null && t!=null && s.length()==t.length()){
			char sArr[] = s.toCharArray();
			char tArr[] = t.toCharArray();
			Map<Character, Character> mapS = new HashMap<>();
			Map<Character, Character> mapT = new HashMap<>();
			
			for(int i=0;i<sArr.length;i++){
				if(mapS.containsKey(sArr[i])){
					if(mapS.get(sArr[i]) != tArr[i])
						return false;
				}
				else if(mapT.containsKey(tArr[i])){
					if(mapT.get(tArr[i]) != sArr[i])
						return false;
				}
				else{
					mapS.put(sArr[i], tArr[i]);
					mapT.put(tArr[i], sArr[i]);
				}				
			}
		}
		else{
			return false;
		}
		
		return true;
	}
	
//	public static boolean isIsomorphic(String s, String t) {
//		boolean isIsomorphic = true;
//		
//		if(s!=null && t!=null && s.length()==t.length()){
//			char sArr[] = s.toCharArray();
//			char tArr[] = t.toCharArray();
//			Map<Character, Integer> mapS = new HashMap<>();
//			Map<Character, Integer> mapT = new HashMap<>();
//						
//			for(int i=0;i<sArr.length;i++){
//				if(mapS.containsKey(sArr[i]))
//					mapS.put(sArr[i], (mapS.get(sArr[i])+1));
//				mapS.put(sArr[i], 1);
//			}
//			
//			for(int i=0;i<tArr.length;i++){
//				if(mapT.containsKey(tArr[i]))
//					mapT.put(tArr[i], (mapT.get(tArr[i])+1));
//				mapT.put(tArr[i], 1);
//			}
//			
//			if(mapS.size() != mapT.size()){
//				return false;
//			}
//			
//			Integer arrValuesS[] = mapS.values().toArray(new Integer[mapS.size()]);
//			Integer arrValuesT[] = mapT.values().toArray(new Integer[mapT.size()]);
//			
//			Arrays.sort(arrValuesS);
//			Arrays.sort(arrValuesT);
//			
//			for(int i=0;i<arrValuesS.length;i++){
//				if(arrValuesS[i] != arrValuesT[i]){
//					return false;
//				}
//			}
//		}
//		else{
//			return false;
//		}
//		
//		return isIsomorphic;
//	}
}
