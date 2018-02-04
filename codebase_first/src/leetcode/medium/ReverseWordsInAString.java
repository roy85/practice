package leetcode.medium;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("this is a String"));
	}
	
	public static String reverseWords(String s){
		StringBuilder SB = new StringBuilder();
		
		String[] arrS = s.trim().split(" ");
		
		for(int i=arrS.length-1;i>=0;i--){
			if(i<arrS.length-1){
				SB.append(" ");
			}
			SB.append(arrS[i]);
		}
		
		return SB.toString().trim();
	}

}
