package leetcode.easy;

import java.util.Arrays;

public class FindTheDifference {

	public static void main(String[] args) {
		System.out.println(Solution34.findTheDifference("", ""));
		System.out.println(Solution34.findTheDifference("", "w"));
		System.out.println(Solution34.findTheDifference("abcd", "abcde"));
		System.out.println(Solution34.findTheDifference("abcd", "qabcd"));
		System.out.println(Solution34.findTheDifference("abcd", "abrcd"));
	}

}

class Solution34{
    public static char findTheDifference(String s, String t) {
        char ret = 0;

        if(s.length()+1 == t.length()){
        	if(s.length()==0){
        		return t.charAt(0);
        	}
        	
        	char[] sArr = s.toCharArray();
        	char[] tArr = t.toCharArray();
        	
        	Arrays.sort(sArr);
        	Arrays.sort(tArr);
        	
        	for(int i=0;i<sArr.length;i++){
        		if(sArr[i] != tArr[i]){
        			ret = tArr[i];
        			return ret;
        		}
        	}
        	
        	ret = tArr[tArr.length-1];
        }
        
        return ret;
    }
}