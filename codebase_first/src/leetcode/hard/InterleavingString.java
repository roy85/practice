package leetcode.hard;

public class InterleavingString {

	public static void main(String[] args) {
		System.out.println(isInterleave("aabcc","dbbca","aadbbcbcac"));
		System.out.println(isInterleave("aabcc","dbbca","aadbbbaccc"));
		System.out.println(isInterleave("aabcc","","aabcc"));
		System.out.println(isInterleave("aabcc","","aabcca"));
		System.out.println(isInterleave("a","b","a"));
		System.out.println(isInterleave("db","b","cbb"));
	}

	public static boolean isInterleave(String s1, String s2, String s3) {
		
		if(s1 == null || s1.isEmpty()){
			if(s3.equals(s2))
				return true;
			else
				return false;
		}
		if(s2 == null || s2.isEmpty()){
			if(s3.equals(s1))
				return true;
			else
				return false;
		}
		if((s1 == null || s1.isEmpty())&&(s2==null || s2.isEmpty())){
			if(s3==null || s3.isEmpty())
				return true;
			else
				return false;
		}
		if(s1.length()+s2.length()!=s3.length())
			return false;
		
		
		boolean[][] T = new boolean[s1.length()+1][s2.length()+1];
		
		T[0][0] = true;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s3.charAt(i) && T[i][0]){
				T[i+1][0] = true;
			}
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)==s3.charAt(i) && T[0][i]){
				T[0][i+1]=true;
			}
		}
		
		for(int i=1;i<s1.length()+1;i++){
			for(int j=1;j<s2.length()+1;j++){
				if((s1.charAt(i-1) == s3.charAt(i+j-1) && T[i-1][j]) 
						|| (s2.charAt(j-1) == s3.charAt(i+j-1) && T[i][j-1])){
					T[i][j] = true;
				}
			}
		}
		
		if(T[s1.length()][s2.length()])
			return true;
		
		return false;
	}
}
