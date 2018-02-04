package leetcode.easy;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(Solution28.isAnagram("anagram", "nagaram"));
		System.out.println(Solution28.isAnagram("anagram", "nagara"));
		System.out.println(Solution28.isAnagram("", ""));
	}

}

class Solution28{
	
	//Very slow. 78ms
//	public static boolean isAnagram(String s, String t) {
//        boolean isAnagram=true;
//        
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        for(char ch: s.toCharArray()){
//        	if(!map.containsKey(ch)){
//        		map.put(ch, 1);
//        	}
//        	else{
//        		map.put(ch, map.get(ch)+1);
//        	}
//        }
//        for(char ch: t.toCharArray()){
//        	if(map.containsKey(ch)){
//        		if(map.get(ch)>0){
//        			map.put(ch, map.get(ch)-1);
//        		}
//        		else{
//        			isAnagram=false;
//        			break;
//        		}
//        	}
//        	else{
//    			isAnagram=false;
//    			break;
//    		}
//        }
//        for(int value : map.values()){
//        	if(value>0){
//        		isAnagram=false;
//        	}
//        }
//        
//        return isAnagram;
//    }
	
	
    public static boolean isAnagram(String s, String t) {
        boolean isAnagram=true;
        
        if(s.length()==0 && t.length()==0){
        	return true;
        }
        else if(s.length()==0 || t.length()==0 || s.length() !=t.length()){
        	return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
                       
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i=0;i<sArr.length;i++){
        	if(sArr[i]!=tArr[i]){
        		isAnagram = false;
        		break;
        	}
        }
        
        return isAnagram;
    }
}