package leetcode.easy;

/*
 * Improve
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		
//		String result = longestCommonPrefix(new String[] {"abcdef","abcde","abcd","abc"});
//		String result = longestCommonPrefix(new String[] {"abcdef","abc","abcd","abcef"});
//		String result = longestCommonPrefix(new String[] {"abcdef","acdebef","abcd","abc"});
//		String result = longestCommonPrefix(new String[] {"abcdef","abcde","abcd","efrtg"});
//		String result = longestCommonPrefix(new String[] {"",""});
//		String result = longestCommonPrefix(new String[] {"abab","aba",""});
		String result = longestCommonPrefix(new String[] {"aca","aba"});
		
		System.out.println(result);
	}

	//21.49%
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length==0){
			return "";
		}
		
		StringBuilder sb = new StringBuilder(strs[0]);
		
		for(int i=1;i<strs.length;i++){
			char arr[] = strs[i].toCharArray();
			if(arr.length>0){
				int j = sb.length()-1;
				for(;j>=0;j--){
					
					for(int k=j;k>=arr.length;k--,j--){
						sb.deleteCharAt(k);
					}
					if(arr[j]!=sb.charAt(j)){
						sb = new StringBuilder(sb.substring(0, j));
					}
				}
			}
			else{
				return "";
			}
		}
		return sb.toString();
	}
}
